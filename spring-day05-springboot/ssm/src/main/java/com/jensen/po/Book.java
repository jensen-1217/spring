package com.jensen.po;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {


    private Integer id;
    private String type;
    private String name;
    private String description;


}
