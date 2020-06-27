package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import datasource.model.Departament;
import datasource.model.Refund;

@Repository
public interface DepartamentRepository extends JpaRepository<Departament, Long> {
	
}
