package com.ttcs.socialmedia.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDTO {
    private int id;
    private String firstMediaName;
    private int likes;
    private int comments;
}
