<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set value="${pageContext.request.contextPath}" var="contextPath"/>
<c:set value="${contextPath}/resources" var="resPath"/>

<div id="templatemo_header">

    <div id="site_title">
    </div>

    <div id="templatemo_rss">
        <a href="" target="_parent">SUBSCRIBE<br/><span>OUR FEED</span></a>
    </div>

    <div id="languages">
        <a href="?lang=ru"><img src="${resPath}/images/russia.png" alt="russian language"></a>
        <a href="?lang=en"><img src="${resPath}/images/usa.png" alt="english language"></a>
    </div>

</div>
<!-- end of header -->
