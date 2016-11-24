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
			<div>
				<a href=""><button type="submit" class="btn btn-info">Thay đổi</button></a>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li><a href="chu.jsp"><svg class="glyph stroked male user "><use xlink:href="#stroked-male-user"/></use></svg>Danh sách đặt thuê</a></li>
			<li><a href="chuvip.jsp"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Danh sách vip</a></li>
			<li class="active"><a href="quanlisan.jsp"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Quản lí sân</a></li>
			<li><a href="quanlikhuyenmai.jsp"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Quản lí khuyến mãi</a></li>
			<li><a href="quanlinguoidung.jsp"><svg class="glyph stroked male user "><use xlink:href="#stroked-male-user"/></use></svg>Quản lí người dùng</a></li>
			<li role="presentation" class="divider"></li>
		</ul>

	</div><!--/.sidebar-->
		<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked home"><use xlink:href="#stroked-home"></use></svg></a></li>
				<li class="active">Icons</li>
			</ol>
		</div><!--/.row-->
<div class="container"> 
<form class="form-horizontal">
 <h1 class="text-center">THÊM THÔNG TIN KHUYẾN MÃI</h1> 
 <div class="row"> 
  <div class="col-md-3 col-md-offset-4 col-sm-6 col-sm-offset-3">
  	<h1><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> SALE
    </h1> 
  	<div class="sign-form">
    <div class="form-group"> 
    	<label> Ngày Bắt Đầu:</label>
  		<input required="" type="date" value="" id="signin-ngaybatdau"> 
    </div>
    <div class="form-group"> 
    	<label> Ngày Kết Thúc:</label>
  		<input required="" type="date" value="" id="signin-ngayketthuc"> 
    </div> 
  	<div class="form-group"><textarea required="" class="form-control" placeholder="Nội dung khuyến mãi" id="signin-address"></textarea>
  	</div>
</div>
    <div>
    	<a href=""><button type="submit" class="btn btn-info">Thêm Khuyến Mãi</button></a>
    	<a href=""><button type="reset" class="btn btn-info">Nhập lại</button></a>
  	</div>
  </div>
  </div>
</form>
</div>
</body>
</html>