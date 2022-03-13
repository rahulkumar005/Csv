package com.lendingpoint.services;

import com.lendingpoint.Dto.CustomerDto;
import com.lendingpoint.Model.CustomerFileDetails;
import com.lendingpoint.Reader.CsvReader;
import com.lendingpoint.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	public CustomerRepository customerRepository;

	@Override
//	@SchedulerLock(name = "scheduledTaskName")
	public String saveCustomer(CustomerFileDetails customerEntity) {
		String fileName = customerEntity.getFileName();
		List<CustomerDto> list=new ArrayList<>();
		try {
			list = CsvReader.readCsvFile(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (CustomerDto customerDto : list) {
			CustomerFileDetails customerEntity2=new CustomerFileDetails();
			customerEntity2.setFileName(customerEntity.getFileName());
			customerEntity2.setLoanNumber(customerDto.getLoanNumber());
			customerEntity2.setApr(customerDto.getApr());
			customerEntity2.setOriginator(customerDto.getOriginator());
			customerEntity2.setOriginationDate(customerDto.getOriginationDate());
			customerEntity2.setInterestRate(customerDto.getInterestRate());
			customerEntity2.setOriginationFee(customerDto.getOriginationFee());
			customerEntity2.setOutstandingPrincipal(customerDto.getOutstandingPrincipal());
			customerEntity2.setDueDate(customerDto.getDueDate());
			customerEntity2.setPaymentAmount(customerDto.getPaymentAmount());
			customerEntity2.setPaymentDate(customerDto.getPaymentDate());
			customerEntity2.setOriginalTermOfLoan(customerDto.getOriginalTermOfLoan());
			customerEntity2.setMaturityDate(customerDto.getMaturityDate());
			customerEntity2.setPurchasePrice(customerDto.getPurchasePrice());
			customerEntity2.setPurchaseDate(customerDto.getPurchaseDate());
			customerEntity2.setState(customerDto.getState());
			customerEntity2.setRiskGrade(customerDto.getRiskGrade());
			customerEntity2.setNewRenewalFlag(customerDto.getNewRenewalFlag());
			customerEntity2.setAnnualServicingFeeFraction(customerDto.getAnnualServicingFeeFraction());
			customerEntity2.setOriginatedFico(customerDto.getOriginatedFico());
			customerEntity2.setAccruedInterest(customerDto.getAccruedInterest());
			customerEntity2.setOriginalLoanAmount(customerDto.getOriginalLoanAmount());
			customerRepository.save(customerEntity2).subscribe();

		}
		return "success";

	}

}