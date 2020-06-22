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
import services.UserServices;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserServices userService;

	@GetMapping(path = "show/{id}")
	public User findRefundById(@PathVariable(name = "id", required = true) Long id) {
		return userService.findById(id);
	}

	@GetMapping(path = "/all")
	public List<User> listAllRefunds() {
		return userService.findAllRefunds();
	}

	@PostMapping(path = "/save")
	public void salvarNutricionista(@RequestBody User user) {
		userService.create(user);
	}

	@DeleteMapping(path = "/delete/{id}")
	public void delete(@PathVariable(name = "id", required = true) Long id) {
		userService.delete(id);
	}
}
