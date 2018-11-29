package com.smartisan.dagger2;

import dagger.Component;

@Component(modules = SuperManModule.class)
public interface SuperManComponent {
    SuperMan getSuperMan();
}
