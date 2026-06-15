<%--
  Created by IntelliJ IDEA.
  User: Huyen
  Date: 6/15/2026
  Time: 8:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%--Phải thêm config JSTL vào file pom.xml--%>
<%--JSTL (JavaServer Pages Standard Tag Library) là một thư viện thẻ tiêu chuẩn dành cho JSP
JSTL được chia thành 5 nhóm thẻ chính, mỗi nhóm được thiết kế cho một mục đích cụ thể:
    1. Core Tags (c): Cung cấp các thẻ để điều khiển luồng (như if, choose, forEach), xử lý biến, xuất dữ liệu, và các tác vụ khác.
        Thư viện lõi (core):
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    2. Formatting Tags (fmt): Cung cấp các thẻ để định dạng số, ngày tháng, văn bản,...
        Thư viện định dạng (format):
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    3. Function Tag
        Thư viện hàm (function):
        <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    4. SQL Tags (sql):
    Cung cấp các thẻ để tương tác với cơ sở dữ liệu, cho phép thực hiện các truy vấn SQL trực tiếp trong JSP.
    Tuy nhiên, việc sử dụng SQL trong JSP không được khuyến khích trong các ứng dụng thực tế, vì nó vi phạm mô hình phân lớp (MVC).
        <%@taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql" %>
    5. XML Tags (x): Cung cấp các thẻ để xử lý và biến đổi dữ liệu XML.
    JSTL (Java Standard Tag Library) có 5 bộ thư viện thẻ tiêu chuẩn hỗ trợ lập trình render giao diện phía server, truy xuất CSDL, xử lý XML
        <%@taglib uri="http://java.sun.com/jstl/xml_rt" prefix="xml" %>

    Hai thư viện cuối (xml và sql) làm việc với CSDL và XML ít được sử dụng nên không được giới thiệu trong môn học này (các bạn tham khảo thêm)

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
            <th>ID</th>
            <th>Mã</th>
            <th>Tên</th>
            <th>Mô Tả</th>
            <th>Mã Loại SP</th>
            <th>Tên Loại SP</th>
            <th>Hành động</th>
        </thead>
        <tbody>
            <c:forEach items="${listSP}" var="sp" varStatus="i">
                <tr>
                    <td>${sp.id}</td>
                    <td>${sp.ma}</td>
                    <td>${sp.ten}</td>
                    <td>${sp.moTa}</td>
                    <td>${sp.loaiSP.ma}</td>
                    <td>${sp.loaiSP.ten}</td>
                    <td>
                        <a href="#">Detail</a>
                        <a href="#">Update</a>
                        <a href="#">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
