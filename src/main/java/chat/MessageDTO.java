package chat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by pavel on 03.12.16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageDTO {
    private String user;
    private String message;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
