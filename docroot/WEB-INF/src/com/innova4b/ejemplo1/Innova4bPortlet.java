package com.innova4b.ejemplo1;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class Innova4bPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		_log.debug("Estamos en doView");
		super.doView(renderRequest, renderResponse);
	}
	
	Log _log = LogFactoryUtil.getLog(this.getClass());
	
}
