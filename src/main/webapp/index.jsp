<%@page isELIgnored="false" pageEncoding="utf-8" contentType="text/html; utf_8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:forEach items="${requestScope.user}" var="a">
    名字:${a.name}  密码:${a.pwd}     <br/>
</c:forEach>
</body>
</html>
