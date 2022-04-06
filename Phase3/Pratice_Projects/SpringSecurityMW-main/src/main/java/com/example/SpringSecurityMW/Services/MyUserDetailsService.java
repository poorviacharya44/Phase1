package com.example.SpringSecurityMW.Services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.SpringSecurityMW.Entities.MyUserDetails;
import com.example.SpringSecurityMW.Entities.User;
import com.example.SpringSecurityMW.Repositories.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
@Autowired
UserRepository userRepo;
public User GetUserByName(String name) {
Optional<User> user = userRepo.findUserByName(name);
if(!user.isPresent()) throw new RuntimeException();
return user.get();
}
@Override
public org.springframework.security.core.userdetails.UserDetails 
loadUserByUsername(String username)
throws UsernameNotFoundException {
return new MyUserDetails(GetUserByName(username));
}
}
