package com.smartisan.dagger2;

import javax.inject.Inject;

public class SuperMan {

    @Inject
    public SuperMan() {
    }

    public String fighting(){
        return "欲为大树，莫与草争";
    }
}
