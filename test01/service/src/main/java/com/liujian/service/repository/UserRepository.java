package com.liujian.service.repository;

import com.liujian.service.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


   User findByUserId(Integer id) ;

   @Query(value = "select * from user u where u.sex=:sex",nativeQuery = true)
    List<User> findUserBySex(@Param("sex") String sex);
}
