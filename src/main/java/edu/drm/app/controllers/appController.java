package edu.drm.app.controllers;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.drm.app.dao.UserRepository;
import edu.drm.app.dao.model.User;
import edu.drm.app.presentation.UserSaveRequestDto;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class appController {

	private UserRepository userRepository;
	
	@GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
	
	@PostMapping("/user")
	public User saveUser(@RequestBody UserSaveRequestDto dto) {
		return userRepository.save(dto.toEntity());
	}
	
	/*@GetMapping(value = "/")
	public String index() {
		OAuth2User user = getCurrentUser();
		return "Hello " + user.getAttributes().get("name") + ". Your email is " + user.getAttributes().get("email")
				  + " and your profile picture is <img src='"+user.getAttributes().get("picture")+"' /> <br />"
				  + "<a href='/logout'>logout</a>";
	}
	
	public OAuth2User getCurrentUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return ((OAuth2AuthenticationToken)auth).getPrincipal();
	}*/
}
