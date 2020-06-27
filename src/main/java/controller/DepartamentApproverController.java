package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import datasource.model.Departament;
import datasource.model.DepartamentApprover;
import exception.UserNotFoundException;
import services.DepartamentApproverService;
import services.DepartamentService;

@RestController
@RequestMapping(value = "/DepartamentApprover")
public class DepartamentApproverController {
	@Autowired
	private DepartamentApproverService departamentService;

	@GetMapping(path = "/Show/{id}")
	@ResponseBody
	public ResponseEntity<?> findById(@PathVariable(name = "id", required = true) Long id) throws UserNotFoundException {
        DepartamentApprover departament = departamentService.findById(id);
		return new ResponseEntity<>(departament,HttpStatus.OK);

	}
}
