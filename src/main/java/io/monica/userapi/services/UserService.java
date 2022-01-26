package io.monica.userapi.services;

import io.monica.userapi.models.User;
import io.monica.userapi.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    public void deleteById(String id){
        userRepository.deleteById(id);
    }

    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    public User edit(User user){
       return userRepository.save(user);
    }

}



