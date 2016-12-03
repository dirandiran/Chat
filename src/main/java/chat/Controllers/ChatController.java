package chat.Controllers;

import chat.Message;
import chat.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
        return modelAndView;
    }

}
