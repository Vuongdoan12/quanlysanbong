<%@page import="bean.San"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Lumino - Dashboard</title>

<!--Icons-->
<%@include file="/templates/inc/header.jsp" %>

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

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
			<li class="active"><a href="<%=request.getContextPath() %>/KhachTimSan"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Tìm sân</a></li>
			<li><a href="<%=request.getContextPath() %>/KhachQuanLySanDat"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Quản lí sân đặt</a></li>
			<li><a href="<%=request.getContextPath() %>/KhachQuanLyTran"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Quản lí trận</a></li>
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
				
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Danh sách sân trống</div>
					<div class="panel-body">
						<table data-toggle="table" data-url="true"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
						        
						        <th data-field="tensan" data-sortable="true">Tên sân</th>
						        <th data-field="diachi" data-sortable="true">Địa chỉ</th>
						        <th data-field="gia" data-sortable="true">Giá</th>
						        <th data-field="loai" data-sortable="true">Loại</th>
						        <th data-field="sodienthoai" data-sortable="true">Số điện thoại sân</th>
						   		<th data-field="thue" data-sortable="true" >Đặt sân</th>
						        <th data-field="taotran" data-sortable="true">Tạo trận</th>
						    </tr>
						    </thead>
						     <tbody>
						    	<%
						    		List<San> listS = (List<San>)request.getAttribute("danhSachSanTrong");
						    		if (listS!=null){
						    		for(San item: listS){
						    		%>
						    	<tr>
						    		
						    		<td><%=item.getTen()%></td>
						    		<td><%=item.getChuSan().getDiaChi()%></td>
						    		<td><%=item.getGia()%></td>
						    		<td><%=item.getLoai()%></td>
						    		<td><%=item.getChuSan().getSdt() %></td>
						    		<td>
                						<a href="KhachDatSan?idSan=<%=item.getIdSan()%>&gioBatDau=<%=request.getAttribute("gioBatDau")%>&gioKetThuc=<%=request.getAttribute("gioKetThuc")%>&ngay=<%=request.getAttribute("ngay")%>">Đặt thuê</a>
             						</td>
             						<td>
               						    <a href="KhachTaoTran?idSan=<%=item.getIdSan()%>&gioBatDau=<%=request.getAttribute("gioBatDau")%>&gioKetThuc=<%=request.getAttribute("gioKetThuc")%>&ngay=<%=request.getAttribute("ngay")%>&soLuongToiDa=<%=item.getLoai()+item.getLoai()%>">Tạo trận</a>
             						</td>
						    	</tr>
						    	<%
						    	}}
						    	%>
						    </tbody>
						</table>
					</div>
				</div>
			</div>
		</div><!--/.row-->	
		<div class="row">
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-body">
					
					</div>
				</div>
			</div>
		</div><!--/.row-->	
		
		
	</div>
	<!--/.main-->

</body>

</html>
