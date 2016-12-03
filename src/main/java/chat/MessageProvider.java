package chat;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by pavel on 03.12.16.
 */
public class MessageProvider {

    Map<String, Message> chatMessages;

    public MessageProvider() {
        this.chatMessages = new HashMap<>();
    }

    public Set<Map.Entry<String,Message>> getAll(){
        return chatMessages.entrySet();
    }
}
