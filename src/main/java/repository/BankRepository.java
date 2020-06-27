package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import datasource.model.Bank;
import datasource.model.Departament;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
	
}
