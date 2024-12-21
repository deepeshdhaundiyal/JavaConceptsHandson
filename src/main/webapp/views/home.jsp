<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple JSP Example</title>
</head>
<body>
    <%
        String name = "John Doe";
        out.println("<h1>Hello, " + name + "!</h1>");
    %>

    <p>Current time: <%= new java.util.Date() %></p>

    <%!
        int number = 42;
        String message = "This is a message from declaration!";
    %>

    <p>Number: <%= number %></p>
    <p>Message: <%= message %></p>

    <%
        for (int i = 1; i <= 5; i++) {
            %>
            <p>Count: <%= i %></p>
            <%
        }
    %>

    <p>Expression Example: ${number + 10}</p>

    <%-- This is a JSP comment --%>
</body>
</html>
