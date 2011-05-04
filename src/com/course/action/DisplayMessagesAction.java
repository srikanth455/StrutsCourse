package com.course.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class DisplayMessagesAction extends Action{


	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ActionMessages msgs=new ActionMessages();
		ActionMessage am1=new ActionMessage("error1");
		msgs.add("one",am1);
		ActionMessage am2=new ActionMessage("error2");
		msgs.add("two",am2);
		saveMessages(request, msgs);
		return mapping.findForward("displaymessages");
	}
}
