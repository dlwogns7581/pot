/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.96
 * Generated at: 2019-10-16 03:13:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._201542042;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/201542042/main_header.jsp", Long.valueOf(1571114267110L));
    _jspx_dependants.put("/201542042/main_section.jsp", Long.valueOf(1571114267126L));
    _jspx_dependants.put("/201542042/main_nav.jsp", Long.valueOf(1571114267126L));
    _jspx_dependants.put("/201542042/main_footer.jsp", Long.valueOf(1571114267110L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<title>회원 관리 프로그램</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main.css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
 String section = request.getParameter("section"); 
      out.write("\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<h2> 회원관리 프로그램 </h2>");
      out.write("\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("div.horizontal\r\n");
      out.write("{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:30px;\r\n");
      out.write("\tbackground-color:#8888dd;\r\n");
      out.write("}\r\n");
      out.write("div.horizontal ul\r\n");
      out.write("{\r\n");
      out.write("\tlist-style-type:none;\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("}\r\n");
      out.write("div.horizontal li\r\n");
      out.write("{\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("}\r\n");
      out.write("div.horizontal a\r\n");
      out.write("{\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\twidth:140px;\r\n");
      out.write("}\r\n");
      out.write("div.horizontal a:link,div.horizontal a:visited\r\n");
      out.write("{\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tcolor:#FFFFFF;\r\n");
      out.write("\tbackground-color:#8888dd;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("\ttext-transform:uppercase;\r\n");
      out.write("}\r\n");
      out.write("div.horizontal a:hover,div.horizontal a:active\r\n");
      out.write("{\r\n");
      out.write("\tbackground-color:#800000;\r\n");
      out.write("\t/* #6666bb */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"horizontal\">\r\n");
      out.write("<ul>\r\n");
      out.write("<li><a href=\"index.jsp?section=member_insert.jsp\">회원등록</a></li>\r\n");
      out.write("<li><a href=\"index.jsp?section=member_list.jsp\">회원목록조회</a></li>\r\n");
      out.write("<li><a href=\"index.jsp?section=money_list.jsp\">회원매출조회</a></li>\r\n");
      out.write("<li><a href=\"index.jsp\">홈으로.</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section>\r\n");
      out.write("\t\t\t");

				if(request.getParameter("section")==null){
			
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p align=\"center\"><b>회원관리 프로그램</b></p>\r\n");
      out.write("\r\n");
      out.write("Section 영역입니다.<br/>\r\n");
      out.write("<br>\r\n");
      out.write("1. 업무화면 영역입니다.<br/>\r\n");
      out.write("2. 컨텐츠와 업무영역을 분할하여 사용할 수 있습니다.<br/>\r\n");
      out.write("3. HTML5 로 구성되어 있습니다. <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				}else{
			
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, section, out, false);
      out.write("\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<b>한국대학교 Copyrightⓒ2017 All rights reserved.</b>\t\r\n");
      out.write("\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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