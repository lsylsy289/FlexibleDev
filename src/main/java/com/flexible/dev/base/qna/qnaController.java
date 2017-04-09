package com.flexible.dev.base.qna;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lsylsy289.
 * Since 2017-04-09
 */

@Controller
public class qnaController {

    @GetMapping(value = "/qna/list")
    public ModelAndView getListPage() {
        return new ModelAndView("/base/qna/list");
    }

    @GetMapping(value = "/qna/form")
    public ModelAndView getFormPage() {
        return new ModelAndView("/base/qna/form");
    }

    @GetMapping(value = "/qna/show")
    public ModelAndView getShowPage() {
        return new ModelAndView("/base/qna/show");
    }
}