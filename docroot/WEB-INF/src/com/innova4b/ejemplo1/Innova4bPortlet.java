package com.innova4b.ejemplo1;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.lang.StringUtils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class Innova4bPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		_log.debug("Estamos en doView");
		super.doView(renderRequest, renderResponse);
	}
	
	public void accion1(ActionRequest actionRequest, ActionResponse actionResponse){
		String valor1 = ParamUtil.getString(actionRequest, "valor1","");
		if(!StringUtils.isEmpty(valor1)){
			_log.debug("Accion1: Guardamos en BDD el valor " +  valor1);
		}else{
			SessionErrors.add(actionRequest, "err1");
		}
		
	}
	
	public void accion2(ActionRequest actionRequest, ActionResponse actionResponse){
		String valor2 = ParamUtil.getString(actionRequest, "valor2","");
		if(!StringUtils.isEmpty(valor2)){
			_log.debug("Accion2: Guardamos en BDD el valor " +  valor2);
		}else{
			SessionErrors.add(actionRequest, "err2");
		}
	}
	
	Log _log = LogFactoryUtil.getLog(this.getClass());
	
}
