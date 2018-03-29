<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>java</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<
<%@include file="common/head.jsp" %>
<div class="g-doc">
    <div class="n-show f-cb" id="showContent">
        <div class="img"><img src="${item.image}" alt=""></div>
        <div class="cnt">
            <h2>${item.title}</h2>
            <p class="summary">${item.summary}</p>
            <div class="price">
                <span class="v-unit">¥</span><span class="v-value">${item.price}</span>
            </div>
            <div class="oprt f-cb">
                <c:if test="${sessionScope.userType==1}">
                    <a href="/item/buy/${item.id}" class="u-btn u-btn-primary">购 买</a>
                    <span class="u-btn u-btn-primary z-dis">已购买</span>
                    <span class="buyprice">当时购买价格：¥${item.price}</span>
                </c:if>
                <c:if test="${sessionScope.userType==2}">
                    <a href="/item/edit/${item.id}" class="u-btn u-btn-primary">编 辑</a>
                </c:if>
            </div>
        </div>
    </div>
    <div class="m-tab m-tab-fw m-tab-simple f-cb">
        <h2>详细信息</h2>
    </div>
    <div class="n-detail">
        ${item.detail}
    </div>
</div>
<div class="n-foot">
    <p>版权所有：网易云课堂<a href="http://mooc.study.163.com/smartSpec/detail/85002.htm">Java开发工程师(Web方向)</a>微专业团队</p>
</div>
<script type="text/javascript" src="../js/global.js"></script>
<script type="text/javascript" src="../js/pageShow.js"></script>
</body>
</html>