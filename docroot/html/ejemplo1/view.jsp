<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.innova4b.service.model.Libro"%>
<%@page import="java.util.List"%>
<%@include file="/html/init.jsp" %>

<liferay-portlet:renderURL var="editURL">
	<liferay-portlet:param name="jspPage" value="/html/ejemplo1/edit.jsp"/>
</liferay-portlet:renderURL>
<aui:button-row>
	<aui:button value="add" href="<%=editURL %>"/>
</aui:button-row>

<%
List<Libro> libros = (List<Libro>)renderRequest.getAttribute("libros");
%>


<liferay-ui:search-container delta="10" emptyResultsMessage="no-libros-were-found" total="<%=libros.size() %>">
	<liferay-ui:search-container-results
		results="<%=libros%>"/>
		
		<liferay-ui:search-container-row
			className="com.innova4b.service.model.Libro"
			keyProperty="libroId"
			modelVar="libro">
			
			<liferay-ui:search-container-column-text
				name="name"
				value="<%= libro.getTitulo() %>"/>
			<liferay-ui:search-container-column-text
				name="autor"
				value="<%= libro.getAutor() %>"/>
			<liferay-ui:search-container-column-text
				name="año"
				value="<%= String.valueOf(libro.getAnio()) %>"/>
			
		</liferay-ui:search-container-row>
		

	<liferay-ui:search-iterator />
</liferay-ui:search-container>






