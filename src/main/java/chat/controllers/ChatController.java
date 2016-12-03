package chat.controllers;

import chat.Message;
import chat.MessageDTO;
import chat.api.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.Set;

/**
 * Created by Troublemaker on 03.12.2016.
 */
@Controller
@RequestMapping(value = "/chat")
public class ChatController {

    @Autowired
    MessageProvider messageProvider;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showChat(){
        ModelAndView modelAndView = new ModelAndView("chat");
        //modelAndView.addObject("name", name);
        return modelAndView;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView chatGo(@RequestParam(value = "name") String name)
    {
        ModelAndView modelAndView = new ModelAndView("chat");
        modelAndView.addObject("name", name);
        //MessageDTO messageDTO = generateMessageDTO(name);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/ajax", method = RequestMethod.POST)
    public Set<Map.Entry<String,Message>> generateMessageDTO(@RequestBody MessageDTO messageDTO){

        messageProvider.putMessage(messageDTO);

        return messageProvider.getAll();
    }

}
