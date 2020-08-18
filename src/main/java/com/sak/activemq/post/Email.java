package com.sak.activemq.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by seokgi4885@gmail.com on 2020-08-18.
 */
@Getter
@Setter
@AllArgsConstructor
public class Email {

    private String to;
    private String body;
}
