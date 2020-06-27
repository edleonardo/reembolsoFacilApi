package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import datasource.model.Bank;
import datasource.model.TypeRefund;

@Repository
public interface TypeRefundRepository extends JpaRepository<TypeRefund, Long> {
	
}

