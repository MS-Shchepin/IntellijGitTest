package com.shchepinms.intellij_git_test;

import java.lang.reflect.Method;

public interface UsefulInterface {
    void usefulMethod();

    boolean isUseful();

    boolean isUsefulClass(Class<?> clazz);

    void checkAwesome(Method method);
}
