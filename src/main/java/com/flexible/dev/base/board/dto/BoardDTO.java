package com.flexible.dev.base.board.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by lsylsy289.
 * Since 2017-04-03
 */

@Data
public class BoardDTO {

    private String title;
    private String content;
    private LocalDateTime rgstDate;
}
