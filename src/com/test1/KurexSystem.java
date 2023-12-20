package com.test1;

public class KurexSystem {
	private long systemCode;
	private String KCounterParty;
	private String KtKInstance;
	private String PrimaryAccountType;
	private String KCostCenter;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public KurexSystem() {

	}

	public KurexSystem(long systemCode, String kCounterParty, String ktKInstance, String primaryAccountType,
			String kCostCenter, String creationDate, String modifiedDate, String entityState) {
		super();
		this.systemCode = systemCode;
		KCounterParty = kCounterParty;
		KtKInstance = ktKInstance;
		PrimaryAccountType = primaryAccountType;
		KCostCenter = kCostCenter;
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

	public String getKCounterParty() {
		return KCounterParty;
	}

	public void setKCounterParty(String kCounterParty) {
		KCounterParty = kCounterParty;
	}

	public String getKtKInstance() {
		return KtKInstance;
	}

	public void setKtKInstance(String ktKInstance) {
		KtKInstance = ktKInstance;
	}

	public String getPrimaryAccountType() {
		return PrimaryAccountType;
	}

	public void setPrimaryAccountType(String primaryAccountType) {
		PrimaryAccountType = primaryAccountType;
	}

	public String getKCostCenter() {
		return KCostCenter;
	}

	public void setKCostCenter(String kCostCenter) {
		KCostCenter = kCostCenter;
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
