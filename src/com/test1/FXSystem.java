package com.test1;

public class FXSystem {
	private long systemCode;
	private long mxInstanceCode;
	private long mxAlmCode;
	private String capitalInvestor;
	private String ruleVlidation;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FXSystem() {

	}

	public FXSystem(long systemCode, long mxInstanceCode, long mxAlmCode, String capitalInvestor, String ruleVlidation,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.systemCode = systemCode;
		this.mxInstanceCode = mxInstanceCode;
		this.mxAlmCode = mxAlmCode;
		this.capitalInvestor = capitalInvestor;
		this.ruleVlidation = ruleVlidation;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(long systemCode) {
		this.systemCode = systemCode;
	}

	public long getMxInstanceCode() {
		return mxInstanceCode;
	}

	public void setMxInstanceCode(long mxInstanceCode) {
		this.mxInstanceCode = mxInstanceCode;
	}

	public long getMxAlmCode() {
		return mxAlmCode;
	}

	public void setMxAlmCode(long mxAlmCode) {
		this.mxAlmCode = mxAlmCode;
	}

	public String getCapitalInvestor() {
		return capitalInvestor;
	}

	public void setCapitalInvestor(String capitalInvestor) {
		this.capitalInvestor = capitalInvestor;
	}

	public String getRuleVlidation() {
		return ruleVlidation;
	}

	public void setRuleVlidation(String ruleVlidation) {
		this.ruleVlidation = ruleVlidation;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
