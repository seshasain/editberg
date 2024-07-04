package com.editberg.controller;

import java.security.Principal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.editberg.entity.User;
import com.editberg.repository.UserRepository;
import com.editberg.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepo;

	@ModelAttribute
	public void commonUser(Principal p, Model m) {
		if (p != null) {
			String email = p.getName();
			User user = userRepo.findByEmail(email);
			m.addAttribute("user", user);
		}

	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@GetMapping("/signin")
	public String login() {
		return "login";
	}

	@GetMapping("/user/profile")
	public String profile(Principal p, Model m) {
		String email = p.getName();
		User user = userRepo.findByEmail(email);
		m.addAttribute("user", user);
		return "profile";
	}

	@GetMapping("/user/home")
	public String home() {
		return "home";
	}

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User user, HttpSession session, Model m) {

		if (userRepo.findByEmail(user.getEmail()) != null)
			session.setAttribute("msg", "User Already Exist");
		else {
			user.setCreatedAt(LocalDateTime.now());
		    user.setRole("ROLE_MEMBER");
			User u = userService.save(user);

			if (u != null) {
				// System.out.println("save sucess");
				session.setAttribute("msg", "Register successfully");

			} else {
				// System.out.println("error in server");
				session.setAttribute("msg", "Something wrong server");
			}
		}
		return "redirect:/register";
	}

}
