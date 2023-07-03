<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
<body>
<%
 LocalDateTime dateTime = LocalDateTime.now();
 String time = dateTime.getHour() + ":" + dateTime.getMinute();
 int hour = dateTime.getHour();
 String message;
 if (hour < 12) {
     message = "Good Morning!";
 } else {
     message = "Good afternoon";
 }
%>
<h1><%=message%>, its <%= time %></h1>
</body>
</html>
