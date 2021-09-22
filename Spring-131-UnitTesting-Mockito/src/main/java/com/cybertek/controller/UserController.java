package com.cybertek.controller;

import com.ticketing.dto.UserDTO;
import com.ticketing.service.RoleService;
import com.ticketing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user",new UserDTO());
        model.addAttribute("roles",roleService.listAllRoles());
        model.addAttribute("users",userService.ListAllUSer());

        return "user/create";
    }

    @PostMapping("/create")
    public String insertUser(UserDTO user,Model model){

        userService.save(user);
//        model.addAttribute("user",new UserDTO());
//        model.addAttribute("roles",roleService.findAll());
//        model.addAttribute("users",userService.findAll());
        //<< these lines are not need so that user/create one also has same lines. >>


        return "redirect:/user/create";
    }


    @GetMapping("/update/{username}")
    public String editUsername(@PathVariable("username") String username, Model model ){

//        model.addAttribute("user",userService.findById(username));
//        model.addAttribute("users",userService.findAll());
//        model.addAttribute("roles",roleService.findAll());

        return "/user/update";
    }

    @PostMapping("/delete/{username}")
    public String updateUser(@PathVariable("username") String username, UserDTO user,Model model){
        //userService.update(user);


//        model.addAttribute("user",new UserDTO());
//        model.addAttribute("roles",roleService.findAll());
//        model.addAttribute("users",userService.findAll());
        //<< these lines are not need so that user/create one also has same lines. >>

        return "redirect:/user/create";

    }
    @GetMapping("/delete/{username}")
   public String deleteUser(@PathVariable("username") String username){

//        userService.deleteById(username);
        return "redirect:/user/create";
    }
}
