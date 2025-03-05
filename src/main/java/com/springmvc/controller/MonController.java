package com.springmvc.controller;

import com.springmvc.service.MonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;
import jakarta.servlet.ServletContext;



@Controller
@RequestMapping("/api")
public class MonController {

    //private ApplicationContext applicationContext;

    // Méthode pour obtenir le contexte Spring existant
    private WebApplicationContext getApplicationContext() {
        ServletContext servletContext =
                ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
                        .getRequest().getServletContext();
        WebApplicationContext webApplicationContext =
                WebApplicationContextUtils.getWebApplicationContext(servletContext);
        if (webApplicationContext == null) {
            throw new IllegalStateException("WebApplicationContext not found");
        }
        return webApplicationContext;
    }


    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Controller!";
    }

    @GetMapping("/view")
    public String viewPage(Model model) {
        //old way ! we can get the bean with autowired, but we want to get the bean throw the ApplicationContext
        //MonService monService = (MonService) getApplicationContext().getBean("monServiceImpl");
        MonService monService = getApplicationContext().getBean(MonService.class);
        model.addAttribute("message", monService.getMessage());
        return "mapage"; // renvoie vers /WEB-INF/views/mapage.jsp
    }
}