package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import datasource.model.Departament;
import datasource.model.User;
import exception.UserNotFoundException;
import services.DepartamentService;
import services.UserServices;

@RestController
@RequestMapping(value = "/Departament")
public class DepartamentController {
	@Autowired
	private DepartamentService departamentService;

	@GetMapping(path = "/Show/{id}")
	@ResponseBody
	public ResponseEntity<?> findById(@PathVariable(name = "id", required = true) Long id) throws UserNotFoundException {
        Departament departament = departamentService.findById(id);
		return new ResponseEntity<>(departament,HttpStatus.OK);

	}
	@GetMapping(path = "/All")
	@ResponseBody
	public ResponseEntity<?>  ListallDepartaments() {
		return new ResponseEntity<>(departamentService.findAllDepartaments(),HttpStatus.OK);
		
		
	}

}

