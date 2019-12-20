<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>로그인화면</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/shop-homepage.css" rel="stylesheet">

</head>

<body>
 <%@ include file = "include.jsp" %>

        <div class="container">
            
<div class="container">
	<div class="row text-center mb-4">
		<div class="col-md-12">
		    <!-- <h4>커픽</h4>
		    <small>09.20</small> -->
		</div>
	</div>
	<div class="row text-center">
	    <div class="col-md-6 offset-md-3">
	        <div class="card">
	            <div class="card-body">
	                <div class="login-img">
<!-- 로그인화면 이미지 넣는거 -->  <img src='log1.png'>
	                </div>
	                <!-- <div class="login-title">
	                    <h4>로그인</h4>
	                </div> -->
	                <div class="login-form mt-4">
	                    <form>
                        <div class="form-row">
                            <div class="form-group col-md-12">
                              <input id="email" name="Full Name" placeholder="아이디" class="form-control" type="text">
                            </div>
                            <div class="form-group col-md-12">
                              <input type="pass" class="form-control" id="pass" placeholder="비밀번호">
                            </div>
                          </div>
                         <div class="form-row">
                        <div class="form-group">
                                <div class="form-check">
                                  <input class="form-check-input" type="checkbox" value="" id="updatecheck1">
                                  <label class="form-check-label" for="updatecheck1">
                                    <small>아이디 저장 <a href="#">약관보기 </a> </small>
                                    
                                  </label>
                                </div>
                              </div>
                    </div>                        
                        
                        <div class="form-row">
                            <button type="button" class="btn btn-danger btn-block">로그인</button>
                        </div>
                    </form>
                     <br>
                     <div class="logi-forgot">
	                    <a href="#">회원가입 </a>
	                </div>
	                </div>
	                <div class="logi-forgot text-right mt-2">
	                    <a href="#">아이디, 비밀번호 찾기 </a>
	                </div>
	            </div>
	        </div>
	    </div>
	</div>
</div>
  </div>

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
