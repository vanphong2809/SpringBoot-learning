package com.phong.spring;

import com.phong.spring.dao.entities.User;
import com.phong.spring.dao.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@RequiredArgsConstructor
public class App {
    public static void main(String[] args){
        ApplicationContext context=SpringApplication.run(App.class, args);
        UserRepository userRepository=context.getBean(UserRepository.class);

        System.out.println("Tim user voi agi trong khoa 30-50");
        userRepository.getByAgiBetween(30,50).forEach(System.out::println);
        System.out.println("======================================");
        System.out.println("Tim cac user co agi lon hon 96");
        userRepository.findAllByAgiGreaterThan(96).forEach(System.out::println);
        System.out.println("======================================");
        System.out.println("Tim user co atk=68");
        userRepository.getByAtk(68).forEach(System.out::println);
        System.out.println("======================================");
        System.out.println("Lay ra user co def=22");
        User user=userRepository.findUserByDefQuery(22);
        System.out.println("User: "+user);

    }
}
