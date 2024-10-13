package com.bruno.shopSystem.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class StandardError implements Serializable{
    private Instant timeStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
