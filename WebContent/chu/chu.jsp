<%@page import="bean.Thue"%>
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
			<li class="active"><a href="<%=request.getContextPath() %>/ChuDanhSachThue"><svg class="glyph stroked male user "><use xlink:href="#stroked-male-user"/></use></svg>Danh sách đặt thuê</a></li>
			<li><a href="<%=request.getContextPath() %>/chu/chuvip.jsp"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Danh sách vip</a></li>
			<li><a href="<%=request.getContextPath() %>/chu/quanlisan.jsp"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Quản lí sân</a></li>
			<li><a href="<%=request.getContextPath() %>/chu/quanlikhuyenmai.jsp"><svg class="glyph stroked app window with content"><use xlink:href="#stroked-app-window-with-content"/></use></svg>Quản lí khuyến mãi</a></li>
			<li><a href="<%=request.getContextPath() %>/chu/quanlinguoidung.jsp"><svg class="glyph stroked male user "><use xlink:href="#stroked-male-user"/></use></svg>Quản lí người dùng</a></li>
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
					<div class="panel-heading"></div>
					<div class="panel-body">
						<table data-toggle="table"  data-url="true"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
						        <th data-field="" data-checkbox="true" ></th>
						        <th data-field="tensan" data-sortable="true">Sân</th>
						        <th data-field="nguoithue" data-sortable="true">Người thuê</th>
						        <th data-field="sodienthoai" data-sortable="true">Số điện thoại</th>
						        <th data-field="giobatdau" data-sortable="true">Giờ bắt đầu</th>
						        <th data-field="gioketthuc" data-sortable="true">Giờ kết thúc</th>
						        <th data-field="ngay" data-sortable="true">Ngày</th>
						       
						    </tr>
						    </thead>
						    <tbody>
						    	<%
						    		List<Thue> listT = (List<Thue>)request.getAttribute("danhSachThue");
						    		if (listT!=null){
						    		for(Thue item: listT){
						    		%>
						    	<tr>
						    		<td></td>
						    		<td><%=item.getSan().getTen()%></td>
						    		<td><%=item.getNguoiThue().getTen()%></td>
						    		<td><%=item.getNguoiThue().getSdt()%></td>
						    		<td><%=item.getGioBatDau()%></td>
						    		<td><%=item.getGioKetThuc()%></td>
						    		<td><%=item.getNgay()%></td>
						    	</tr>
						    	<%
						    			}
						    		}	
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
