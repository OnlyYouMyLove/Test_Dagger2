package com.smartisan.dagger2;

import dagger.Component;

@Component
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
