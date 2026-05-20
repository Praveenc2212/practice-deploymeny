package com.cp.demo.repository;


import com.cp.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface StudentRepository extends JpaRepository<Users, Long> {

}
