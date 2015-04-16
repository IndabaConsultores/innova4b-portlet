<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>

<portlet:defineObjects />

<%
String nombre = ParamUtil.getString(request, "nombre");
%>


<liferay-portlet:renderURL var="renderURL"/>
<aui:form action="<%=renderURL%>" method="post" name="name">

<aui:input name="nombre"/>

<aui:button-row>
	<aui:button type="submit"></aui:button>
</aui:button-row>
</aui:form>

<%if(nombre!=null){ %>
Hola <%=nombre%>!
<%} %>
