<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8"%>
<%@include file="tag.jsp"%>
<div class="n-head">
    <div class="g-doc f-cb">
        <div class="user">
            你好<span class="name"></span>！${ sessionScope.userName}<a href="/user/logout">[退出]</a>
            <c:if test="${sessionScope.userName==null}">
               请<a href="/login">[登录]</a>
            </c:if>

        </div>
        <ul class="nav">
            <li><a href="/index">首页</a></li>

            <c:if test="${sessionScope.userType==1}">
            <li><a href="/order/list">账务</a></li>
            <li><a href="/cart/list">购物车</a></li>
            </c:if>

            <c:if test="${sessionScope.userType==2}">
            <li><a href="/public">发布</a></li>
            </c:if>
        </ul>
    </div>
</div>
