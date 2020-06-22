package services;

import datasource.model.Refund;

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

	public List<Refund> findAllRefunds() {
		List<Refund> refundList = refundRepository.findAll();
		return refundList;
	}

	public Refund findById(Long id) {
		Optional<Refund> optionalRefund = getOptional(id);
		Refund refund = null;

		refund = optionalRefund.get();

		return refund;
	}

	private Optional<Refund> getOptional(Long id) {
		return refundRepository.findById(id);
	}

	public void delete(Long id) {
		Optional<Refund> optionalRefund = getOptional(id);

		refundRepository.delete(optionalRefund.get());
	}
}
