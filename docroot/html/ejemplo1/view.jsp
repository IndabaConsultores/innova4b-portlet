<%@include file="/html/init.jsp" %>

<liferay-portlet:renderURL var="editURL">
	<liferay-portlet:param name="jspPage" value="/html/ejemplo1/edit.jsp"/>
</liferay-portlet:renderURL>
<aui:button-row>
	<aui:button value="add" href="<%=editURL %>"/>
</aui:button-row>



