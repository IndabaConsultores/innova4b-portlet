<%@include file="/html/init.jsp" %>

<%
String nombre = ParamUtil.getString(request, "nombre");
String saludo = portletPreferences.getValue("saludo", "Hola ");
%>

<liferay-portlet:renderURL var="renderURL"/>
<aui:form action="<%=renderURL%>" method="post" name="name">

<aui:input name="nombre"/>

<aui:button-row>
	<aui:button type="submit"></aui:button>
</aui:button-row>
</aui:form>

<%if(!StringUtils.isEmpty(nombre)){ %>
<%=saludo %> <%=nombre%>!
<%} %>


<hr/>

<liferay-portlet:actionURL  var="accion1URL" name="accion1"/>
<aui:form action="<%= accion1URL %>" method="post" name="fm1">

    <aui:input name="valor1" type="text"/>

    <aui:button-row>
       <aui:button type="submit" />
    </aui:button-row>
</aui:form>

<hr/>

<liferay-portlet:actionURL  var="accion2URL" name="accion2"/>
<aui:form action="<%= accion2URL %>" method="post" name="fm2">

    <aui:input name="valor2" type="text"/>

    <aui:button-row>
       <aui:button type="submit" />
    </aui:button-row>
</aui:form>



