package com.flexible.dev.base.board.service;

import com.flexible.dev.base.board.dto.BoardDTO;
import com.flexible.dev.base.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lsylsy289.
 * Since 2017-04-03
 */

@Service
public class BoardService {

    private BoardMapper boardMapper;

    @Autowired
    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<BoardDTO> findAll() {
        return boardMapper.selectList();
    }
}