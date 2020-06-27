package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import datasource.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query("SELECT u FROM User u where u.Login = ?1 and u.Senha = ?2")
	Optional<User> authenticate(String login, String senha);
	
	@Query("SELECT u FROM User u where u.Login = ?1 and u.Senha = ?2")
	Optional<User> Menu(Long id);
}
