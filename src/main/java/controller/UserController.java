package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import datasource.model.User;
import exception.UserNotFoundException;
import services.UserServices;

@RestController
@RequestMapping(value = "/User")
public class UserController {
	@Autowired
	private UserServices userService;

	@GetMapping(path = "/Show/{id}")
	public User findRefundById(@PathVariable(name = "id", required = true) Long id) throws UserNotFoundException {
		return userService.findById(id);
	}

	@GetMapping(path = "/All")
	public List<User> listAllRefunds() {
		return userService.findAllRefunds();
	}

	@GetMapping(path = "/Authenticate")
	public User authenticate(@RequestBody String Login, String Senha) throws UserNotFoundException {

		return userService.authenticate(Login, Senha);
	}

	@PostMapping(path = "/Create")
	public void salvarNutricionista(@RequestBody User user) {
		userService.create(user);
	}

	@DeleteMapping(path = "/Delete/{id}")
	public void delete(@PathVariable(name = "id", required = true) Long id) throws UserNotFoundException {
		userService.delete(id);
	}
}
