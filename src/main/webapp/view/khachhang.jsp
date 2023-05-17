<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Danh Sach Khach Hang</h1>
<table border="1px">
    <tr>
        <th>Ten</th>
        <th>Ngay Sinh</th>
        <th>Dia Chi</th>
        <th>Anh</th>
    </tr>
    <c:forEach var="khachHang" items="${khachHang}">
        <tr>
            <td>${khachHang.getName()}</td>
            <td>${khachHang.getNgaySinh()}</td>
            <td>${khachHang.getDiaChi()}</td>
            <td><img src="/img/${khachHang.getAnh()}" width="100"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>