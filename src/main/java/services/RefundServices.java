package services;

import datasource.model.Refund;
import exception.RefundNotFoundException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.RefundRepository;

@Service
public class RefundServices {

	@Autowired
	private RefundRepository refundRepository;

	public void create(Refund refund) {
		refundRepository.saveAndFlush(refund);
	}

	public List<Refund> findByUser(Long user) throws RefundNotFoundException {
		List<Refund> refundList = refundRepository.findByUser(user);

		if (refundList.isEmpty()) {
			return null;
		} else {
			return refundList;
		}
	}
	public List<Refund> findByApprover(Long user) throws RefundNotFoundException {
		List<Refund> refundList = refundRepository.findByApprover(user);

		if (refundList.isEmpty()) {
			return null;
		} else {
			return refundList;
		}
	}
	public Refund findById(Long id) throws RefundNotFoundException {
		Optional<Refund> optionalRefund = getOptional(id);
		Refund refund = null;

		if (!optionalRefund.isPresent()) {
			throw new RefundNotFoundException("Refund not found by ID:" + id);
		} else {
			refund = optionalRefund.get();
		}

		return refund;
	}

	public Refund update(Long id, int status) throws RefundNotFoundException {
		Optional<Refund> optionalRefund = getOptional(id);
		Refund refund = null;

		if (!optionalRefund.isPresent()) {
			throw new RefundNotFoundException("Refund not found by ID:" + id);
		} else {
			refund = optionalRefund.get();
		
			refund.setStatus(status);
			refundRepository.saveAndFlush(refund);
		}

		return refund;
	}

	private Optional<Refund> getOptional(Long id) {
		return refundRepository.findById(id);
	}

	public void delete(Long id) throws RefundNotFoundException {
		Optional<Refund> optionalRefund = getOptional(id);

		if (!optionalRefund.isPresent()) {
			throw new RefundNotFoundException("Refund not found by ID:" + id);
		} else {
			refundRepository.delete(optionalRefund.get());
		}
	}

	public List<Refund> listFinishOrApprove() throws RefundNotFoundException {
		
		List<Refund> refundList = refundRepository.listFinishOrApproveRefund();
		if (refundList.isEmpty()) {
			return null;
		} else {
			return refundList;
		}
	}
}
