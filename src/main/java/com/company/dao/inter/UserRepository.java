package com.company.dao.inter;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByName(String name);
    User findByNameAndSurname(String name,String surname);

    @Query(value = "select u from User u where u.email=?1")
    User findByEmail(String email);
}
