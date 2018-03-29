<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8"/>
<title>java</title>
<link rel="stylesheet" href="../../css/style.css"/>
</head>
<body>
<div >
     ${msg}
</div>
<form class="m-form m-form-ht n-login" id="loginForm" action="/user/login" autocomplete="off" method="post">
    <div class="fmitem">
        <label class="fmlab">用户名：</label>
        <div class="fmipt">
            <input class="u-ipt" name="name" autofocus/>
        </div>
    </div>

    <div class="fmitem">
        <label class="fmlab">密码：</label>
        <div class="fmipt">
            <input class="u-ipt" type="password" name="password"/>
        </div>
    </div>
    <div class="fmitem fmitem-nolab fmitem-btn">
        <div class="fmipt">
            <button type="submit" class="u-btn u-btn-primary u-btn-lg u-btn-block">登 录</button>
        </div>
    </div>
</form>
<div class="n-foot">
    <p>版权所有：网易云课堂<a href="http://mooc.study.163.com/smartSpec/detail/85002.htm">Java开发工程师(Web方向)</a>微专业团队</p>
</div>
</body>
</html>