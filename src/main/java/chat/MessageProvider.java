package chat;

import java.util.Map;
import java.util.Set;

/**
 * Created by pavel on 03.12.16.
 */
public interface MessageProvider {

    Set<Map.Entry<String,Message>> getAll();

    void putMessage(MessageDTO messageDTO);

}
