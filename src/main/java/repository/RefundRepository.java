package repository;

import datasource.model.Refund;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RefundRepository extends JpaRepository<Refund, Long> {
	@Query("SELECT r FROM REFUND WHERE r.user = ?1")
    List<Refund> findByUser(Long user);
	
	@Query("SELECT r FROM REFUND WHERE r.status in (2, 3)")
	List<Refund> listFinishOrApproveRefund();
}
