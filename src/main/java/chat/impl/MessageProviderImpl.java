package chat.impl;

import chat.Message;
import chat.MessageDTO;
import chat.api.MessageProvider;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by pavel on 03.12.16.
 */
@Component
@Scope("singleton")
public class MessageProviderImpl implements MessageProvider {

    Map<String, Message> chatMessages;

    public MessageProviderImpl() {
        this.chatMessages = new HashMap<>();
    }

    public Set<Map.Entry<String,Message>> getAll(){
        return chatMessages.entrySet();
    }

    public void putMessage(MessageDTO messageDTO) {
        chatMessages.put(messageDTO.getUser(), new Message(messageDTO.getMessage(), new Date()));
    }
}
