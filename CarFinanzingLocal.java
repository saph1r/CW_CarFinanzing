package de.fh_dortmund.inf.cw.carFinanzing.server.beans.interfaces;

import javax.ejb.Local;

@Local
public interface CarFinanzingLocal extends CarFinanzing {
	public double computeNetLoanAmount(double price,double firstInstalment);
	public double computeGrossLoanAmount(double price, double firstInstalment, int paymentTerm);
	public double computeMonthlyPayment(double price, double firstInstalment, int paymentTerm);
	public double getInterestRate();
}
