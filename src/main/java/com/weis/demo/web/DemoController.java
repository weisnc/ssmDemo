package com.weis.demo.web;

import com.weis.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jiangwei on 05/07/2017.
 */
@Controller
public class DemoController {
    @Autowired
    private BookService bookService;

    @RequestMapping("index")
    public String index(HttpServletRequest request, Model model) {
        model.addAttribute("name", "weis");
        bookService.getList();
        return "index";
    }
}
