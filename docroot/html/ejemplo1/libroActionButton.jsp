<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@include file="/html/init.jsp" %>
<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Libro libro = (Libro) row.getObject();
%>

<liferay-ui:icon-menu>
	<liferay-portlet:actionURL var="deleteLibroURL" name="deleteLibro">
		<liferay-portlet:param name="libroId" value="<%=String.valueOf(libro.getLibroId())%>"/>
	</liferay-portlet:actionURL>
	<liferay-ui:icon image="delete" message="DELETE"
		url="<%=deleteLibroURL.toString()%>" />
		
	<liferay-portlet:renderURL var="editLibroURL">
		<liferay-portlet:param name="mvcPath" value="/html/ejemplo1/edit.jsp"/>
		<liferay-portlet:param name="libroId" value="<%=String.valueOf(libro.getLibroId())%>"/>
	</liferay-portlet:renderURL>
	<liferay-ui:icon image="edit" message="EDIT"
		url="<%=editLibroURL.toString()%>" />
</liferay-ui:icon-menu>