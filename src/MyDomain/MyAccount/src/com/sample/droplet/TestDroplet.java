package com.sample.droplet;

import java.io.IOException;

import javax.servlet.ServletException;

import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

/**
 * MyAccountDroplet.
 */
public class TestDroplet extends DynamoServlet {

	@Override
	public void service(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse)
			throws ServletException, IOException {

		logInfo(pRequest.getParameter("name"));

		pResponse.getWriter().write("<h1>Hello, " + name + "!!!</h1>");
		pResponse.getWriter().write("I am running with ATG....");
		pResponse.flushBuffer();
		return;
	}

	String name = null;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}