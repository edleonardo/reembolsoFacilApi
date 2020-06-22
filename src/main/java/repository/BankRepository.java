package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import datasource.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Long>  {
    
}
