package com.cognizant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This is a POJO class used to store the Project related info filled by user
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProjectDetails {
	
	private String projectName;
	
	private String projectManagerName;
	
	private String applicationOwnerName;

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
	
}
