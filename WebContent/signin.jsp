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
<form class="form-horizontal">
 <h1 class="text-center">Chào Mừng đến với Sân Bóng Mini</h1> 
 <div class="row"> 
  <div class="col-md-3 col-md-offset-4">
  	<h1><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> FAST 2016
    </h1> 
  	<div class="sign-form">
    <div class="form-group"> <input required="" type="text" class="form-control" value="" placeholder="Tên đăng nhập" id="signin-email"> </div> 
    <div class="form-group"> <input required="" type="password" class="form-control" value="" placeholder="Password" id="signin-pass"> </div>
    <div class="form-group"> <input required="" type="password" class="form-control" value="" placeholder="Re-Password" id="signin-rePass"> </div> 
    <div class="form-group"> <input required="" type="text" class="form-control" value="" placeholder="Tên" id="signin-name"> </div>
  	<div class="form-group"> <input required="" type="email" class="form-control" value="" placeholder="example@gmail.com" id="signin-email"> </div>
  	<div class="form-group"> <input required="" type="tel" class="form-control" value="" placeholder="Số điện thoại" id="signin-phone"> </div>
  	<div class="form-group"><textarea required="" class="form-control" placeholder="Địa chỉ" id="signin-address"></textarea></div>
  	<div class="form-group">
  	<label for="sel1">Chọn quyền:</label>
  	<select class="form-control" id="">
        <option>Chủ sân</option>
        <option>Khách</option>
    </select>
    </div>
</div>
    <div>
    	<a href=""><button type="submit" class="btn btn-info">Tạo tài khoản</button></a>
    	<a href=""><button type="reset" class="btn btn-info">Nhập lại</button></a>
  	</div>
  	<br> 
    <div><small>Đã có tài khoản?</small> <a href="login.jsp"><small>Đăng nhập</small></a>
    </div>  
  </div>
  </div>
</form>
</div>
</body>
</html>

