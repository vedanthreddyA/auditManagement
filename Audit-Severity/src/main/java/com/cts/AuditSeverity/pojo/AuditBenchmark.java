package com.cts.AuditSeverity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 *This POJO class is for AuditBenchMark
 *
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuditBenchmark {
	
	/**
	 * Variable auditType is used to store the type of Audit
	 */
	private String auditType;
	/**
	 * Variable accNoAnswers is used to store the No Answers
	 */
	private int accNoAnswers;
	public String getAuditType() {
		return auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}
	public int getAccNoAnswers() {
		return accNoAnswers;
	}
	public void setAccNoAnswers(int accNoAnswers) {
		this.accNoAnswers = accNoAnswers;
	}

	
}

