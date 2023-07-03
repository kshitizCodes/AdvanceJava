<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<% int count = 0; %>
<% Integer sessionCount = (Integer) session.getAttribute("count"); %>
<% if (sessionCount != null) {
  count = sessionCount;
} %>
<h1>Link Click Counter</h1>
<p>Number of clicks: <%= count %></p>
<% if (request.getParameter("click") != null) {
  count++;
  session.setAttribute("count", count);
} %>
<a href="?click=true">Click Me</a>
</body>
</html>