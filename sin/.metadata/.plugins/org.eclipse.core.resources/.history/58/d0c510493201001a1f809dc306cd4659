<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 

</head>

<body>

 <!-- Navigation -->
  <%@ include file = "include.jsp" %>

  <link href="bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    #container {
      width: 70%;
      margin: 0 auto;     /* 가로로 중앙에 배치 */
      padding-top: 10%;   /* 테두리와 내용 사이의 패딩 여백 */
    }
     
    #list {
      text-align: center;
    }
   
    #write {
      text-align: right;
    }
     
    /* Bootstrap 수정 */
    .table > thead {
      background-color: #b3c6ff;
    }
    .table > thead > tr > th {
      text-align: center;
    }
    .table-hover > tbody > tr:hover {
      background-color: #e6ecff;
    }
    .table > tbody > tr > td {
      text-align: center;
    }
    .table > tbody > tr > #title {
      text-align: left;
    }
     
    div > #paging {
      text-align: center;
    }
     
    .hit {
      animation-name: blink;
      animation-duration: 1.5s;
      animation-timing-function: ease;
      animation-iteration-count: infinite;
      /* 위 속성들을 한 줄로 표기하기 */
      /* -webkit-animation: blink 1.5s ease infinite; */
    }
     
    /* 애니메이션 지점 설정하기 */
    /* 익스플로러 10 이상, 최신 모던 브라우저에서 지원 */
    @keyframes blink {
      from {color: white;}
      30% {color: yellow;}
      to {color: red; font-weight: bold;}
      /* 0% {color:white;}
      30% {color: yellow;}
      100% {color:red; font-weight: bold;} */
    }
  </style>
</head>
<body>
  <div id="container">
    <div align="right">
      <!-- Login 검증 -->
      <!-- jstl의 if문은 else가 없어서 따로 검증해야함. -->
      <c:if test="${id != null}">
        <%-- <%@include file="loginOk.jsp" %> --%>
      </c:if>
      <c:if test="${id == null}">
        <%-- <%@include file="login.jsp" %> --%>
      </c:if>
    </div>
   
    <div id="list">
      <b>커픽장터</b>
    </div>
     
    <div id="write">
      <a href="/bbs/writeForm.bbs?pageNum=${pageNum}">글쓰기</a>
    </div>
     
    <div>
      <table class="table table-striped table-bordered table-hover">
        <thead>
          <tr>
            <th width="10%">번호</th>
            <th width="50%">제목</th>
            <th width="10%">작성자</th>
            <th width="20%">작성일</th>
            <th width="10%">조회</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="article" items="${articles}" varStatus="status">
            <tr>
              <td>${article.articleNumber} 4</td>
              <td id="title">
                <c:if test="${article.depth > 0}">
                  &nbsp;&nbsp;
                </c:if>
                <a href="/bbs/content.bbs?articleNumber=${article.articleNumber}&pageNum=${pageNum}">${article.title}</a>
                <c:if test="${article.hit >= 20}">
                스타벅스 미개봉 텀블러 판매합니다. &nbsp &nbsp &nbsp	
                  <span class="hit">     hit!</span>
                </c:if>
              </td>
              <td>${article.id} 이재훈</td>
              <td>${article.writeDate} 2019년 11월 5일</td>
              <td>${article.hit} 16</td>
            <tr>
            <tr>
              <td>${article.articleNumber} 3</td>
              <td id="title">
                <c:if test="${article.depth > 0}">
                  &nbsp;&nbsp;
                </c:if>
                <a href="/bbs/content.bbs?articleNumber=${article.articleNumber}&pageNum=${pageNum}">${article.title}</a>
                <c:if test="${article.hit >= 20}">
                카페베네 미사용 머그컵 판매합니다!! &nbsp &nbsp &nbsp	
                  <span class="hit">     hit!</span>
                </c:if>
              </td>
              <td>${article.id} 박성준</td>
              <td>${article.writeDate} 2019년 10월 29일</td>
              <td>${article.hit} 19</td>
            <tr>
             <tr>
              <td>${article.articleNumber} 2</td>
              <td id="title">
                <c:if test="${article.depth > 0}">
                  &nbsp;&nbsp;
                </c:if>
                <a href="/bbs/content.bbs?articleNumber=${article.articleNumber}&pageNum=${pageNum}">${article.title}</a>
                <c:if test="${article.hit >= 20}">
                콩스콩스 원두커피 1kg 판매합니다. &nbsp &nbsp &nbsp	
                  <!-- <span class="hit">     hit!</span> -->
                </c:if>
              </td>
              <td>${article.id} 이혜지</td>
              <td>${article.writeDate} 2019년 10월 26일</td>
              <td>${article.hit} 8</td>
            <tr>
             <tr>
              <td>${article.articleNumber} 1</td>
              <td id="title">
                <c:if test="${article.depth > 0}">
                  &nbsp;&nbsp;
                </c:if>
                <a href="/bbs/content.bbs?articleNumber=${article.articleNumber}&pageNum=${pageNum}">${article.title}</a>
                <c:if test="${article.hit >= 20}">
                직접 뜨개질한 컵받침 싸게 판매합니다. &nbsp &nbsp &nbsp	
                  <span class="hit">     hit!</span>
                </c:if>
              </td>
              <td>${article.id} 정회석</td>
              <td>${article.writeDate} 2019년 10월 12일</td>
              <td>${article.hit} 17</td>
            <tr>
          </c:forEach>
          
        </tbody>
        
      </table>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
     
      <!-- Paging 처리 -->
      <div id="paging">
        ${pageCode}
      </div>
    </div>
  </div>
   <!-- /.container -->

  <!-- Footer -->
 <!--  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">6조 일찍끝내조 &copy; 이재훈, 정회석, 이혜지</p>
    </div>
    /.container
  </footer> -->

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  
</body>
</html>
