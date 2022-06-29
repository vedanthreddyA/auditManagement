package com.cts.AuditSeverity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * 
 * 		This is POJO class for AuditType
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuditType {
	/**
	 * Variable auditType is used to store the Type of Audit
	 */
	private String auditType;

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public AuditType(String auditType)
	{
		this.auditType = auditType;
	}
}
