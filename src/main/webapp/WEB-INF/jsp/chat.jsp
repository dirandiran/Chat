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
    <script   src="http://code.jquery.com/jquery-2.2.4.min.js"   integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>
    <script type="text/javascript">
        $(document).ready(function (){
            $('#sendMessage').click(function () {
                var message = $('#message').val();
                var user = $('#nickName').val();
                var jsonString = JSON.stringify({
                    user : user,
                    message : message
                });
                $.ajax({
                    type: 'POST',
                    headers: {
                        'Accept': 'application/json',
                        'Content-Type': 'application/json'
                    },
                url: '/chat/ajax',
                        contentType: "application/json; charset=utf-8",
                        data: jsonString,
                        async: false,
                        cache: false,
                        processData:false,
                        success: function (result) {}
                });
            });
        });
    </script>
</head>
<body>

<br />
<h4> Hello ${name}! Welcome to ChatRoom </h4>
<input type = "hidden" value="${name}" id="nickName"/>
<textarea id="chatPlace" name="chatPlace" cols="100" rows="30" readonly>
    ${message.messageData}
    ${message.message}
</textarea>
<br/>
    <input type="text" name="message" id="message"/> <br/>
    <button type="button" name="sendMessage" id="sendMessage"> send </button> <br/>

</body>
</html>
