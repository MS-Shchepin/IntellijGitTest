package com.shchepinms.intellij_git_test;

import java.lang.reflect.Method;

public class UsefulInterfaceImpl implements UsefulInterface {

    private static final int BENEFIT = 9000;
    @Override
    public void usefulMethod() {
        System.out.println("Useful information");
    }

    @Override
    public boolean isUseful() {
        return BENEFIT != 0;
    }

    @Override
    public boolean isUsefulClass(Class<?> clazz) {
        Method[] methods = clazz.getMethods();
        for (Method method :
                methods) {
            if (method.getName().contains("Useful"))
                return true;
        }
        return false;
    }
}
