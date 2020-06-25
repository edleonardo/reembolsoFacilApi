package controller;

import datasource.model.Refund;
import exception.RefundNotFoundException;
import services.RefundServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Refund")
public class RefundController {

	@Autowired
	private RefundServices refundService;

	@GetMapping(path = "/Show/{id}")
	public Refund findRefundById(@PathVariable(name = "id", required = true) Long id) throws RefundNotFoundException {
		return refundService.findById(id);
	}

	@GetMapping(path = "/List/{id}")
	public List<Refund> listByUser(@PathVariable(name = "user", required = true) Long user)
			throws RefundNotFoundException {
		return refundService.findByUser(user);
	}
	
	@GetMapping(path = "/FinishOrApprove")
	public List<Refund> listFinishOrApprove() throws RefundNotFoundException {
		return refundService.listFinishOrApprove();
	}
	
	
	@PutMapping(path = "/Approve/{id}")
	public Refund approve(@PathVariable(name = "id", required = true) Long id) throws RefundNotFoundException {
		return refundService.update(id, 2);
	}

	@PutMapping(path = "/Finish/{id}")
	public Refund finish(@PathVariable(name = "id", required = true) Long id) throws RefundNotFoundException {
		return refundService.update(id, 3);
	}
	
	@PostMapping(path = "/Create")
	public void salvarNutricionista(@RequestBody Refund refund) {
		refundService.create(refund);
	}

	@DeleteMapping(path = "/Delete/{id}")
	public void delete(@PathVariable(name = "id", required = true) Long id) throws RefundNotFoundException {
		refundService.delete(id);
	}
}
