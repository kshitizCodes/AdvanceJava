<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<form action="${pageContext.request.contextPath}/hello" method="post">
    <input type="text" name="name"><br/>
    <input type="text" name="address"><br/>
    <input type="submit" value="Submit">
</form>
</body>
</html>
</html>