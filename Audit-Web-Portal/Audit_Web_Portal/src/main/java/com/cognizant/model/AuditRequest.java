package com.cognizant.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/*
 * This is a POJO class used to store the Audit related info and responses of questions selected by user
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class AuditRequest {
	/**
	 * Variable projectName is used to store the Name of the Project
	 */
	private String projectName;
	/**
	 * Variable projectManagerName is used to store the Manager Name of the Project
	 */
	private String projectManagerName;
	/**
	 * Variable applicationOwnerName is used to store the Application Owner Name of the Project
	 */
	private String applicationOwnerName;
	/**
	 * Variable auditDetails is used to store the AuditDetails of the Project
	 */
	private AuditDetails auditDetails;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectManagerName() {
		return projectManagerName;
	}
	public void setProjectManagerName(String projectManagerName) {
		this.projectManagerName = projectManagerName;
	}
	public String getApplicationOwnerName() {
		return applicationOwnerName;
	}
	public void setApplicationOwnerName(String applicationOwnerName) {
		this.applicationOwnerName = applicationOwnerName;
	}
	public AuditDetails getAuditDetails() {
		return auditDetails;
	}
	public void setAuditDetails(AuditDetails auditDetails) {
		this.auditDetails = auditDetails;
	}
}
