package com.course.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class EmployeeLoginForm extends ActionForm {
	private String employeeName;
	private String employeePwd;
	private String submit;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePwd() {
		return employeePwd;
	}

	public void setEmployeePwd(String employeePwd) {
		this.employeePwd = employeePwd;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		employeeName = "Enter Name";
		employeePwd = "Enter Password";
	}

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors aes = new ActionErrors();
		if (employeeName.length() < 6) {
			ActionError ae1 = new ActionError("name.minlength");
			aes.add("employeeName", ae1);
		}
		if (employeePwd.length() < 6) {
			ActionError ae2 = new ActionError("pwd.minlength");
			aes.add("employeePwd", ae2);
		}
		return aes;
	}
}
