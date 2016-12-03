package chat.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Troublemaker on 03.12.2016.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showGo()
    {
        ModelAndView mov = new ModelAndView("index");

       // mov.setViewName("index");

        return mov;
    }
   /* @RequestMapping(value = "/chat", method = RequestMethod.POST)
    public ModelAndView chatGo(@ModelAttribute(value = "name") String name)
    {
        ModelAndView modelAndView = new ModelAndView("chat");
        modelAndView.addObject(name);
        return modelAndView;
    }*/
}
