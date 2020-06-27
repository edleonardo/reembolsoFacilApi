package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import datasource.model.Departament;
import datasource.model.DepartamentApprover;

@Repository
public interface DepartamentApproverRepository extends JpaRepository<DepartamentApprover, Long> {
	
}