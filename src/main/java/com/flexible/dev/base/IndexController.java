package com.flexible.dev.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lsylsy289.
 * Since 2017-03-25
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView getIndex() {
        return new ModelAndView("index");
    }

    @GetMapping("/example")
    public ModelAndView getExIndex() {
        return new ModelAndView("home");
    }

    @GetMapping("/refer")
    public ModelAndView getReferenceIndex() {
        return new ModelAndView("referenceIndex");
    }

    @GetMapping("/table")
    public ModelAndView getTable() {
        return new ModelAndView("table");
    }
}
