package com.flexible.dev.base.board.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by lsylsy289.
 * Since 2017-04-02
 */

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="REGISTRATION_DATE")
    private LocalDateTime rgstDate;
}
