/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.96
 * Generated at: 2019-11-07 07:46:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.boot;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("  <title>커픽메인화면</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core CSS -->\r\n");
      out.write("  <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this template -->\r\n");
      out.write("  <link href=\"css/shop-homepage.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <!-- Navigation -->\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <img src='main1.png' class=\"navbar-brand\" href=\"index.html\"> \r\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\">커픽</a>\r\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("         <!--  <li class=\"nav-item active\"> -->\r\n");
      out.write("            <a class=\"nav-link\" href=\"index.jsp\">홈\r\n");
      out.write("\r\n");
      out.write("              <span class=\"sr-only\">(current)</span>\r\n");
      out.write("\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>   \r\n");
      out.write("         \r\n");
      out.write("            <a class=\"nav-link\" data-toggle=\"tooltip\" title=\"login!\" href=\"login.jsp\">로그인</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"notice.jsp\">커픽장터</a>\r\n");
      out.write("             <li class=\"nav-item\">\r\n");
      out.write("                       <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"tkdvna.jsp\">커피정보</a>\r\n");
      out.write("          </li>\r\n");
      out.write("            <a class=\"nav-link\" href=\"qwe1.jsp\">가맹점 위치</a>\r\n");
      out.write("          </li>\r\n");
      out.write("           <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"qwe2.jsp\">카페검색</a>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"Coffe1.jsp\">맞춤 음료</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"#\">마이페이지</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <!-- Page Content -->\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-lg-3\">\r\n");
      out.write("\r\n");
      out.write("       <!--  <h5 class=\"my-4\">커피 원두 선택&예약 </h5> -->\r\n");
      out.write("       \r\n");
      out.write("       <br>\r\n");
      out.write("       <br>\r\n");
      out.write("       \r\n");
      out.write("       <!--  <div class=\"list-group\">\r\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">맞춤커피</a>\r\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">카페위치</a>\r\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">이벤트</a>\r\n");
      out.write("        </div>  -->\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.col-lg-3 -->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-lg-9\">\r\n");
      out.write("\r\n");
      out.write("        <div id=\"carouselExampleIndicators\" class=\"carousel slide my-4\" data-ride=\"carousel\">\r\n");
      out.write("          <ol class=\"carousel-indicators\">\r\n");
      out.write("            <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("            <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("            <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("          </ol>\r\n");
      out.write("          <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("            <div class=\"carousel-item active\">\r\n");
      out.write("              <img class=\"d-block img-fluid\" src=\"../boot/img/qwe123.png\" alt=\"First slide\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-item\">\r\n");
      out.write("              <img class=\"d-block img-fluid\" src=\"../boot/1img/5.png\" alt=\"Second slide\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-item\">\r\n");
      out.write("              <img class=\"d-block img-fluid\" src=\"../boot/1img/6.png\" alt=\"Third slide\">\r\n");
      out.write("            </div>b[]\r\n");
      out.write("          </div>\r\n");
      out.write("          <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"sr-only\">Previous</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"sr-only\">Next</span>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"dkapflzksh1.jsp\"><img class=\"card-img-top\" src=\"../boot/tkdvna_img/dkapflzksh1.png\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"dkapflzksh1.jsp\">아이스 아메리카노</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>가격: 3,500원</h5>\r\n");
      out.write("                <p class=\"card-text\">스타벅스만의 특별한 아메리카노</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("                      ★★★★☆\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"zkfkapfvmfkvpsh3.jsp\"><img class=\"card-img-top\" src=\"../boot/tkdvna_img/zkfkapfvmfkvpsh3.png\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"zkfkapfvmfkvpsh3.jsp\">콜드브루 카라멜 프라페노</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>가격: 4,000원</h5>\r\n");
      out.write("                <p class=\"card-text\">뜨거운 겨울에 함께할 핫초코</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("               ★★★☆☆\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"../boot/1img/zkfkapf.png\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"#\">카라멜 마끼아또</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>가격: 3,800원</h5>\r\n");
      out.write("                <p class=\"card-text\">꿀처럼 달달한 카라멜 마끼아또</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("                ★★★★☆\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"https://blog.naver.com/bnsdream7\"><img class=\"card-img-top\" src=\"../boot/img/asdasd.jpg\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"https://blog.naver.com/bnsdream7\">밴드앤스터디카페</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>카페 정보</h5>\r\n");
      out.write("                <p class=\"card-text\">깔끔한 시설 카페로 가격도 저렴하고 대전에서 유명한 스터디 카페 중 하나이다.</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("                ★★☆☆☆\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"https://www.istarbucks.co.kr:7443/index.do\"><img class=\"card-img-top\" src=\"../boot/img/pp1.jpg\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"https://www.istarbucks.co.kr:7443/index.do\">스타벅스</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>카페소개</h5>\r\n");
      out.write("                <p class=\"card-text\">스타벅스 카페는 오랜 정통의 대표적인 카페 중 하나이다.</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("★★★☆☆</small>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"card h-100\">\r\n");
      out.write("              <a href=\"https://www.instagram.com/george_seoul/\"><img class=\"card-img-top\" src=\"../boot/img/pp3.png\" alt=\"\"></a>\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"card-title\">\r\n");
      out.write("                  <a href=\"https://www.instagram.com/george_seoul/\">죠지</a>\r\n");
      out.write("                </h4>\r\n");
      out.write("                <h5>카페 정보</h5>\r\n");
      out.write("                <p class=\"card-text\">을지로3가에 위치한 스웩가득한 느낌의 분위기좋은 카페이다.</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card-footer\">\r\n");
      out.write("                ★★★★☆\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.col-lg-9 -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Footer -->\r\n");
      out.write("  <footer class=\"py-5 bg-dark\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <p class=\"m-0 text-center text-white\">6조 커피마시조 &copy; 이재훈, 정회석, 이혜지</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.container -->\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
