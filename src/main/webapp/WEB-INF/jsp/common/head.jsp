<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8"%>
<div class="n-head">
    <div class="g-doc f-cb">
        <div class="user">
            你好<span class="name"></span>！${ sessionScope.userName}<a href="">[退出]</a>
            请<a href="/login">[登录]</a>
        </div>
        <ul class="nav">
            <li><a href="/index">首页</a></li>
            <li><a href="/account">账务</a></li>
            <li><a href="/public">发布</a></li>
        </ul>
    </div>
</div>
