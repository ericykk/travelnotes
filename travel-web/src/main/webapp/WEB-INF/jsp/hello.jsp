<!--设置页面编码 防止中文乱码-->
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
		String path =   request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <!--告诉IE浏览器，IE8/9及以后的版本都会以最高版本IE来渲染页面 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- 包含头部信息用于适应不同设备
    	1.width=device-width 适应屏幕显示
    	2.initial-scale 确保网页加载时，以 1:1 的比例呈现，不会有任何的缩放
    	3.maximum-scale=1.0与user-scalable=no一起使用  移动设备禁用缩放功能
    -->
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1.0,user-scalable=no">
    <title>Bootstrap 实例</title>
    <!-- 包含 bootstrap 样式表 -->
    <%-- <link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css"> --%>
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
  </head>

  <body>
    <div class="container">
      <h2>表格</h2>
      <p>创建响应式表格 (将在小于768px的小型设备下水平滚动)。另外：添加交替单元格的背景色：</p>
      <div class="table-responsive">
       <table class="table table-striped table-bordered">
         <thead>
           <tr>
             <th>#</th>
             <th>Name</th>
             <th>Street</th>
           </tr>
         </thead>
         <tbody>
           <tr>
             <td>1</td>
             <td>Anna Awesome</td>
             <td>Broome Street</td>
           </tr>
           <tr>
             <td>2</td>
             <td>Debbie Dallas</td>
             <td>Houston Street</td>
           </tr>
           <tr>
             <td>3</td>
             <td>John Doe</td>
             <td>Madison Street</td>
           </tr>
         </tbody>
       </table>
      </div>

      <h2>图像</h2>
      <p>创建项应式图片(将扩展到父元素)。 另外：图片以椭圆型展示：</p>
      <img src="<%=basePath%>img/letu.jpg" class="img-responsive img-circle" alt="Cinque Terre" width="304" height="236">

      <h2>图标</h2>
      <p>插入图标:</p>
      <p>云图标:  <span class="glyphicon glyphicon-cloud"></span></p>
      <p>信件图标: <span class="glyphicon glyphicon-envelope"></span></p>
      <p>搜索图标: <span class="glyphicon glyphicon-search"></span></p>
      <p>打印图标: <span class="glyphicon glyphicon-print"></span></p>
      <p>下载图标：  <span class="glyphicon glyphicon-download"></span></p>
    </div>

    <!-- JavaScript 放置在文档最后面可以使页面加载速度更快 -->
    <!-- 可选: 包含 jQuery 库 -->
    <!-- <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script> -->
    <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
    <!-- 可选: 合并了 Bootstrap JavaScript 插件 -->
    <%-- <script src="<%=basePath%>js/bootstrap.min.js"></script> --%>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
  </body>

</html>