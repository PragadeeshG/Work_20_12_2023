package com.test1;

public class DTSSystem {
	private long systemCode;
	private long bifurcationAccId;
	private long bifurcationAccNum;
	private String sysCostCentre;
	private String foreignCurr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DTSSystem() {

	}

	public DTSSystem(long systemCode, long bifurcationAccId, long bifurcationAccNum, String sysCostCentre,
			String foreignCurr, String creationDate, String modifiedDate, String entityState) {
		super();
		this.systemCode = systemCode;
		this.bifurcationAccId = bifurcationAccId;
		this.bifurcationAccNum = bifurcationAccNum;
		this.sysCostCentre = sysCostCentre;
		this.foreignCurr = foreignCurr;
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

	public long getBifurcationAccId() {
		return bifurcationAccId;
	}

	public void setBifurcationAccId(long bifurcationAccId) {
		this.bifurcationAccId = bifurcationAccId;
	}

	public long getBifurcationAccNum() {
		return bifurcationAccNum;
	}

	public void setBifurcationAccNum(long bifurcationAccNum) {
		this.bifurcationAccNum = bifurcationAccNum;
	}

	public String getSysCostCentre() {
		return sysCostCentre;
	}

	public void setSysCostCentre(String sysCostCentre) {
		this.sysCostCentre = sysCostCentre;
	}

	public String getForeignCurr() {
		return foreignCurr;
	}

	public void setForeignCurr(String foreignCurr) {
		this.foreignCurr = foreignCurr;
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
