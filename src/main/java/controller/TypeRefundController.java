package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import datasource.model.Bank;
import exception.UserNotFoundException;
import services.BankService;
import services.TypeRefundService;

@RestController
@RequestMapping(value = "/TypeRefund")
public class TypeRefundController {
	@Autowired
	private TypeRefundService typeRefundService;

	@GetMapping(path = "/All")
	@ResponseBody
	public ResponseEntity<?>  findAllTipos() {
		return new ResponseEntity<>(typeRefundService.findAllTipos(),HttpStatus.OK);
		
		
	}
}
