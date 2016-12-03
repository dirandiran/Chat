package chat;

import java.util.Date;

/**
 * Created by pavel on 03.12.16.
 */
public class Message {
    private String message;

    private Date messageData;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getMessageData() {
        return messageData;
    }

    public void setMessageData(Date messageData) {
        this.messageData = messageData;
    }

    public Message(String message, Date messageData) {
        this.message = message;
        this.messageData = messageData;
    }
}
