package com.lendingpoint.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "UserDataList")
public class CustomerFileDetails {

	@Id
	private String id;
	private String fileName;
	private String loanNumber;
	private String apr;
	private String originator;
	private String originationDate;
	private String interestRate;
	private String originationFee;
	private String outstandingPrincipal;
	private String dueDate;
	private String paymentAmount;
	private String paymentDate;
	private String originalTermOfLoan;
	private String maturityDate;
	private String purchasePrice;
	private String purchaseDate;
	private String state;
	private String riskGrade;
	private String newRenewalFlag;
	private String annualServicingFeeFraction;
	private String originatedFico;
	private String accruedInterest;
	private String originalLoanAmount;

	
}
