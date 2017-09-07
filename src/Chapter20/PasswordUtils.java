package Chapter20;

import java.util.List;

import chapter20.annotation.UseCase;

public class PasswordUtils {
	@UseCase(id = 47, description = "abc")
	public boolean validatePassword(String pass){
		return pass.matches("\\w*\\d\\W*");
	}
	
	@UseCase(id = 48)
	public String encryptPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}
	
	@UseCase(id = 49, description = "cde")
	public boolean checkForNewPassword(List<String> prev, String pass){
		return !prev.contains(pass);
	}
}
