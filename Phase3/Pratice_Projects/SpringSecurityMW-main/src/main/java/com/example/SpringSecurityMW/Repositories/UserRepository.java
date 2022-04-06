package com.example.SpringSecurityMW.Repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.SpringSecurityMW.Entities.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
public Optional<User> findUserByName(String name); 
}
