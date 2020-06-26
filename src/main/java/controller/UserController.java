package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import datasource.model.User;
import exception.UserNotFoundException;
import resource.model.UserResource;
import services.UserServices;

@RestController
@RequestMapping(value = "/User")
public class UserController {
	@Autowired
	private UserServices userService;

	@GetMapping(path = "/Show/{id}")
	@ResponseBody
	public ResponseEntity<?> findById(@PathVariable(name = "id", required = true) Long id) throws UserNotFoundException {
        User user = userService.findById(id);
		return new ResponseEntity<>(user,HttpStatus.OK);

	}

	@GetMapping(path = "/All")
	public List<User> listAllRefunds() {
		return userService.findAllRefunds();
	}

	@GetMapping(path = "/Authenticate")
	@ResponseBody
	public ResponseEntity<?> authenticate( String Login, String Senha) throws UserNotFoundException {
		return new ResponseEntity<>(userService.authenticate(Login, Senha),HttpStatus.OK);

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
