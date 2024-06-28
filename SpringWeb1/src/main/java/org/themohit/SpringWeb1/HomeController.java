package org.themohit.SpringWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView devHome(ModelAndView mv){
        mv.setViewName("developer");
        return mv;
    }

    @ModelAttribute("tech")
    public String getTech(){
        return "React";
    }

    @RequestMapping("/addDeveloper")
    public  String developers(@ModelAttribute("dev1") Developer dev){
        return "result";
    }

//    public  ModelAndView developers(int id,String name,ModelAndView mv){
//        Developer dev=new Developer();
//        dev.setId(id);
//        dev.setName(name);
//        mv.addObject("dev",dev);
//        mv.setViewName("result");
//        return mv;
//    }

    @RequestMapping("/cal")
    public String calHome(){
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView getSum(@RequestParam("num1") int n1, int num2, ModelAndView mv){
        int sum=n1+num2;
        mv.addObject("sum",sum);
        mv.addObject("n1",n1);
        mv.addObject("n2",num2);
        mv.setViewName("result");
        return mv;
    }

//    public String getSum(@RequestParam("num1") int n1, int num2, Model model){
//        int sum=n1+num2;
//        model.addAttribute("sum",sum);
//        model.addAttribute("n1",n1);
//        model.addAttribute("n2",num2);
//        return "result";
//    }

//    public String getSum(HttpServletRequest req, HttpSession session){
//        int n1= Integer.parseInt(req.getParameter("num1"));
//        int n2= Integer.parseInt(req.getParameter("num2"));
//        int sum=n1+n2;
//        session.setAttribute("sum",sum);
//        session.setAttribute("n1",n1);
//        session.setAttribute("n2",n2);
//        System.out.println(sum);
//        return "result.jsp";
//    }
}
