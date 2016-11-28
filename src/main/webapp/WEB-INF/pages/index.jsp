<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Come2PaPa | Sgin in</title>
    <link rel=" shortcut icon " href="favicon.ico" type=" image/x-icon " />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href="../../css/style.css" rel='stylesheet' type='text/css' />
    <!--webfonts-->
    <link href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
    <!--//webfonts-->
    <script src="../../js/jquery.min.js"></script>
</head>
<body>
<script>
    $(document).ready(function(c) {
    $('.close').on('click', function(c){
        $('.login-form').fadeOut('slow', function(c){
            $('.login-form').remove();
                });
            });
        });
</script>
<!--SIGN UP-->
<h1>GanZiB2PaPa Login</h1>
<div class="login-form">
    <div class="close"> </div>
    <div class="head-info">
        <label class="lbl-1"> </label>
        <label class="lbl-2"> </label>
        <label class="lbl-3"> </label>
    </div>
    <div class="clear"> </div>
    <div class="avtar">
        <img src="../../images/avtar.png" />
    </div>
    <form id="ff" action="/login" method="post">
        <input type="text" class="text" name="userName" id="userName" value="Please enter your UserName" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Please enter your UserName';}" >
        <div class="key">
            <input type="text" value="Please enter your PassWord" name="password" id="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Please enter your PassWord';}">
        </div>
        <div class="signin">
            <input type="submit"  value="Login" >
        </div>
    </form>
</div>
<div class="copy-rights">
    <p>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href="" title="GanZiB'WebSite">GanZiB'WebSite</a> - Collect from <a href="" title="GanZiB'WebSite" >GanZiB'WebSite</a></p>
</div>
</body>
<script type="application/javascript">

</script>
</html>