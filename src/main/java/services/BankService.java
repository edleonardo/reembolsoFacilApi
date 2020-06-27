package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datasource.model.Bank;
import datasource.model.Departament;
import exception.UserNotFoundException;
import repository.BankRepository;
import repository.DepartamentRepository;

@Service
public class BankService {
	@Autowired
	private BankRepository bankRepository;

	public List<Bank> findAllBancos() {
		List<Bank> userList = bankRepository.findAll();
		return userList;
	}
	
	public Bank findById(Long id) throws UserNotFoundException {
		Optional<Bank> optionalBank = getOptional(id);
		Bank bank = null;
		if (!optionalBank.isPresent()) {
			return null;
		} else {
			bank  = optionalBank.get();
		}
		return bank ;
	}


	private Optional<Bank> getOptional(Long id) {
		return bankRepository.findById(id);
	}
	
}