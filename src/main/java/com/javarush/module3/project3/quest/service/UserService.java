package com.javarush.module3.project3.quest.service;

import com.javarush.module3.project3.quest.entity.User;
import com.javarush.module3.project3.quest.repository.UserRepository;

import java.util.Collection;

public enum UserService {
    USER_SERVICE;
    private final UserRepository repository = new UserRepository();

    public void createUser(User user) {
        repository.create(user);
    }

    public boolean isContainsLogin(String login) {
        return repository.isContainsLogin(login);
    }

    public void updateUser(User user) {
        repository.update(user);
    }

    public void delete(User user) {
        repository.delete(user);
    }

    public User get(String login) {
        return repository.get(login);
    }

    public Collection<User> getAll() {
        return repository.getAll();
    }
}
