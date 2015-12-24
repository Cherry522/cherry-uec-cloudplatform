<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--  isELIgnored="false" -->
<!-- 需要在pom.xml文件中引入jstl包 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- 获取根目录地址，在jsp页面，可以用${ctx}获取该值 -->
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
