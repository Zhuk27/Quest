package com.javarush.module3.project3.quest.service;

import com.javarush.module3.project3.quest.entity.User;

public class Authorization extends Command {
    private final UserService userService;

    public Authorization(UserService userService) {
        this.userService = userService;
    }


    public boolean logInAcc(String login, String password) {
        boolean isContainSpacesOrEmptyLogPass = isContainSpacesOrEmptyAny(login, password);
        boolean containsLogin = userService.isContainsLogin(login);
        if (isContainSpacesOrEmptyLogPass || !containsLogin) {
            return false;
        } else {
            return passwordVerification(login, password);
        }
    }

    public boolean createAcc(String login, String password) {
        boolean isContainSpacesOrEmptyLogPass = isContainSpacesOrEmptyAny(login, password);
        if (isContainSpacesOrEmptyLogPass || userService.isContainsLogin(login)) {
            return false;
        } else {
            userService.createUser(new User(login, password));
            return true;
        }
    }

    private boolean passwordVerification(String login, String password) {
        User user = userService.get(login);
        return user.getPassword().equals(password);
    }


}
