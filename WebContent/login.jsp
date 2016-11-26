<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Sân Bóng Mini</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<%@include file="/templates/inc/header.jsp" %>
</head>
<body>	

<div class="container"> 
<form class="form-horizontal" action = "DoLogin" method = "GET">
 <h1 class="text-center">CHÀO MỪNG ĐẾN VỚI SÂN BÒNG MINI</h1> 
 <div class="row"> 
  <div class="col-md-3 col-md-offset-4"> 
   <h1><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> FAST 2016
   </h1> 
   <div class="login-form"> 
    <div class="form-group"> <input required="" type="text" class="form-control" value="" placeholder="example" id="userName" name="userName" > 
    </div> 
    <div class="form-group"> <input required="" type="password" class="form-control" value="" placeholder="Password" id="password" name="password"> 
    </div> 
    <div class="checkbox"> <label><input type="checkbox"> Giữ tôi luôn đăng nhập </label> 
    </div> 
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-info">Submit</button>
      </div>
    </div>
    <br> <a href=""><small>Quên mật khẩu</small></a> 
    <br> 
    <div><small>Không có tài khoản?</small> <a href="signin.jsp"><small>Tạo tài khoản</small></a>
    </div> 
   </div> 
  </div> 
 </div>
</form>
</div>
</body>
</html>

