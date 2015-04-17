<%@page import="com.innova4b.service.service.LibroLocalServiceUtil"%>
<%@include file="/html/init.jsp" %>

<%
long libroId = ParamUtil.getLong(renderRequest, "libroId", 0);
Libro libro= null;
if(libroId!=0){
	try {
		libro = LibroLocalServiceUtil.getLibro(libroId);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
%>

<liferay-portlet:actionURL var="saveLibroURL" name="saveLibro"/>
<aui:form method="post" name="fm" action="<%=saveLibroURL%>">
<aui:input name="libroId" type="hidden" value="<%=libroId%>"/>

<aui:input name="titulo" type="text" value='<%=libro!=null?libro.getTitulo():""%>'>
	<aui:validator  name="required"  errorMessage="Campo requerido" />
</aui:input>
<aui:input name="autor" type="text" value='<%=libro!=null?libro.getAutor():""%>'>
	<aui:validator  name="required"  errorMessage="Campo requerido" />
</aui:input>
<aui:input name="anio" type="text" value='<%=libro!=null?String.valueOf(libro.getAnio()):""%>'>
	<aui:validator name="number" errorMessage="Debe ser numérico"/>
</aui:input>

<aui:button-row>
	<aui:button type="submit"/>
	<liferay-portlet:renderURL var="backURL"/>
	<aui:button href="<%=backURL%>" value="Atrás"/>
</aui:button-row>
</aui:form>