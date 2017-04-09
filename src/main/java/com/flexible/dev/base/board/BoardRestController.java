package com.flexible.dev.base.board;

import com.flexible.dev.base.board.dto.BoardDTO;
import com.flexible.dev.base.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lsylsy289.
 * Since 2017-04-03
 */

@RestController
public class BoardRestController {

    private final BoardService boardService;

    @Autowired
    public BoardRestController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board/list")
    public List<BoardDTO> getList() {
        return boardService.findAll();
    }
}
