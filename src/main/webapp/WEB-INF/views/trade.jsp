<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>age</td>
    </tr>
    <c:forEach items="${list}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.trade_name}</td>
            <td>${s.price}</td>
        </tr>
    </c:forEach>
</table>