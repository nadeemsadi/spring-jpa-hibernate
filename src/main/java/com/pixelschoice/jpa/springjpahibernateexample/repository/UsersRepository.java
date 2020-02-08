package com.pixelschoice.jpa.springjpahibernateexample.repository;

import com.pixelschoice.jpa.springjpahibernateexample.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {


}
