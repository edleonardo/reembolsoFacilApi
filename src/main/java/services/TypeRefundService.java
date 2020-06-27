package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datasource.model.Bank;
import datasource.model.TypeRefund;
import exception.UserNotFoundException;
import repository.BankRepository;
import repository.TypeRefundRepository;

@Service
public class TypeRefundService {
	@Autowired
	private TypeRefundRepository typeRefundRepository;

	public List<TypeRefund> findAllTipos() {
		List<TypeRefund> userList = typeRefundRepository.findAll();
		return userList;
	}
	
}
