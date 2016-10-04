package de.fh_dortmund.inf.cw.carFinanzing.server.beans;

import javax.annotation.Resource;
import javax.ejb.Stateless;

import de.fh_dortmund.inf.cw.carFinanzing.server.beans.interfaces.CarFinanzingLocal;
import de.fh_dortmund.inf.cw.carFinanzing.server.beans.interfaces.CarFinanzingRemote;

@Stateless
public class CarFinanzingBean implements CarFinanzingLocal, CarFinanzingRemote {

	@Resource
	private double InterestRate;
	
	@Override
	public double computeNetLoanAmount(double price, double firstInstalment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double computeGrossLoanAmount(double price, double firstInstalment, int paymentTerm) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double computeMonthlyPayment(double price, double firstInstalment, int paymentTerm) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

}
