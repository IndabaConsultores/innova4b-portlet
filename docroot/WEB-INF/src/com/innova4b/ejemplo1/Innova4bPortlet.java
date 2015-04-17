package com.innova4b.ejemplo1;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.lang.StringUtils;

import com.innova4b.service.model.Libro;
import com.innova4b.service.service.LibroLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class Innova4bPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		_log.debug("Estamos en doView");
		
		try {
			List<Libro> libros = LibroLocalServiceUtil.getLibros(-1, -1);
			renderRequest.setAttribute("libros", libros);
		} catch (SystemException e) {
			_log.error("Error obteniendo libros", e);
		}
		
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
	
	public void addLibro(ActionRequest actionRequest, ActionResponse actionResponse){
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String titulo = ParamUtil.getString(actionRequest, "titulo","");
		String autor = ParamUtil.getString(actionRequest, "autor","");
		int anio = ParamUtil.getInteger(actionRequest, "anio", 2000);
		
		_log.debug("titulo:" + titulo + "; autor:" + autor +  "; anio:" + anio);
		
		try{
			Libro libro = LibroLocalServiceUtil.createLibro(CounterLocalServiceUtil.increment());
			libro.setTitulo(titulo);
			libro.setAutor(autor);
			libro.setAnio(anio);
			libro.setCompanyId(themeDisplay.getCompanyId());
			libro.setGroupId(themeDisplay.getScopeGroupId());
			LibroLocalServiceUtil.addLibro(libro);
		}
		catch(Exception e){
			_log.error("Error guardando libro", e);
		}
	}
	
	public void deleteLibro(ActionRequest actionRequest, ActionResponse actionResponse){
		
		long libroId = ParamUtil.getLong(actionRequest, "libroId",0);
		if(libroId!=0){
			try{
				LibroLocalServiceUtil.deleteLibro(libroId);
			}
			catch(Exception e){
				_log.error("Error borrando libro", e);
			}
		}
	}
	
	Log _log = LogFactoryUtil.getLog(this.getClass());
	
}
