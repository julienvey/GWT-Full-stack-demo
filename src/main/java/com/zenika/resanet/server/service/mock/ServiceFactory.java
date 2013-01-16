package com.zenika.resanet.server.service.mock;

import com.zenika.resanet.server.service.UserService;

public class ServiceFactory {

    private static UserService userService;

    public static UserService getUserService(){
        if(userService == null){
            userService = new UserServiceImpl();
        }
        return userService;
    }
}
