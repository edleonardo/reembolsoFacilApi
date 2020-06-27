package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datasource.model.Departament;
import datasource.model.DepartamentApprover;
import exception.UserNotFoundException;
import repository.DepartamentApproverRepository;
import repository.DepartamentRepository;
@Service
public class DepartamentApproverService {
	@Autowired
	private DepartamentApproverRepository departamentApproverRepository;


	public DepartamentApprover findById(Long id) throws UserNotFoundException {
		Optional<DepartamentApprover> optionalDepartament = getOptional(id);
		DepartamentApprover departament = null;
		if (!optionalDepartament.isPresent()) {
			throw new UserNotFoundException("User not found by ID:" + id);
		} else {
			departament  = optionalDepartament.get();
		}
		return departament ;
	}


	private Optional<DepartamentApprover> getOptional(Long id) {
		return departamentApproverRepository.findById(id);
	}
	
}