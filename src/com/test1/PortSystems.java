package com.test1;

public class PortSystems {
	private long portId;
	private long systemId;
	private String ssName;
	private String nameMaxLength;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PortSystems() {

	}

	public PortSystems(long portId, long systemId, String ssName, String nameMaxLength, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.portId = portId;
		this.systemId = systemId;
		this.ssName = ssName;
		this.nameMaxLength = nameMaxLength;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getPortId() {
		return portId;
	}

	public void setPortId(long portId) {
		this.portId = portId;
	}

	public long getSystemId() {
		return systemId;
	}

	public void setSystemId(long systemId) {
		this.systemId = systemId;
	}

	public String getSsName() {
		return ssName;
	}

	public void setSsName(String ssName) {
		this.ssName = ssName;
	}

	public String getNameMaxLength() {
		return nameMaxLength;
	}

	public void setNameMaxLength(String nameMaxLength) {
		this.nameMaxLength = nameMaxLength;
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
