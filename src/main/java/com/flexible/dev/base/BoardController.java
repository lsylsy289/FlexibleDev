package com.flexible.dev.base;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lsylsy289.
 * Since 2017-04-01
 */

@Controller
public class BoardController {

    @GetMapping("/board")
    public String getPage() {
        return "/base/board";
    }
}