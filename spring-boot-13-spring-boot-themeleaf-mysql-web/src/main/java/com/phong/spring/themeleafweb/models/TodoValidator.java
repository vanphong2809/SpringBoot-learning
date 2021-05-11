package com.phong.spring.themeleafweb.models;

import org.thymeleaf.util.StringUtils;

import java.util.Optional;

public class TodoValidator {
    public boolean isValid(todo todo){
        return Optional.ofNullable(todo)
                .filter(t->!StringUtils.isEmpty(t.getTitle()))
                .filter(t->!StringUtils.isEmpty(t.getDetail()))
                .isPresent();
    }
}
