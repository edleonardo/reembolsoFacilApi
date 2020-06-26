package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datasource.model.User;
import exception.UserNotFoundException;
import repository.UserRepository;
@Service
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

	public User findById(Long id) throws UserNotFoundException {
		Optional<User> optionalUser = getOptional(id);
		User user = null;
		if (!optionalUser.isPresent()) {
			throw new UserNotFoundException("User not found by ID:" + id);
		} else {
			user = optionalUser.get();
		}
		return user;
	}

	public User authenticate(String login, String senha) throws UserNotFoundException {
		Optional<User> optionalUser = userRepository.authenticate(login, senha);
		User user = null;
		
		if (!optionalUser.isPresent()) {
			throw new UserNotFoundException("Access Denied");
		} else {
			user = optionalUser.get();
		}
		
		return user;		
	}

	private Optional<User> getOptional(Long id) {
		return userRepository.findById(id);
	}

	public void delete(Long id) throws UserNotFoundException {
		Optional<User> optionalUser = getOptional(id);

		if (!optionalUser.isPresent()) {
			throw new UserNotFoundException("User not found by ID:" + id);
		} else {
			userRepository.delete(optionalUser.get());
		}
	}
}
