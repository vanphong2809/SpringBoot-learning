package com.phong.spring.themeleafweb.repositories;

import com.phong.spring.themeleafweb.models.todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<todo, Long> {
}
