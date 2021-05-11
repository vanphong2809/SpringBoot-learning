package com.phong.spring.dao.repositories;

import com.phong.spring.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> getByAtk(int atk);
    List<User> getByAgiBetween(int start, int end);
    @Query(value = "select * from user u where u.def=:def", nativeQuery = true)
    User findUserByDefQuery(@Param("def") int def);
    List<User> findAllByAgiGreaterThan(int agiThreshold);
}
