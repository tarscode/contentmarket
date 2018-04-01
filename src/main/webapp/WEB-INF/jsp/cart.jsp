<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>java</title>
    <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<div class="n-support">请使用Chrome、Safari等webkit内核的浏览器！</div>
<%@include file="common/head.jsp" %>
<div class="g-doc">
    <div class="m-tab m-tab-fw m-tab-simple f-cb">
        <h2>已购买的内容</h2>
    </div>
    <table class="m-table m-table-row n-table g-b3">
        <colgroup>
            <col class="img"/>
            <col/>
            <col class="time"/>
            <col class="price"/>
        </colgroup>
        <thead>
        <tr><
            <th>内容名称</th>
            <th>数量</th>
            <th>购买价格</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${list}">
        <tr>
            <td><h4><a href="/item/${item.id}">${item.title}</a></h4></td>
            <td><span class="v-time">${item.count}</span></td>
            <td><span class="v-unit">¥</span><span class="value">${item.price}</span></td>
        </tr>
        </c:forEach>

        <tfoot>
        <tr>
            <td colspan="3"><a href="/cart/add/${item.id}" class="u-btn u-btn-primary">购 买</a></td>
            <td><<a href="/index" class="u-btn u-btn-primary">退 出</a></td>
        </tr>
        </tfoot>
    </table>
</div>
<div class="n-foot">
    <p>版权所有：网易云课堂<a href="http://mooc.study.163.com/smartSpec/detail/85002.htm">Java开发工程师(Web方向)</a>微专业团队</p>
</div>
</body>
</html>