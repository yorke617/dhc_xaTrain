var cryptoKey = "";
$(document).ready(function () {
    $("#login").on("click", login);
    $("#register").on("click", register);
    $("#registerBtn").on("click", registerBtn);
    $("#loginForm input").on("change", changeInput);
    $("#rePassword").on("change", rePassword);
    $("#confirmRePassword").on("change", confirmRePassword);
    $(".confirmPwd").on("change", confirmPwd);
    $("#reMail").on("change", reMail);
    //获取加密因子
    request("/login/getCryptoKey", null, function (re) {
        if (re.success) {
            cryptoKey = re.returnMsg.cryptoKey;
        } else {
            alert("获取加密因子失败！");
        }
    })
})

function registerBtn() {
    //检验页面是否存在error
    // var errorText = $("#registerForm .error").text();
    // if (errorText != ""){
    //     alert("请检查页面上所有的错误提示！");
    //     return;
    // }
    if (!allVerify()) return;
    //收集数据
    var data = {};
    $("#registerForm input").each(function () {
        data[$(this).attr("id")] = $(this).val();
    })
    // $("#registerForm select").each(function () {
    //     data[$(this).attr("id")] = $(this).val();
    // })
    // $("#registerForm textarea").each(function () {
    //     data[$(this).attr("id")] = $(this).val();
    // })
    // $(this).is(":checked")
    // console.log(data);

    //发送请求
    request("/login/register", data, function (re) {
        if (re.success){
            $("#registerForm").hide();
            $("#loginForm").show();
            alert("注册成功");
        } else{
            alert(re.message);
        }
    })

}

function allVerify() {
    return reMail() && rePassword() && confirmRePassword() && confirmPwd();
}

function reMail() {
    var mail = $("#reMail").val();
    var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
    if (!reg.test(mail)) {
        $("#reMail").next().text("邮箱地址格式不正确！");
        return false;
    }else {
        $("#reMail").next().text("");
        return true;
    }
}

function rePassword() {
    var rePassword = $("#rePassword").val();
    if (rePassword == ""){
        $("#rePassword").next().text("密码不能为空！");
         return false;
    }else {
        $("#rePassword").next().text("");
        return true;
    }
    if (rePassword.length < 6) {
        $("#rePassword").next().text("密码长度不够6位！");
        return false;
    } else {
        $("#rePassword").next().text("");
        return true;
    }

}
function confirmRePassword() {
    var confirmRePassword = $("#confirmRePassword").val();
    if (confirmRePassword == ""){
        $("#confirmRePassword").next().text("确认密码不能为空！");
        return false;
    }else {
        $("#confirmRePassword").next().text("");
        return true;
    }
}

/**
 * 检验两次密码是否一致
 */
function confirmPwd() {
    // document.getElementById("rePassword").value;
    var rePassword = $("#rePassword").val();
    var confirmRePassword = $("#confirmRePassword").val();
    if (confirmRePassword != rePassword) {
        $("#confirmRePassword").next().text("确认密码与密码不一致！");
        return false;
    }else {
        $("#confirmRePassword").next().text("");
        return  true;
    }
}

function register() {
    $("#loginForm").hide();
    $("#registerForm").show();
}

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
            // $("#loginForm").hide();
            // $("#registerForm").hide();
            /*
            <ul>
                <li url=""><i class=""></i>菜单1</li>
                <li url=""><i class=""></i>菜单1</li>
                <li url=""><i class=""></i>菜单1</li>
            </ul>
             */
            var menuHtml = "<ul>";
            for (i = 0; i < re.returnMsg.menusList.length; i++) {
                menuHtml += ('<li url="' + re.returnMsg.menusList[i].menuUrl
                    + '"><i class="' + re.returnMsg.menusList[i].icon + '"></i>'
                    + re.returnMsg.menusList[i].menuName + '</li>');
            }
            menuHtml += "</ul>";

            $("#body").html($("#index").html(menuHtml));
            alert("登录成功");
        } else{
            alert(re.message);
        }
    })

}