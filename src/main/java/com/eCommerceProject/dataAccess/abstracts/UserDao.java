package com.eCommerceProject.dataAccess.abstracts;

import com.eCommerceProject.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    User getById(int id);
}