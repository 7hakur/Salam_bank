package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<style>\n");
      out.write("    @import url('https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600&display=swap');\n");
      out.write("    body{\n");
      out.write("        background:appworkspace;\n");
      out.write("        font-family: 'Inter', sans-serif;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        }\n");
      out.write("        header{\n");
      out.write("            margin-top: 8px;\n");
      out.write("            display:flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-around;\n");
      out.write("            \n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        header img{\n");
      out.write("            width: 250px;\n");
      out.write("                 \n");
      out.write("        }\n");
      out.write("        header img:hover{\n");
      out.write("        box-shadow: -1px 200px 114px -56px rgba(0,123,183,0.25);\n");
      out.write("        -webkit-box-shadow: -1px 200px 114px -56px rgba(0,123,183,0.25);\n");
      out.write("        -moz-box-shadow: -1px 200px 114px -56px rgba(0,123,183,0.25);}\n");
      out.write("        .navbar a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin-left: 25px;\n");
      out.write("            padding: 8px 0 ;\n");
      out.write("            color: black;\n");
      out.write("            font-size: 1rem;\n");
      out.write("            font-weight: bold;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .navbar a:hover{\n");
      out.write("            border-bottom:  4px solid #007BB7;\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            opacity: .6;\n");
      out.write("/*            border-bottom: 3px solid brown;*/\n");
      out.write("\n");
      out.write("        }\n");
      out.write("            \n");
      out.write("            \n");
      out.write(" \n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <img src=\"./images/logo.png\" alt=\"logo\"/>\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("        <a href=\"index.jsp\">Home</a>\n");
      out.write("        <a href=\"newaccount.jsp\">Open account</a>\n");
      out.write("        <a href=\"deposit.jsp\">Cash deposit</a>\n");
      out.write("        <a href=\"withdraw.jsp\">Cash withdraw</a>\n");
      out.write("        <a href=\"checkbalance.jsp\">Balance</a>\n");
      out.write("        <a href=\"statement.jsp\">Account statement</a>\n");
      out.write("        <a href=\"accountoaccount.jsp\">Account to account</a>\n");
      out.write("        \n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("</body>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
