package com.software.pojo;

public class Efficient {
	private double taxRate;
	private double pensionRateByE;
    private double pensionRateByC;
    private double medicRateByE;
    private double medicRateByC;
    private double unempRateByE;
    private double unempRateByC;
    private double injuryRateByC;
    private double fertiRateByC;
    private double proFundRateByE;
    private double proFundRateByC;
    
    private double moneyofSick;
    private double moneyofBusy;
    private double moneyofLate;
    private double moneyofOvertime;
   
  
    public double getMoneyofSick() {
		return moneyofSick;
	}


	public void setMoneyofSick(double moneyofSick) {
		this.moneyofSick = moneyofSick;
	}


	public double getMoneyofBusy() {
		return moneyofBusy;
	}


	public void setMoneyofBusy(double moneyofBusy) {
		this.moneyofBusy = moneyofBusy;
	}


	public double getMoneyofLate() {
		return moneyofLate;
	}


	public void setMoneyofLate(double moneyofLate) {
		this.moneyofLate = moneyofLate;
	}


	public double getMoneyofOvertime() {
		return moneyofOvertime;
	}


	public void setMoneyofOvertime(double moneyofOvertime) {
		this.moneyofOvertime = moneyofOvertime;
	}


	public Efficient(){
    
    }
    
    
	public double getTaxRate(){
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	public double getPensionRateByE() {
		return pensionRateByE;
	}
	public void setPensionRateByE(double pensionRateByE) {
		this.pensionRateByE = pensionRateByE;
	}
	public double getPensionRateByC() {
		return pensionRateByC;
	}
	public void setPensionRateByC(double pensionRateByC) {
		this.pensionRateByC = pensionRateByC;
	}
	public double getMedicRateByE() {
		return medicRateByE;
	}
	public void setMedicRateByE(double medicRateByE) {
		this.medicRateByE = medicRateByE;
	}
	public double getMedicRateByC() {
		return medicRateByC;
	}
	public void setMedicRateByC(double medicRateByC) {
		this.medicRateByC = medicRateByC;
	}
	public double getUnempRateByE() {
		return unempRateByE;
	}
	public void setUnempRateByE(double unempRateByE) {
		this.unempRateByE = unempRateByE;
	}
	public double getUnempRateByC() {
		return unempRateByC;
	}
	public void setUnempRateByC(double unempRateByC) {
		this.unempRateByC = unempRateByC;
	}
	public double getInjuryRateByC() {
		return injuryRateByC;
	}
	public void setInjuryRateByC(double injuryRateByC) {
		this.injuryRateByC = injuryRateByC;
	}
	public double getFertiRateByC() {
		return fertiRateByC;
	}
	public void setFertiRateByC(double fertiRateByC) {
		this.fertiRateByC = fertiRateByC;
	}
	public double getProFundRateByE() {
		return proFundRateByE;
	}
	public void setProFundRateByE(double proFundRateByE) {
		this.proFundRateByE = proFundRateByE;
	}
	public double getProFundRateByC() {
		return proFundRateByC;
	}
	public void setProFundRateByC(double proFundRateByC) {
		this.proFundRateByC = proFundRateByC;
	}
	
	public int getTaxMoney(int basicSalary){
		return (int)(basicSalary*this.taxRate);
	}
	
//	 /**
//     * @return the money of pension insurance by employee
//     */
//	public int getPensionByE(int basicSalary){
//		return (int)(basicSalary*this.pensionRateByE);
//	}
//	
//	public int getPensionByC(int basicSalary) {
//	    return (int)(basicSalary * this.pensionRateByC);
//	}
//
//	    /**
//	     * @return the money of medical insurance by employee
//	     */
//	public int getMedicByE(int basicSalary) {
//	    return (int)(basicSalary * this.medicRateByE);
//	}
//
//	    /**
//	     * @return the money of medical insurance by company
//	     */
//	public int getMedicByC(int basicSalary) {
//	    return (int)(basicSalary *this.medicRateByC);
//	}
//
//	    /**
//	     * @return the money of unemployment insurance by employee
//	     */
//    public int getUnemployByE(int basicSalary) {
//	    return (int)(basicSalary * this.unempRateByE);
//	}
//
//	    /**
//	     * @return the money of medical insurance by company
//	     */
//	public int getUnemployByC(int basicSalary) {
//	    return (int)(basicSalary * this.unempRateByC);
//	}
//
//	    /**
//	     * @return the money of injury insurance by company
//	     */
//	public int getInjuryByC(int basicSalary) {
//	    return (int)(basicSalary * this.injuryRateByC);
//	}
//
//	    /**
//	     * @return the money of fertility insurance by company
//	     */
//	public int getFertiByC(int basicSalary) {
//	    return (int)(basicSalary * this.fertiRateByC);
//	}
//
//	    /**
//	     * @return the money of house provident fund by employee
//	     */
//	public int getProFundByE(int basicSalary) {
//	    return (int)(basicSalary * this.proFundRateByE);
//	}
//
//	    /**
//	     * @return the money of house provident fund by company
//	     */
//	public int getProFundByC(int basicSalary) {
//	    return (int)(basicSalary * this.proFundRateByC);
//	}

}
