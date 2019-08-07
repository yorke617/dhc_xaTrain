$(document).ready(function () {
    $("#login").on("click", login);
    $("#loginForm input").on("change", changeInput);
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
    var data = {'username': username, password:password};
    $.ajax({
        url: "/dhc/login/login",
        data: JSON.stringify(data),
        contentType: "application/json;charset=UTF-8",
        type: "post",
        timeout: 10000,
        dataType: "json",
        async:true,
        success: function(res){
            if (res.success){
                alert("登录成功");
            } else{
                alert(res.message);
            }

            //render other page
        },
        error:function(e){
            console.log(e);
        }
    })

}