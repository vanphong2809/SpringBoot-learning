package com.phong.helloworld;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Bikini implements Outfit{
    @Override
    public void wear() {
        System.out.println("Mac bikini");
    }
}
