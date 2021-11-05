package main.java.domain;

public class EnergyReading {
	
	
	private EnergyPlan energyPlan;
	private Double totalCost;
	private String meterId;
	private int totalHoursOfUsage;
	
	
	public EnergyPlan getEnergyPlan() {
		return energyPlan;
	}
	public void setEnergyPlan(EnergyPlan energyPlan) {
		this.energyPlan = energyPlan;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	public String getMeterId() {
		return meterId;
	}
	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}
	public int getTotalHoursOfUsage() {
		return totalHoursOfUsage;
	}
	public void setTotalHoursOfUsage(int totalHoursOfUsage) {
		this.totalHoursOfUsage = totalHoursOfUsage;
	}
	
	
	

}
