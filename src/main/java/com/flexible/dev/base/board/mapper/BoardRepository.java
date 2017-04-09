package com.flexible.dev.base.board.mapper;

import com.flexible.dev.base.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lsylsy289.
 * Since 2017-04-03
 */

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
