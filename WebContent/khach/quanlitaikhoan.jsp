<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<%@include file="/templates/inc/header.jsp" %>
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>Lumino</span>Admin</a>
				<ul class="user-menu">
					<li class="dropdown pull-right">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> User <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Profile</a></li>
							<li><a href="#"><svg class="glyph stroked gear"><use xlink:href="#stroked-gear"></use></svg> Settings</a></li>
							<li><a href="#"><svg class="glyph stroked cancel"><use xlink:href="#stroked-cancel"></use></svg> Logout</a></li>
						</ul>
					</li>
				</ul>
			</div>
							
		</div><!-- /.container-fluid -->
	</nav>
		
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li><a href="<%=request.getContextPath() %>/KhanhDanhSachKhuyenMai"><svg class="glyph stroked male user "><use xlink:href="#stroked-male-user"/></use></svg>Danh sách khuyến mãi</a></li>
			<li><a href="<%=request.getContextPath() %>/KhachTimSan"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Tìm sân</a></li>
			<li ><a href="<%=request.getContextPath() %>/KhachQuanLySanDat"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Quản lí sân đặt</a></li>
			<li><a href="<%=request.getContextPath() %>/KhachDanhSachTran"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Quản lí trận</a></li>
			<li class="active"><a href="<%=request.getContextPath() %>/KhanhQuanLyTaiKhoan"><svg class="glyph stroked male user "><use xlink:href="#stroked-male-user"/></use></svg>Quản lí tài khoản</a></li>
			<li role="presentation" class="divider"></li>
		</ul>

	</div><!--/.sidebar-->
<div class="container"> 
<form class="form-horizontal">
 <h1 class="text-center">Thông tin tài khoản</h1> 
 <div class="row"> 
  <div class="col-md-3 col-md-offset-3 col-sm-6 col-sm-offset-3">
  	<h1><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> Profile
    </h1> 
  	<div class="sign-form">
    <div class="form-group"> <input required="" type="text" class="form-control" value="" placeholder="Tên đăng nhập" id="signin-email"> </div> 
    <div class="form-group"> <input required="" type="text" class="form-control" value="" placeholder="Tên" id="signin-name"> </div>
  	<div class="form-group"> <input required="" type="email" class="form-control" value="" placeholder="example@gmail.com" id="signin-email"> </div>
  	<div class="form-group"> <input required="" type="tel" class="form-control" value="" placeholder="Số điện thoại" id="signin-phone"> </div>
  	<div class="form-group"><textarea required="" class="form-control" placeholder="Địa chỉ" id="signin-address"></textarea></div>
</div>
    <div>
    	<a href=""><button type="submit" class="btn btn-info">Thay đổi</button></a>
    	<a href=""><button type="reset" class="btn btn-info">Nhập lại</button></a>
  	</div>
  </div>
    <div class="col-md-3 col-sm-6 col-sm-offset-3">
  	<h1><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>Pass
    </h1> 
  	<div class="sign-form">
  	<div class="form-group"> <input required="" type="password" class="form-control" value="" placeholder="Old Password" id="signin-pass"> </div>
  	<div class="form-group"> <input required="" type="password" class="form-control" value="" placeholder="New password" id="signin-pass"> </div>
    <div class="form-group"> <input required="" type="password" class="form-control" value="" placeholder="Re-Password" id="signin-rePass"> </div>
	</div>
    <div>
    	<a href=""><button type="submit" class="btn btn-info">Đổi Mật khẩu</button></a>
    	<a href=""><button type="reset" class="btn btn-info">Nhập lại</button></a>
  	</div>
  </div>
  </div>
</form>
</div>
</body>
</html>