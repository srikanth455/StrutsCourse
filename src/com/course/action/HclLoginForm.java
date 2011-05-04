package com.course.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class HclLoginForm extends DynaActionForm {

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		set("hclEmpName", "Enter Name");
		set("hclEmpPwd", "Enter Password");
	}
}
