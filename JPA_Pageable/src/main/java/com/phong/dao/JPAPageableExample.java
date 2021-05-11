package com.phong.dao;

import com.phong.dao.entities.User;
import com.phong.dao.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class JPAPageableExample {
    public static void main(String[] args){
        SpringApplication.run(JPAPageableExample.class,args);
    }
    private final UserRepository userRepository;
    @Bean
    CommandLineRunner run(){
        return args -> {
            //Lay ra 10 user dau tien
            Page<User> page=userRepository.findAll(PageRequest.of(0,10));
            System.out.println("In ra 10 user dau tien: ");
            page.forEach(System.out::println);
            //Lay ra 10 user tiep theo
            page=userRepository.findAll(page.nextPageable());
            System.out.println("In ra 10 user tiep theo");
            page.forEach(System.out::println);

            System.out.println("In ra tong so luong o page hien tai: "+page.getSize());
            System.out.println("In ra tong so user: "+page.getTotalElements());
            System.out.println("In ra tong so page: "+page.getTotalPages());
            //Lay ra 5 user o page 1, sap xep theo ten
            page=userRepository.findAll(PageRequest.of(1,5,Sort.by("name").descending()));
            System.out.println("In ra 5 user o page 1, sap xep theo ten");
            page.forEach(System.out::println);

            //Custom method
            List<User> user=userRepository.findAllByNameLike("name-11");
            System.out.println(user);
        };
    }
}
