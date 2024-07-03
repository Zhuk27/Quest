package com.javarush.module3.project3.quest.service;

public class Command {
    public String getJsp(String nameJsp) {
        return String.format("WEB-INF/%s.jsp", nameJsp);
    }

    public boolean isContainSpacesOrEmpty(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        return str.matches(".*\\s.*");
    }

    public boolean isContainSpacesOrEmptyAny(String str1, String str2) {
        return isContainSpacesOrEmpty(str1) || isContainSpacesOrEmpty(str2);
    }
}
