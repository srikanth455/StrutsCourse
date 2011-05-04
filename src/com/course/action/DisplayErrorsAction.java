package com.course.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class DisplayErrorsAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ActionErrors aes=new ActionErrors();
		ActionError ae1=new ActionError("error1");
		aes.add("one",ae1);
		ActionError ae2=new ActionError("error2");
		aes.add("two",ae2);
		saveErrors(request, aes);
		return mapping.findForward("displayerror");
	}
}
