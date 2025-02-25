package repository;

import datasource.model.Refund;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface RefundRepository extends JpaRepository<Refund, Long> {
	@Query("SELECT r FROM Refund r WHERE r.users = ?1")
    List<Refund> findByUser(Long user);
	
	@Query("SELECT r FROM Refund r WHERE r.Approver = ?1")
    List<Refund> findByApprover(Long user);
	
	@Query("SELECT r FROM Refund r WHERE r.Status in (2, 3)")
	List<Refund> listFinishOrApproveRefund();
}
