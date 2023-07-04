<%@ page import="java.time.LocalDateTime" %>
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
     message = "Good Afternoon!";
 }
%>
<h1><%=message%>, its <%= time %></h1>
</body>
</html>
