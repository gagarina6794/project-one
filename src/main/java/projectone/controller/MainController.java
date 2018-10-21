package projectone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import projectone.model.User;
import projectone.repository.UserRepository;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/test")
    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }
}
