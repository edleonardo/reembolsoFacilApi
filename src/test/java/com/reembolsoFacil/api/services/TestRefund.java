package com.reembolsoFacil.api.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import datasource.model.Refund;
import exception.RefundNotFoundException;
import repository.RefundRepository;
import services.RefundServices;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class TestRefund {

	@Autowired
	RefundServices service;

	@Autowired
	private RefundRepository refundRepository;

	private Refund resource;

	@Before
	public void setUp() {
		resource = new Refund();
		resource.SetCnpj("5555.5555/55");
		resource.SetDescription("Teste");
		resource.SetJustification("Teste");
		resource.SetLocation("Teste");
		resource.SetStatus("1");
		resource.SetUser(9);
		resource.SetApprover(7);
		resource.SetType(1);
		resource.SetFlowPhase(null);
	}

	@After
	public void delete() {
		service.delete((long) resource.GetId());
	}

	@Test
	public void createTest() {
		service.create(resource);

		Refund refund = refundRepository.findAll().stream().filter(ref -> ref.getDescription().equals("Teste"))
				.findFirst().get();

		assertEquals("Teste", refund.getCodigoRegistro());
		assertEquals("Teste", refund.getNome());
		assertEquals("5555.5555/55", refund.getCnpj());
	}

	@Test
	public void listAllRefunds() throws RefundNotFoundException {
		List<Refund> refundList = service.findByUser((long) 7);
		List<Refund> refundListDatabase = refundRepository.findByUser((long) 7);

		Refund refundService = refundList.stream().filter(ref -> ref.getDescription.equals("Mc donalds")).findFirst()
				.get();
		Refund refundDatabase = refundList.stream().filter(ref -> ref.getDescription.equals("Mc donalds")).findFirst()
				.get();

		assertNotNull(Objects.nonNull(refundList));
		assertEquals(refundDatabase.getDescription(), refundService.getDescription());
		assertEquals(refundDatabase.getLocation(), refundService.getLocation());
		assertEquals(refundDatabase.getApprover(), refundService.getApprover());
		assertEquals(refundDatabase.getId(), refundService.getId());
		assertEquals(refundList.size(), refundListDatabase.size());
	}

	@Test
	public void showRefund() throws RefundNotFoundException {
		Refund refund = service.findById((long) resource.GetId());

		assertEquals("Teste", refund.getCodigoRegistro());
		assertEquals("Teste", refund.getNome());
		assertEquals("5555.5555/55", refund.getCnpj());
	}

	@Test
	public void deleteRefund() throws RefundNotFoundException {
		Refund refund = service.delete((long) resource.GetId());

		Optional<Refund> optionalRefund = refundRepository.findById((long) resource.GetId());

		assertFalse(optionalRefund.isPresent());

	}

}
