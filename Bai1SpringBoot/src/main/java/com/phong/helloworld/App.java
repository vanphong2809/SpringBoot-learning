package com.phong.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args){
        ApplicationContext context=SpringApplication.run(App.class,args);
        Outfit outfit=context.getBean(Outfit.class);
        System.out.println("Output Instance: "+outfit);
        outfit.wear();
        Girl girl=context.getBean(Girl.class);
        System.out.println("Girl Instance: "+girl);
        System.out.println("Girl outfit: "+girl.outfit);
        girl.outfit.wear();
    }
}
