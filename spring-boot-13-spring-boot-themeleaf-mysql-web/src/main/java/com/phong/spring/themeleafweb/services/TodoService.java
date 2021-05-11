package com.phong.spring.themeleafweb.services;

import com.phong.spring.themeleafweb.models.TodoValidator;
import com.phong.spring.themeleafweb.models.todo;
import com.phong.spring.themeleafweb.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private TodoValidator todoValidator;

    public List<todo> findAll(Integer limit){
        return Optional.ofNullable(limit)
                .map(value->todoRepository.findAll(PageRequest.of(0,value)).getContent())
                .orElseGet(()->todoRepository.findAll());
    }
    public todo add(todo todo){
        if(todoValidator.isValid(todo)){
            return todoRepository.save(todo);
        }
        return null;
    }
}
