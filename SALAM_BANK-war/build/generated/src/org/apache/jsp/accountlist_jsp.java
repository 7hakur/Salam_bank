package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class accountlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/db_connection.jsp");
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
      out.write("        box-sizing: border-box;\n");
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
      out.write("            font-size: 14px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .navbar a:hover,.navbar a:active{\n");
      out.write("            border-bottom:  4px solid #007BB7;\n");
      out.write("              opacity: .6;\n");
      out.write("/*            border-bottom: 3px solid brown;*/\n");
      out.write("\n");
      out.write("        }\n");
      out.write("/*        ====New-Account-Design=====*/\n");
      out.write("\n");
      out.write("        .main{\n");
      out.write("            width: 100%;\n");
      out.write("            height: 90vh;\n");
      out.write("            \n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            \n");
      out.write("    \n");
      out.write("        }\n");
      out.write("        .newaccountform{\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            padding-left:100px; \n");
      out.write("            width:500px;\n");
      out.write("            height: 600px;\n");
      out.write("        }\n");
      out.write("        .newaccountform:hover{\n");
      out.write("            border-left: 4px solid #007BB7;\n");
      out.write("            transition: .2s;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .newaccountform div{\n");
      out.write("            margin-top: 25px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("            font-family: inherit;\n");
      out.write("            padding: 1em ;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            border: 1px silver solid;\n");
      out.write("        }\n");
      out.write("        #accounttype{\n");
      out.write("            border: 1px solid silver;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            font-family: inherit;\n");
      out.write("        }\n");
      out.write("        input[type=text],#accounttype{\n");
      out.write("            width: 300px;\n");
      out.write("            height: 35px;\n");
      out.write("   \n");
      out.write("        }\n");
      out.write("        input[type=submit],input[type=reset]{\n");
      out.write("            padding: 16px 50px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 1rem;\n");
      out.write("            background: transparent;\n");
      out.write("            border: 2px solid black; \n");
      out.write("        }\n");
      out.write("        input[type=submit]:hover,input[type=reset]:hover{\n");
      out.write("            background: black;\n");
      out.write("            color: white;\n");
      out.write("            transition: 0.25s;\n");
      out.write("        }\n");
      out.write("        .input {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .input input,#accounttype{\n");
      out.write("            margin-left: 20px;\n");
      out.write("        }\n");
      out.write("        label{\n");
      out.write("            font-family: inherit;\n");
      out.write("            font-size: 1rem;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .newaccountform:last-of-type{\n");
      out.write("            \n");
      out.write("            justify-self:center;\n");
      out.write("            \n");
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
      out.write('\n');
      out.write('\n');

    Connection con=null;
    PreparedStatement st=null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bit_bank";
        String user = "root";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
            
        }
    catch (Exception error) {
       out.print("Unable to connect to the database due some errors "+error);
        }
    


      out.write("\n");
      out.write("<table class=\"tbl1\">\n");
      out.write("    <tr>\n");
      out.write("        <th>No#</th>\n");
      out.write("        <th>Customer</th>\n");
      out.write("        <th>Contact</th>\n");
      out.write("        <th>Passport</th>\n");
      out.write("        <th>Account No</th>\n");
      out.write("        <th>Account Type</th>\n");
      out.write("        <th>Balance</th>\n");
      out.write("        <th>Date    </th>\n");
      out.write("    </tr>\n");
      out.write("</table>");
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
