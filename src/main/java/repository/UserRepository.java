package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import datasource.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
