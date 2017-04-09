package com.flexible.dev.base.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lsylsy289.
 * Since 2017-04-01
 */

@Controller
public class BoardController {

    @GetMapping("/board")
    public ModelAndView getPage() {
        return new ModelAndView("redirect:/board/list");
    }

    @GetMapping("/board/register")
    public ModelAndView register() {
        return new ModelAndView("/base/board/register");
    }
}