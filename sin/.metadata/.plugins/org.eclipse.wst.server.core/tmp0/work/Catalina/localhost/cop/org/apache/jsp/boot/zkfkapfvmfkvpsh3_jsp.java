/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.96
 * Generated at: 2019-11-05 12:40:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.boot;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class zkfkapfvmfkvpsh3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/boot/include.jsp", Long.valueOf(1572223528654L));
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
      out.write(" ");
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
      out.write("  <title>메인 홈 화면</title>\r\n");
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
      out.write("    <img src='main.png' class=\"navbar-brand\" href=\"index.jsp\"> \r\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\">커픽</a>\r\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      <!-- 불들어오는거 --> <!--    <li class=\"nav-item active\"> -->\r\n");
      out.write("            <a class=\"nav-link\" href=\"index.jsp\">홈\r\n");
      out.write("\r\n");
      out.write("              <span class=\"sr-only\">(current)</span>\r\n");
      out.write("\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>   \r\n");
      out.write("          <!--  -->\r\n");
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
      out.write("              <li class=\"nav-item\">\r\n");
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
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("      <!--   <h5 class=\"my-4\">커피 원두 선택&예약 </h5> -->\r\n");
      out.write("     <!--    <div class=\"list-group\">\r\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">맞춤커피</a>\r\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">카페위치</a>\r\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">이벤트</a>\r\n");
      out.write("        </div>  -->\r\n");
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("  \r\n");
      out.write("      \r\n");
      out.write("      </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!-- saved from url=(0083)http://bf.caffebene.co.kr/Content/Gnb/Menu/MenuDetail.aspx?code=T2M3I1&ItemCode=615 -->\r\n");
      out.write("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scale=no,\"><meta name=\"format-detection\" content=\"telephone=no\"><title>CAFFE BENE</title><link id=\"ctl00_cssInport\" rel=\"stylesheet\" type=\"text/css\" href=\"./tkdvna_files/contents.css\"><link rel=\"stylesheet\" type=\"text/css\" href=\"./tkdvna_files/contents_pays.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .GnbVisible {\r\n");
      out.write("            display:block;\r\n");
      out.write("            padding:6px 0;\r\n");
      out.write("            line-height : 18px;\r\n");
      out.write("            font-size:12px;\r\n");
      out.write("            color : #ccc;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .TnbVisible {\r\n");
      out.write("            display : block;\r\n");
      out.write("            padding :20px 20px;\r\n");
      out.write("            color : #8c8c8c;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\" async=\"\" src=\"./tkdvna_files/analytics.js.다운로드\"></script><script src=\"./tkdvna_files/ac.js.다운로드\"></script><script type=\"text/javascript\" src=\"./tkdvna_files/jquery-1.12.3.min.js.다운로드\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./tkdvna_files/Common.js.다운로드\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./tkdvna_files/html5.js.다운로드\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./tkdvna_files/isotope.pkgd.min.js.다운로드\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./tkdvna_files/swiper.jquery.js.다운로드\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./tkdvna_files/swipe.js.다운로드\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./tkdvna_files/style_ui.js.다운로드\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function goMem() {\r\n");
      out.write("            alert(\"이용에 불편을 드려 죄송합니다.\\r\\n회원탈퇴는 카페베네 APP에서 가능하며,\\r\\n문의사항은 고객센터로 연락주시기 바랍니다.\\r\\n(고객센터 : 1688-4666)\");\r\n");
      out.write("        }\r\n");
      out.write("        </script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("        function loginEnd() {\r\n");
      out.write("            alert(\"시스템 점검 중이며 빠른 시일 내 서비스 개선하도록 하겠습니다.\");\r\n");
      out.write("        }\r\n");
      out.write("        </script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            otherPrdGallery.init();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function goList() {\r\n");
      out.write("            var url = String.format(\"/Content/Gnb/Menu/MenuAll.aspx?code={0}\", qcode);\r\n");
      out.write("\r\n");
      out.write("            $(location).attr('href', url);\r\n");
      out.write("        }\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"./tkdvna_files/f.txt\"></script></head>\r\n");
      out.write("<body>\r\n");
      out.write("    <form method=\"post\" action=\"*\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"pageTitleWrap\">\r\n");
      out.write("\t\t\t<div class=\"pageTitleInner\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t<div class=\"conTitWrap mT0\">\r\n");
      out.write("\t\t\t\t<h3 class=\"tit\">콜드브루 카라멜 프라페노</h3>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<span class=\"price\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 메뉴 설명 -->\r\n");
      out.write("\t\t\t<div class=\"prdDetailWrap\">\r\n");
      out.write("\t\t\t\t<div class=\"prdImg\">\r\n");
      out.write("                    <img id=\"ctl00_Contents_imgMenu\" src=\"../boot/tkdvna_img/zkfkapfvmfkvpsh3.png\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"prdSummary\">\r\n");
      out.write("\t\t\t\t\t<div class=\"summInner\">\r\n");
      out.write("\t\t\t\t\t\t<strong class=\"detailTit\">음료명</strong>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"menuTxt\">\r\n");
      out.write("\t\t\t\t\t\t\t콜드브루 카라멜 프라페노\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<strong class=\"detailTit type02\">영양성분</strong>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"viewWrap type02\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong class=\"cell_th\">1회 제공량</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cell_td\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tR360/ L450\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong class=\"cell_th\">열량</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cell_td\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tR269/ L336\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong class=\"cell_th\">당류</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cell_td\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tR46/ L57\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong class=\"cell_th\">단백질</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cell_td\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tR3(6%)/L4(8%)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong class=\"cell_th\">포화지방</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cell_td\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tR2.8(19%)/L3.6(24%)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong class=\"cell_th\">나트륨</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cell_td\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tR91(5%)/L114(6%)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<strong class=\"detailTit type02\">가격</strong>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"viewWrap type02\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong class=\"cell_th\">5,300원</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<strong class=\"detailTit type02\">카페명</strong>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"viewWrap type02\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong class=\"cell_th\">빈칸</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //메뉴 설명 -->\r\n");
      out.write("<br>\r\n");
      out.write("\t\t\t<div class=\"conTitWrap\">\r\n");
      out.write("\t\t\t\t<h3 class=\"tit\">다른제품 보기</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("<br>\r\n");
      out.write("\t\t\t<div class=\"otherPrdGallery\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"prdGallery swiper-container-horizontal\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"swiper-wrapper\" style=\"width: 8146.4px;\">\r\n");
      out.write("                        \r\n");
      out.write("                                <li class=\"swiper-slide swiper-slide-active\" style=\"width: 239.6px;\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a href=\"dkapflzksh1.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t        <span class=\"img\"><img src=\"../boot/tkdvna_img/dkapflzksh1.png\" alt=\"dkapflzksh1.jsp\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        <div class=\"prdName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <span>아메리카노(HOT)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        \r\n");
      out.write("\t\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t        </li>\r\n");
      out.write("                            \r\n");
      out.write("                                <li class=\"swiper-slide swiper-slide-next\" style=\"width: 239.6px;\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a href=\"dkdltmfkEp2.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t        <span class=\"img\"><img src=\"../boot/tkdvna_img/dkdltmfkEp2.png\" alt=\"dkdltmfkEp2.jsp\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        <div class=\"prdName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <span>아이스라떼</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        \r\n");
      out.write("\t\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t        </li>\r\n");
      out.write("                            \r\n");
      out.write("                                <li class=\"swiper-slide\" style=\"width: 239.6px;\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a href=\"zkfkapfvmfkvpsh3.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t        <span class=\"img\"><img src=\"../boot/tkdvna_img/zkfkapfvmfkvpsh3.png\" alt=\"\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        <div class=\"prdName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <span>콜드브루 카라멜 프라페노</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        \r\n");
      out.write("\t\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t        </li>\r\n");
      out.write("                            \r\n");
      out.write("                                <li class=\"swiper-slide\" style=\"width: 239.6px;\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a href=\"ghkdlxmahzk4.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t        <span class=\"img\"><img src=\"../boot/tkdvna_img/ghkdlxmahzk4.png\" alt=\"\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        <div class=\"prdName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <span>콜드브루 프라페노</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        \r\n");
      out.write("\t\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t        </li>\r\n");
      out.write("                            \r\n");
      out.write("                                <li class=\"swiper-slide\" style=\"width: 239.6px;\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a href=\"*\">\r\n");
      out.write("\t\t\t\t\t\t\t\t        <span class=\"img\"><img src=\"../boot/tkdvna_img/qkslffkwpffkEh5.png\" alt=\"\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        <div class=\"prdName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <span>바닐라젤라또 라떼</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t      \r\n");
      out.write("\t\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t        </li>\r\n");
      out.write("                            \r\n");
      out.write("                                <li class=\"swiper-slide\" style=\"width: 239.6px;\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a href=\"*\">\r\n");
      out.write("\t\t\t\t\t\t\t\t        <span class=\"img\"><img src=\"../boot/tkdvna_img/gpdlwmfsjt6.png\" alt=\"\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        <div class=\"prdName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <span>콜드브루 헤이즐넛라떼</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t       \r\n");
      out.write("\t\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t        </li>\r\n");
      out.write("                            \r\n");
      out.write("                         \r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btnNext\"><span class=\"blind\">다음</span></button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"btnPageWrap\">\r\n");
      out.write("\t\t\t\t<!-- <a href=\"http://bf.caffebene.co.kr/Content/Gnb/Menu/MenuDetail.aspx?code=T2M3I1&amp;ItemCode=615#\" class=\"btn02\" onclick=\"goList();\">목록</a> -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //container -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"btnGoTop\">\r\n");
      out.write("        \t\t<a href=\"#\">TOP</a>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\r\n");
      out.write("\t   \r\n");
      out.write("\r\n");
      out.write("</body></html>");
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
