package com.sebastian_daschner.learning_java_ee.control;

import com.sebastian_daschner.learning_java_ee.entity.Color;

import javax.enterprise.inject.Produces;

public class DefaultColorExposer {

    @Produces
    @Diesel // @Named("diesel")
    public Color exposeDefaultColor() {
        // ...
        return Color.RED;
    }

}
