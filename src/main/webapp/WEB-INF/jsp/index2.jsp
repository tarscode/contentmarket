<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 引入jstl -->
<%@include file="common/tag.jsp" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>java</title>
    <link rel="stylesheet" href="../../css/style.css"/>
</head>
<body>
<div class="n-support">请使用Chrome、Safari等webkit内核的浏览器！</div>
<%@include file="common/head.jsp" %>
<div class="g-doc">
    <div class="m-tab m-tab-fw m-tab-simple f-cb">
        <div class="tab">
            <ul>
                <li class="z-sel"><a href="/item/list/sell">所有内容</a></li>
            </ul>
        </div>
    </div>
    <div class="n-plist">
        <ul class="f-cb" id="plist">
            <c:forEach var="item" items="${list}">
                <li id="p-1">
                    <a href="/item/${item.id}" class="link">
                        <div class="img"><img src="${item.image}" alt=""></div>
                        <h3>${item.title}</h3>
                        <div class="price"><span class="v-unit">¥</span><span class="v-value">${item.price}</span></div>
                        <c:if test="${item.count!=0}"><span class="had"><b>已售出</b></span></c:if>
                        <c:if test="${item.count==0}"><span class="u-btn u-btn-normal u-btn-xs del" data-del="3">删除</span></c:if>
                    </a>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
<div class="n-foot">
    <p>版权所有：网易云课堂<a href="http://mooc.study.163.com/smartSpec/detail/85002.htm">Java开发工程师(Web方向)</a>微专业团队</p>
</div>
<script type="text/javascript" src="../../js/global.js"></script>
<script type="text/javascript" src="../../js/pageIndex.js"></script>
</body>
</html>