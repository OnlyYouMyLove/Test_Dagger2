package com.smartisan.dagger2;

import javax.inject.Inject;

import dagger.Component;

@Component
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
