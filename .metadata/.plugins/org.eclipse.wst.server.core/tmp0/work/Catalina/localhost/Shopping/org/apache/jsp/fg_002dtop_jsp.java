/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.62
 * Generated at: 2015-06-24 06:19:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.wy.domain.MemberForm;

public final class fg_002dtop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("</head>\r\n");

  String memberlink="connection.jsp";
  String orderlink="connection.jsp";
  String shoppinglink="connection.jsp";
  MemberForm form=null;
  if(session.getAttribute("form")!=null){
  form=(MemberForm)session.getAttribute("form");
  memberlink="memberAction.do?action=5&id="+form.getId();
  orderlink="cart_detail.jsp";
  shoppinglink="cart_see.jsp";
  }

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"800\" height=\"26\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" background=\"image/fg_top01.jpg\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"627\">&nbsp;</td>\r\n");
      out.write("    <td width=\"139\" valign=\"top\"><table width=\"125\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"70\" height=\"23\" valign=\"bottom\"><font color=\"#FFFFFF\"><a href=\"#\" class=\"a4\">简体中文</a></font></td>\r\n");
      out.write("        <td width=\"55\" valign=\"bottom\"><font color=\"#FFFFFF\"><a href=\"#\" class=\"a4\">繁体中文</a></font></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" height=\"56\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" background=\"image/fg_top02.jpg\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#819BBC\" background=\"image/fg_top03.jpg\">\r\n");
      out.write("      <tr align=\"center\">\r\n");
      out.write("        <td width=\"117\" height=\"31\" onMouseOver=\"this.style.backgroundImage='url(image/fg_top04.jpg)'\" onMouseOut=\"this.style.backgroundImage=''\"><a href=\"index.jsp\" class=\"a4\">首页</a></td>\r\n");
      out.write("        <td width=\"117\" onMouseOver=\"this.style.backgroundImage='url(image/fg_top04.jpg)'\" onMouseOut=\"this.style.backgroundImage=''\"><a href=\"bg-resultTen.jsp\" class=\"a4\">销售排行</a></td>\r\n");
      out.write("        <td width=\"117\" onMouseOver=\"this.style.backgroundImage='url(image/fg_top04.jpg)'\" onMouseOut=\"this.style.backgroundImage=''\"><a href=\"goodsAction.do?action=14&mark=0\" class=\"a4\">新品上架</a></td>\r\n");
      out.write("        <td width=\"117\" onMouseOver=\"this.style.backgroundImage='url(image/fg_top04.jpg)'\" onMouseOut=\"this.style.backgroundImage=''\"><a href=\"goodsAction.do?action=15&mark=1\" class=\"a4\">特价商品</a></td>\r\n");
      out.write("        <td width=\"117\" onMouseOver=\"this.style.backgroundImage='url(image/fg_top04.jpg)'\" onMouseOut=\"this.style.backgroundImage=''\"><a href=\"");
      out.print(orderlink);
      out.write("\" class=\"a4\">查看订单</a></td>\r\n");
      out.write("        <td width=\"117\" onMouseOver=\"this.style.backgroundImage='url(image/fg_top04.jpg)'\" onMouseOut=\"this.style.backgroundImage=''\"><a href=\"");
      out.print(shoppinglink);
      out.write("\" class=\"a4\">购物车</a></td>\r\n");
      out.write("        <td width=\"117\" onMouseOver=\"this.style.backgroundImage='url(image/fg_top04.jpg)'\" onMouseOut=\"this.style.backgroundImage=''\"><a href=\"");
      out.print(memberlink);
      out.write("\" class=\"a4\">会员修改</a></td>\r\n");
      out.write("        <td width=\"117\" onMouseOver=\"this.style.backgroundImage='url(image/fg_top04.jpg)'\" onMouseOut=\"this.style.backgroundImage=''\"><a href=\"#\" onclick=\"this.style.behavior='url(#default#homepage)';this.sethomepage('http://www.mingrisoft.com')\" class=\"a4\">设为首页</a></td>\r\n");
      out.write("      </tr>\t\r\n");
      out.write("</table>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
