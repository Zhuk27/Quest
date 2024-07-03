package com.javarush.module3.project3.quest.repository;

import com.javarush.module3.project3.quest.entity.User;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class UserRepository implements Repository<User> {
    private final ConcurrentHashMap<String, User> userHashMap = new ConcurrentHashMap<>();
    private final Set<String> loginsSet = new ConcurrentSkipListSet<>();

    public boolean isContainsLogin(String login) {
        return loginsSet.contains(login);
    }

    @Override
    public void create(User user) {
        userHashMap.put(user.getLogin(), user);
        loginsSet.add(user.getLogin());
    }

    @Override
    public void update(User user) {
        userHashMap.put(user.getLogin(), user);
    }

    @Override
    public void delete(User user) {
        userHashMap.remove(user.getLogin());
    }

    public User get(String login) {
        return userHashMap.get(login);
    }


    @Override
    public Collection<User> getAll() {
        return userHashMap.values();
    }
}
