package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import datasource.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	@Query("SELECT u FROM users where u.login = ?1 and u.senha = ?2")
	Optional<User> authenticate(String login, String senha);
}
