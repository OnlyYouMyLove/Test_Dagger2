package com.smartisan.dagger2;

import dagger.Component;

@ApplicationScope
@Component(modules = GsonModule.class)
public interface ActivityComponent  {
    void inject(MainActivity mainActivity);
    void inject(SecondActivity mainActivity);
}
