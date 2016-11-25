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
			<li  class="active"><a href="<%=request.getContextPath() %>/KhachTimSan"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Tìm sân</a></li>
			<li><a href="<%=request.getContextPath() %>/KhanhDatSan"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Quản lí sân đặt</a></li>
			<li><a href="<%=request.getContextPath() %>/KhachDanhSachTran"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Quản lí trận</a></li>
			<li><a href="<%=request.getContextPath() %>/KhanhQuanLyTaiKhoan"><svg class="glyph stroked male user "><use xlink:href="#stroked-male-user"/></use></svg>Quản lí tài khoản</a></li>
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
<form class="form-horizontal" action = "KhachTimKiemSan">
 <h1 class="text-center">TÌM SÂN</h1> 
 <div class="row"> 
  <div class="col-md-3 col-md-offset-4 col-sm-6 col-sm-offset-3"> 
  	<div class="sign-form">
    <div class="form-group"> <input required="" type="text" class="form-control" value="" placeholder="Địa chỉ" id="timsan-diachi" name = "diaChi"> </div> 
    <div class="form-group"> <input required="" type="text" class="form-control" value="" placeholder="Loại" id="timsan-loai" name = "loai"> </div>
  	<div class="form-group">
  	<label> Giờ bắt đầu</label>
  	<select name ="gioBatDau">
  	<option value="1" selected = "seleted">1h30</option>
  	<option value="2">2h30</option>
  	<option value="3">3h30</option>
  	<option value="4">4h30</option>
  	<option value="5">5h30</option>
  	<option value="6">6h30</option>
  	<option value="7">7h30</option>
  	<option value="8">8h30</option>
  	<option value="9">9h30</option>
  	<option value="10">10h30</option>
  	<option value="11">11h30</option>
  	<option value="12">12h30</option>
  	<option value="13">13h30</option>
  	<option value="14">14h30</option>
  	<option value="15">15h30</option>
  	<option value="16">16h30</option>
  	<option value="17">17h30</option>
  	<option value="18">18h30</option>
  	<option value="19">19h30</option>
  	<option value="20">20h30</option>
  	<option value="21">21h30</option>
  	<option value="22">22h30</option>
  	<option value="23">23h30</option>
  	<option value="0">0h30</option>
  	</select>
  	</div>
  	<div class="form-group">
  	<label> Giờ kết thúc</label>
  	<select name ="gioKetThuc">
  	<option value="1" selected = "seleted">1h30</option>
  	<option value="2">2h30</option>
  	<option value="3">3h30</option>
  	<option value="4">4h30</option>
  	<option value="5">5h30</option>
  	<option value="6">6h30</option>
  	<option value="7">7h30</option>
  	<option value="8">8h30</option>
  	<option value="9">9h30</option>
  	<option value="10">10h30</option>
  	<option value="11">11h30</option>
  	<option value="12">12h30</option>
  	<option value="13">13h30</option>
  	<option value="14">14h30</option>
  	<option value="15">15h30</option>
  	<option value="16">16h30</option>
  	<option value="17">17h30</option>
  	<option value="18">18h30</option>
  	<option value="19">19h30</option>
  	<option value="20">20h30</option>
  	<option value="21">21h30</option>
  	<option value="22">22h30</option>
  	<option value="23">23h30</option>
  	<option value="0">0h30</option>
  	</select>
  	</div>
  	<div class="form-group"> 
    	<label> Ngày:</label>
  		<input required="" type="date" value="" id="signin-ngay" name = "ngay"> 
    </div>   	
</div>
    <div>
    	<button type = "submit" value = "1" name = "bttimsan">Tìm Sân</button>
    	<button type = "submit" value = "2" name = "bttimtran">Tìm Trận</button>
  	</div>
  </div>
  </div>
</form>
</div>
</body>
</html>