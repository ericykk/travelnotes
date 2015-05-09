<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>Bootstrap 实例 - 偏移列</title>
   <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
   <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
   <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

   <h1>Hello, world!</h1>
	<!--  为了在大屏幕显示器上使用偏移，请使用 .col-md-offset-* 类。这些类会把一个列的左外边距（margin）增加 * 列，其中 * 范围是从 1 到 11。-->
   <div class="row" >
      <div class="col-xs-6 col-md-offset-3" style="background-color: #dedef8;box-shadow:inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
         <p>
         Lorem ipsum dolor sit amet, consectetur adipisicing elit.
         </p>
      </div>

   </div>
</div>

</body>
</html>