package edu.drm.app.presentation;

import edu.drm.app.dao.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserSaveRequestDto {

	private String username;
	
	private String password;
	
	private String email;
	
	private String phoneNumber;
	
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(password)
				.email(email)
				.phoneNumber(phoneNumber)
				.build();
	}
}
