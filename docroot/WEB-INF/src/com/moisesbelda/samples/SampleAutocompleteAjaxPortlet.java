package com.moisesbelda.samples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.sample.model.Poblacion;
import com.liferay.sample.service.PoblacionLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class SampleAutocompleteAjaxPortlet
 */
public class SampleAutocompleteAjaxPortlet extends MVCPortlet {
 
	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {
			
		String cmd = ParamUtil.getString(request, Constants.CMD);
	
		if (cmd.equals("get-data")) {
			getPoblaciones(request,response);
		}
	}
	
	private void getPoblaciones(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {
		
		JSONArray poblacionesJSONArray = JSONFactoryUtil.createJSONArray();
		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		String poblacionDescription = ParamUtil.getString(request, "poblacionDescription");
		
		DynamicQuery poblacionQuery = DynamicQueryFactoryUtil.forClass(Poblacion.class,PortletClassLoaderUtil.getClassLoader());
		Criterion criterion = RestrictionsFactoryUtil.ilike("description",poblacionDescription + StringPool.PERCENT );
		poblacionQuery.add(criterion);
		
		JSONObject poblacionJSON = null;
		try{
			List<Poblacion> listaPoblaciones = PoblacionLocalServiceUtil.dynamicQuery(poblacionQuery);
			for(Poblacion poblacion:listaPoblaciones) {
				poblacionJSON = JSONFactoryUtil.createJSONObject();
				poblacionJSON.put("poblacionId", poblacion.getPoblacionId());
				poblacionJSON.put("poblacionDescription", poblacion.getDescription());
				poblacionesJSONArray.put(poblacionJSON);
			}		
		} catch (Exception ex) {
			
		}
		PrintWriter out = response.getWriter();
		out.println(poblacionesJSONArray);
		
	}
	


}
