/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.62
 * Generated at: 2015-06-23 09:39:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bg_002dland_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>管理员登录</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #f0f0f0;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style></head>\r\n");
      out.write(" <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write(" <script language=\"javascript\">\r\n");
      out.write(" function checkEmpty(){\r\n");
      out.write(" if(document.form.account.value==\"\"){\r\n");
      out.write("  window.alert(\"请输入管理员账号\")\r\n");
      out.write("   document.form.account.focus();\r\n");
      out.write("   return false;\r\n");
      out.write(" }\r\n");
      out.write(" if(document.form.password.value==\"\"){\r\n");
      out.write(" window.alert(\"请输入管理员密码\")\r\n");
      out.write(" document.form.password.focus();\r\n");
      out.write(" return false;\r\n");
      out.write(" }\r\n");
      out.write(" return true;\r\n");
      out.write(" } \r\n");
      out.write(" \r\n");
      out.write(" </script>\r\n");
      out.write("<body> \r\n");
      out.write("<table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<form name=\"form\" method=\"post\" action=\"managerAction.do?action=0\" onSubmit=\"return checkEmpty()\">\r\n");
      out.write("<table width=\"547\" height=\"294\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" background=\"image/bg-land.jpg\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"125\">&nbsp;</td>\r\n");
      out.write("    <td width=\"422\" valign=\"bottom\"><table width=\"411\" border=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"55\" height=\"38\"><font color=\"#9A6634\"><strong>用户名：</strong></font>          </td>\r\n");
      out.write("        <td width=\"104\"><input name=\"account\" type=\"account\" class=\"bgtext\" size=\"15\"></td>\r\n");
      out.write("        <td width=\"45\">&nbsp;<font color=\"#9A6634\"><strong>密码：</strong></font>          </td>\r\n");
      out.write("        <td width=\"113\"><input name=\"password\" type=\"password\" class=\"bgtext\" size=\"15\"></td>\r\n");
      out.write("        <td width=\"72\"><div align=\"right\">\r\n");
      out.write("          <input name=\"Submit\" type=\"image\" class=\"bgButtoninput\" src=\"image/bg-land.gif\" >\r\n");
      out.write("        </div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"30\" colspan=\"5\"><div align=\"right\"><a href=\"index.jsp\" class=\"a1\">返回</a>&nbsp;&nbsp;</div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}