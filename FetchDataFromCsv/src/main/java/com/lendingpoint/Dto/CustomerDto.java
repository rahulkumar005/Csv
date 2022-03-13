package com.lendingpoint.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

	@JsonProperty("Loan_Number")
	private String loanNumber;
	@JsonProperty("APR")
	private String apr;
	@JsonProperty("Originator")
	private String originator;
	@JsonProperty("Origination_Date")
	private String originationDate;
	@JsonProperty("Interest_Rate")
	private String interestRate;
	@JsonProperty("Origination_Fee")
	private String originationFee;
	@JsonProperty("Outstanding_Principal")
	private String outstandingPrincipal;
	@JsonProperty("Due_Date")
	private String dueDate;
	@JsonProperty("Payment_Amount")
	private String paymentAmount;
	@JsonProperty("Payment_Date")
	private String paymentDate;
	@JsonProperty("Original_Term_of_Loan")
	private String originalTermOfLoan;
	@JsonProperty("Maturity_Date")
	private String maturityDate;
	@JsonProperty("Purchase_Price")
	private String purchasePrice;
	@JsonProperty("Purchase_Date")
	private String purchaseDate;
	@JsonProperty("State")
	private String state;
	@JsonProperty("Risk_Grade")
	private String riskGrade;
	@JsonProperty("New_Renewal_Flag")
	private String newRenewalFlag;
	@JsonProperty("Annual_Servicing_Fee_Fraction")
	private String annualServicingFeeFraction;
	@JsonProperty("Originated_FICO")
	private String originatedFico;
	@JsonProperty("Accrued_Interest")
	private String accruedInterest;
	@JsonProperty("Original_Loan_Amount")
	private String originalLoanAmount;

}
