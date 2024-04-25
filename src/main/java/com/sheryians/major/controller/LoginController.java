package com.sheryians.major.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sheryians.major.repository.RoleRepository;
import com.sheryians.major.repository.UserRepository;
import com.sheryians.major.global.GlobalData;
import com.sheryians.major.model.Role;
import com.sheryians.major.model.User;

@Controller
public class LoginController {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/login")
    public String login() {
        GlobalData.cart.clear();
        return "login";
    }

    @GetMapping("/register")
    public String registerGet() {
        return "register";
    }

    // @PostMapping("/register")
    // public String registerPost(@ModelAttribute("user") User user, HttpServletRequest request) throws ServletException {
    //     String password = user.getPassword();
    //     user.setPassword(bCryptPasswordEncoder.encode(password));
    //     List<Role> roles = new ArrayList<>();
    //     roles.add(roleRepository.findById(2).get());
    //     user.setRoles(roles);
    //     userRepository.save(user);
    //     request.login(user.getEmail(), password);
    //     return "redirect:/";
    // }

    @PostMapping("/register")
    public String registerPost(@ModelAttribute("user") User user, HttpServletRequest request) throws ServletException {
        String password = user.getPassword();
        user.setPassword(bCryptPasswordEncoder.encode(password));

        // Check if the user is registering as a freelancer
        boolean isFreelancer = "freelancer".equals(user.getRoleType()); // Assuming "freelancer" is the value when freelancer is selected

        // Fetch the appropriate role based on whether the user is a freelancer or not
        Role role = isFreelancer ? roleRepository.findById(1).orElse(null) : roleRepository.findById(2).orElse(null);
        
        // If the role is null, handle it accordingly (e.g., throw an exception or assign a default role)
        if (role == null) {
            // Handle the case where the role is not found
        }

        List<Role> roles = new ArrayList<>();
        roles.add(role);
        user.setRoles(roles);

        userRepository.save(user);
        request.login(user.getEmail(), password);
        return "redirect:/";
    }
}
