package com.project.bookjuck;

import com.project.bookjuck.user.model.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
public class CsUtils {
    @Autowired
    private HttpSession hs;

    public void setLoginUser(CustomerEntity entity){
        hs.setAttribute(Const.LOGIN_USER,entity);
    }

    public CustomerEntity getLoginUser(){
        return (CustomerEntity) hs.getAttribute(Const.LOGIN_USER);
    }

    public int getLoginUserPk(){
        CustomerEntity loginUser = getLoginUser();
        return loginUser == null ? 0 : loginUser.getIuser();
    }
}
