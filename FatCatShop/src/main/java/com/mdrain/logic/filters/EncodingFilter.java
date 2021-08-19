package com.mdrain.logic.filters;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mdrain.logic.PageAccessCollection;

public class EncodingFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest sessionReq = (HttpServletRequest) req;
		HttpServletResponse sessionResp = (HttpServletResponse) resp;
		
		String url = sessionReq.getRequestURI();
		String[] collectionUrlSplit = url.split("/");
		String page = collectionUrlSplit[collectionUrlSplit.length - 1];
		
		ArrayList<String> pageCollection = PageAccessCollection.pageCollection();
		
		for(int i = 0; i < pageCollection.size(); i++) {
			
			if(page.equals(pageCollection.get(i))) {
				if(!this.isAccess(req)) {
					sessionResp.sendRedirect("login.jsp");
					return;
				}
			}	
		}
		
		
		resp.setCharacterEncoding("UTF-8");
	    chain.doFilter(req, resp);
	}
	
	private boolean isAccess(ServletRequest req) {
		
		HttpServletRequest httpReq = (HttpServletRequest) req;
		HttpSession httpSession = httpReq.getSession();
		
		if(httpSession.getAttribute("is_access") != null) {
			return (boolean) httpSession.getAttribute("is_access");
		}
		
		return false;
	}
}
