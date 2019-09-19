<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<html>
<body>
    <h1 align="center">Beer Recommendations JSP</h1>
    <p>
        <%--<%--%>
        <%--List styles = (List)request.getAttribute("styles");--%>
        <%--Iterator it = styles.iterator();--%>
        <%--while(it.hasNext()) {--%>
        <%--out.print("<br>try: " + it.next());--%>
        <%--}--%>
        <%--%>--%>
        <c:forEach items="${requestScope.styles}" var="style">
            <li><c:out value="${style}"/></li>
        </c:forEach>
</body>
</html>