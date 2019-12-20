<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
	<meta charset="utf-8"/>
	<title>가맹점 위치</title>
	<!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/shop-homepage.css" rel="stylesheet">
</head>
<body>
    <%@ include file = "include.jsp" %>
      <div class="container">

	<h1 align="center">가맹점 위치</h1>
    <div id="map" style="width:800px;height:600px;"></div>
    
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=18273b220eba4bfbc04f68bed4f99964"></script>
	<script>
  var container = document.getElementById('map');
  var options = {
  center: new kakao.maps.LatLng(37.58988628988218,	127.05810731647018),
  level: 3
  };

  
  var map = new kakao.maps.Map(container, options);
  
  var positions = [
      { latlng: new kakao.maps.LatLng(37.588859714142586,	127.06564156980917)},
      { latlng: new kakao.maps.LatLng(37.58942230957589,	127.06245761740055)},
      { latlng: new kakao.maps.LatLng(37.58990462015859,	127.05747326793112)},
      { latlng: new kakao.maps.LatLng(37.58982830195359,	127.0569240661392)},
      { latlng: new kakao.maps.LatLng(37.58958412401539,	127.05878077038038)},
      { latlng: new kakao.maps.LatLng(37.58901571062146,	127.0603428166437)},
      { latlng: new kakao.maps.LatLng(37.5895385,	127.0590682,17.56)},
      { latlng: new kakao.maps.LatLng(37.5897228,127.0561061,17.56)},
      { latlng: new kakao.maps.LatLng(37.5885125,127.0512045,16)},
      { latlng: new kakao.maps.LatLng(37.5774663,127.0458377,15.52)},
      { latlng: new kakao.maps.LatLng(37.5897357,127.0448379,15.52)},
      { latlng: new kakao.maps.LatLng(37.583691, 127.053916)},
      { latlng: new kakao.maps.LatLng(37.579049, 127.068957)},
      { latlng: new kakao.maps.LatLng(37.577229, 127.066962)},
      { latlng: new kakao.maps.LatLng(37.577863, 127.059668)},
      { latlng: new kakao.maps.LatLng(37.573292, 127.057023)},
      { latlng: new kakao.maps.LatLng(37.568334, 127.051262)},
      { latlng: new kakao.maps.LatLng(37.588924, 127.059473)},
      { latlng: new kakao.maps.LatLng(37.588748, 127.062896)},
      { latlng: new kakao.maps.LatLng(37.587593, 127.060360)},
      { latlng: new kakao.maps.LatLng(37.579758, 127.055227)},
      { latlng: new kakao.maps.LatLng(37.576392, 127.067966)},
      { latlng: new kakao.maps.LatLng(37.587863, 127.059390)},
      { latlng: new kakao.maps.LatLng(37.588674, 127.061377)},
      { latlng: new kakao.maps.LatLng(37.587793, 127.062302)},
      { latlng: new kakao.maps.LatLng(37.587227, 127.055530)},
      { latlng: new kakao.maps.LatLng(37.587565, 127.057271)},
     
      
      { latlng: new kakao.maps.LatLng(37.586199, 127.057690)},
      { latlng: new kakao.maps.LatLng(37.585684, 127.059357)},
      { latlng: new kakao.maps.LatLng(37.584988, 127.057386)},
      { latlng: new kakao.maps.LatLng(37.585919, 127.055743)},
      { latlng: new kakao.maps.LatLng(37.586713, 127.054725)},
      
      
      ];

	
  // 마커 이미지의 이미지 주소입니다
  var imageSrc = "http://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png"; 
      
  for (var i = 0; i < positions.length; i ++) {
      
      // 마커 이미지의 이미지 크기 입니다
      var imageSize = new kakao.maps.Size(34, 45); 
      
      // 마커 이미지를 생성합니다    
      var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize); 
      
      // 마커를 생성합니다
      var marker = new kakao.maps.Marker({
          map: map, // 마커를 표시할 지도
          position: positions[i].latlng, // 마커를 표시할 위치
          title : positions[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
          image : markerImage // 마커 이미지 
          
          
          
      });
  }
	
	</script>
  </section>
</body>
</html>