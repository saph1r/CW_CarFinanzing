package de.fh_dortmund.inf.cw.carFinanzing.server.beans.interfaces;

public interface CarFinanzing {
	public double computeNetLoanAmount(double price,double firstInstalment);
	public double computeGrossLoanAmount(double price, double firstInstalment, int paymentTerm);
	public double computeMonthlyPayment(double price, double firstInstalment, int paymentTerm);
	public double getInterestRate();
}
