package com.shchepinms.intellij_git_test;

public class UsefulClass {
    public static void main(String[] args) {
        System.out.println("Very useful class :D");
        System.out.println("Add some changes...");
        System.out.println("Excellent.");
        System.out.println("1");
        System.out.println("2");
        UsefulInterface usefulChecker = new UsefulInterfaceImpl();
        if (usefulChecker.isUseful())
            System.out.println("Its truly useful! Awesome!");
        if (usefulChecker.isUsefulClass(OneMoreUsefulClass.class))
            System.out.println("Its truly useful class! God bless you!");
    }
}
