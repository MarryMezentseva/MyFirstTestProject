package com.masha.myFirstTestProject.genericsExample;

import com.masha.myFirstTestProject.genericsExample.types.Pet;

public class UsePet <T extends Pet> {

    public void use(T t){
        System.out.println("Use: " + t);
    }

    public void getVoice(T t){
        t.voice();
    }
}
