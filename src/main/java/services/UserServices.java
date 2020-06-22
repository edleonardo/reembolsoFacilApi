package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import datasource.model.User;
import repository.UserRepository;

public class UserServices {
	@Autowired
	private UserRepository userRepository;

	public void create(User user) {
		userRepository.saveAndFlush(user);
	}

	public List<User> findAllRefunds() {
		List<User> userList = userRepository.findAll();
		return userList;
	}

	public User findById(Long id) {
		Optional<User> optionalUser = getOptional(id);
		User user = null;

		user = optionalUser.get();

		return user;
	}

	private Optional<User> getOptional(Long id) {
		return userRepository.findById(id);
	}

	public void delete(Long id) {
		Optional<User> optionalUser = getOptional(id);

		userRepository.delete(optionalUser.get());
	}
}
