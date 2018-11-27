package com.smartisan.dagger2;

import dagger.Component;

@Component(modules = GsonModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
