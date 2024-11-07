package org.example.project.services;

import org.example.project.models.User;

public class UserService {
    public static void printUserName(User user) {
        System.out.println("User Name: " + user.getName());
    }

    public static void main(String args[]) {
        User user = new User("Kanchan");
        printUserName(user);
    }
}