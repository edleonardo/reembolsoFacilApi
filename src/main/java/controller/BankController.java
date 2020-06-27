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
import datasource.model.Departament;
import exception.UserNotFoundException;
import services.BankService;
import services.DepartamentService;

@RestController
@RequestMapping(value = "/Bank")
public class BankController {
	@Autowired
	private BankService bankService;

	@GetMapping(path = "/Show/{id}")
	@ResponseBody
	public ResponseEntity<?> findById(@PathVariable(name = "id", required = true) Long id) throws UserNotFoundException {
        Bank bank = bankService.findById(id);
		return new ResponseEntity<>(bank,HttpStatus.OK);

	}
	@GetMapping(path = "/All")
	@ResponseBody
	public ResponseEntity<?>  ListallBanco() {
		return new ResponseEntity<>(bankService.findAllBancos(),HttpStatus.OK);
		
		
	}
}
