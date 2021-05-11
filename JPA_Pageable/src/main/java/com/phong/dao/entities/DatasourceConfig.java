//package com.phong.dao.entities;
//
//import com.phong.dao.repositories.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.PostConstruct;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//@Configuration
//@RequiredArgsConstructor
//public class DatasourceConfig {
//    private final UserRepository userRepository;
//    @PostConstruct
//    public void initData() {
//        userRepository.saveAll(IntStream.range(0, 100)
//                .mapToObj(i -> User.builder()
//                        .name("name-" + i)
//                        .build())
//                .collect(Collectors.toList())
//        );
//    }
//}
