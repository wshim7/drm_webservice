package edu.drm.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.drm.app.dao.UserRepository;
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
	public void saveUser(@RequestBody UserSaveRequestDto dto) {
		userRepository.save(dto.toEntity());
	}
	
}
