function encode(word, key) {
    if(key == null){
        key = CryptoJS.enc.Utf8.parse('o7H8uIM2O5qv65l2');//秘钥
    }else{
        key = CryptoJS.enc.Utf8.parse(key);//秘钥
    }
    var srcs = CryptoJS.enc.Utf8.parse(word);
    var encrypted = CryptoJS.AES.encrypt(srcs, key, {mode:CryptoJS.mode.ECB,padding: CryptoJS.pad.Pkcs7});
    return encrypted.toString();
}

function request(url, data, backCall) {
    if (data == null)
        data = {};
    $.ajax({
        url: "/dhc" + url,
        data: JSON.stringify(data),
        contentType: "application/json;charset=UTF-8",
        type: "post",
        timeout: 10000,
        dataType: "json",
        async:true,
        success: function(res){
            if (typeof(backCall) == "function") {
                backCall(res);
            }
        },
        error:function(e){
            alert(e);
        }
    })
}
