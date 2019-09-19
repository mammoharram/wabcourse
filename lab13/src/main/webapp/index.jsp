<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
    <h1>The Number Quiz : </h1>
    <h3>Your current score is 0.</h3>
    <p>Guess the next number in the sequence</p>
    <h3>sequence is : <%= config.getServletContext().getInitParameter("question") %></h3>
    <form method="post" action="quiz">
        <label>Your answer <input name="answer" id="answer"></label><br/><br/>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
