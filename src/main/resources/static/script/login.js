var cryptoKey = "";
$(document).ready(function () {
    $("#login").on("click", login);
    $("#loginForm input").on("change", changeInput);
    //获取加密因子
    request("/login/getCryptoKey", null, function (re) {
        if (re.success) {
            cryptoKey = re.returnMsg.cryptoKey;
        } else {
            alert("获取加密因子失败！");
        }
    })
})

function changeInput() {
    var value = $(this).val();
    if (value != ""){
        $(this).next().text("");
    }
}

function login() {
    var username = $("#username").val();
    var password = $("#password").val();
    if (username == ""){
        $("#username").next().text("用户名不能为空！");
        return;
    }else{
        $("#username").next().text("");
    }
    if (password == ""){
        $("#password").next().text("密码不能为空！");
        return;
    }else{
        $("#password").next().text("");
    }
    password = encode(password, cryptoKey);
    console.log(password);

    var data = {'username': username, password:password};
    // $.ajax({
    //     url: "/dhc/login/login",
    //     data: JSON.stringify(data),
    //     contentType: "application/json;charset=UTF-8",
    //     type: "post",
    //     timeout: 10000,
    //     dataType: "json",
    //     async:true,
    //     success: function(res){
    //         if (res.success){
    //             alert("登录成功");
    //         } else{
    //             alert(res.message);
    //         }
    //
    //         //render other page
    //     },
    //     error:function(e){
    //         console.log(e);
    //     }
    // })
    request("/login/login", data, function (re) {
        if (re.success){
            alert("登录成功");
        } else{
            alert(re.message);
        }
    })

}