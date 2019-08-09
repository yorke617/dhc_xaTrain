package com.dhc.dhc_xatrain.login;

import com.dhc.dhc_xatrain.BaseController;
import com.dhc.dhc_xatrain.login.loginService.LoginService;
import com.dhc.dhc_xatrain.message.BackForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("login")
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BackForm login(@RequestBody LoginForm form, HttpServletRequest request, HttpServletResponse response){
        try {
            form.setCryptoKey(request.getSession().getAttribute("cryptoKey") + "");
            if (loginService.login(form)){
                return setSuccessful(form);
            }else
                return setError();
        }catch (Exception e){
            return setError(e.getMessage());
        }
    }
    @PostMapping("/getCryptoKey")
    public BackForm getCryptoKey(HttpServletRequest request, HttpServletResponse response){
        LoginForm form = new LoginForm();
        form.setCryptoKey(loginService.getCryptoKey());
        request.getSession(true).setAttribute("cryptoKey", form.getCryptoKey());
        return setSuccessful(form);
    }

    @PostMapping("/register")
    public BackForm register(@RequestBody LoginForm form, HttpServletRequest request, HttpServletResponse response){


        return setSuccessful();
    }


}
