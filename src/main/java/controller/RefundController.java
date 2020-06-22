package controller;

import datasource.model.Refund;
import services.RefundServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/refund")
public class RefundController {

	@Autowired
	private RefundServices refundService;

	@GetMapping(path = "show/{id}")
	public Refund findRefundById(@PathVariable(name = "id", required = true) Long id) {
		return refundService.findById(id);
	}

	@GetMapping(path = "/all")
	public List<Refund> listAllRefunds() {
		return refundService.findAllRefunds();
	}

	@PostMapping(path = "/save")
	public void salvarNutricionista(@RequestBody Refund refund) {
		refundService.create(refund);
	}

	@DeleteMapping(path = "/delete/{id}")
	public void delete(@PathVariable(name = "id", required = true) Long id) {
		refundService.delete(id);
	}
}
