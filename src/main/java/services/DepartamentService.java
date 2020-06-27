package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datasource.model.Departament;
import datasource.model.User;
import exception.UserNotFoundException;
import repository.DepartamentRepository;
import repository.UserRepository;
@Service
public class DepartamentService {
	@Autowired
	private DepartamentRepository departamentRepository;

	public List<Departament> findAllDepartaments() {
		List<Departament> userList = departamentRepository.findAll();
		return userList;
	}



	public Departament findById(Long id) throws UserNotFoundException {
		Optional<Departament> optionalDepartament = getOptional(id);
		Departament departament = null;
		if (!optionalDepartament.isPresent()) {
			throw new UserNotFoundException("User not found by ID:" + id);
		} else {
			departament  = optionalDepartament.get();
		}
		return departament ;
	}


	private Optional<Departament> getOptional(Long id) {
		return departamentRepository.findById(id);
	}
	
}
