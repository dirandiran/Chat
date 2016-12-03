<%--
  Created by IntelliJ IDEA.
  User: Troublemaker
  Date: 03.12.2016
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chat</title>
</head>
<body>

<br />
<h4> Hello ${name}! Welcome to ChatRoom </h4>

<textarea id="chatPlace" name="chatPlace" cols="100" rows="30">
    ${message.messageData}
    ${message.message}
</textarea>
<br/>
    <input type="text" name="message" id="message"/> <br/>
    <button type="button" name="sendMessage" id="sendMessage"> send </button> <br/>

</body>
</html>
