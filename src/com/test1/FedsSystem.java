package com.test1;

public class FedsSystem {
	private long systemCode;
	private String fedsInstance;
	private String hedgeCalculation;
	private String hedgeAccounting;
	private String hedgeAccountingType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FedsSystem() {

	}

	public FedsSystem(long systemCode, String fedsInstance, String hedgeCalculation, String hedgeAccounting,
			String hedgeAccountingType, String creationDate, String modifiedDate, String entityState) {
		super();
		this.systemCode = systemCode;
		this.fedsInstance = fedsInstance;
		this.hedgeCalculation = hedgeCalculation;
		this.hedgeAccounting = hedgeAccounting;
		this.hedgeAccountingType = hedgeAccountingType;
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

	public String getFedsInstance() {
		return fedsInstance;
	}

	public void setFedsInstance(String fedsInstance) {
		this.fedsInstance = fedsInstance;
	}

	public String getHedgeCalculation() {
		return hedgeCalculation;
	}

	public void setHedgeCalculation(String hedgeCalculation) {
		this.hedgeCalculation = hedgeCalculation;
	}

	public String getHedgeAccounting() {
		return hedgeAccounting;
	}

	public void setHedgeAccounting(String hedgeAccounting) {
		this.hedgeAccounting = hedgeAccounting;
	}

	public String getHedgeAccountingType() {
		return hedgeAccountingType;
	}

	public void setHedgeAccountingType(String hedgeAccountingType) {
		this.hedgeAccountingType = hedgeAccountingType;
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
