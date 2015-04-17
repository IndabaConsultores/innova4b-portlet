<%@include file="/html/init.jsp" %>

<liferay-portlet:actionURL var="addLibroURL" name="addLibro"/>
<aui:form method="post" name="fm" action="<%=addLibroURL%>">

<aui:input name="titulo" type="text">
	<aui:validator  name="required"  errorMessage="Campo requerido" />
</aui:input>
<aui:input name="autor" type="text">
	<aui:validator  name="required"  errorMessage="Campo requerido" />
</aui:input>
<aui:input name="anio" type="text">
	<aui:validator name="number" errorMessage="Debe ser numérico"/>
</aui:input>

<aui:button-row>
	<aui:button type="submit"/>
	<liferay-portlet:renderURL var="backURL"/>
	<aui:button href="<%=backURL%>" value="Atrás"/>
</aui:button-row>
</aui:form>