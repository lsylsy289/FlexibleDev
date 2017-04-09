package com.flexible.dev.base.board.mapper;

import com.flexible.dev.base.board.dto.BoardDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lsylsy289.
 * Since 2017-04-03
 */

@Repository
public interface BoardMapper {
    public List<BoardDTO> selectList();
}