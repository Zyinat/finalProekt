package com.company;

import com.company.model.Gender;
import com.company.model.User;
import com.company.service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        userService.userKoshy(new User(1,"Zyinat",15, Gender.FEMALE));
        userService.userKoshy(new User(2,"Acel",20, Gender.FEMALE));
        userService.userKoshy(new User(3,"Aida",35, Gender.FEMALE));
        userService.idAluu(2);
        System.out.println(userService.idAluu(2));






    }
}
