<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %> 
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@page import="com.liferay.portal.kernel.util.Constants"%>

<portlet:defineObjects />

<portlet:actionURL name="action" var="actionURL" />

<portlet:resourceURL var="getDataURL">
		<portlet:param name="<%=Constants.CMD%>" value="get-data" />
</portlet:resourceURL>


<aui:form action="<%=actionURL %>" method="post" name="fm" autocomplete="off">	
	<aui:input id="poblacionAutocomplete" name="poblacionAutocomplete" label="Población" type="text" helpMessage="Introduzca nombre de poblacion" />
	<aui:input id="poblacionId" name="poblacionId" type="hidden"/>
	<aui:button-row>
		<aui:button type="submit"/>
	</aui:button-row>
</aui:form>

<aui:script>
AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-hightlighters',function(A){	
	var poblacionData;	
	new A.AutoCompleteList({		
		activateFirstItem: 'true',
		inputNode: '#<portlet:namespace />poblacionAutocomplete',
		resultTextLocator:'poblacionDescription',		
		render:'true',
		resultHighlighter:'phraseMatch',
		resultFilters:['phraseMatch'],
		source:function(){			
			var inputValue = A.one('#<portlet:namespace/>poblacionAutocomplete').get('value');
			var ajaxRequest = A.io.request('<%=getDataURL.toString() %>',{
								dataType: 'json',
								method:'POST',
								data:{
									<portlet:namespace/>poblacionDescription:inputValue,
								},
								autoLoad:false,
								sync:false,
								on:{
									success:function(){
										poblacionData = this.get('responseData');										
									}	
								}
							});
			ajaxRequest.start();
			return poblacionData;
			},
		on:{
			select:function(itemNode) {				
				<portlet:namespace />poblacionId.value = itemNode.result.raw.poblacionId;
			}
		}
	});
});
</aui:script>