<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<dsp:page>
	<%@page import="java.io.*"%>
	<div class="container">
		<ul id="double" class="link-list">
			<%
				File rootContext = new File(this.getServletContext().getRealPath(""));

					String[] listFiles = rootContext.list();
					int i = 0;
					for (String fileName : listFiles) {
						if (fileName.endsWith("jsp")) {
							i++;
			%>
			<li><a href="./<%=fileName%>" class="arrow"> # <%=fileName%></a></li>
			<%
				}
					}

					if (!(i % 2 == 0)) {
			%>
			<li><a href="#"></a>&nbsp;</li>
			<%
				}
			%>
		</ul><%=rootContext.getAbsolutePath()%>
	</div>
</dsp:page>