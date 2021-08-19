package com.tms.homework;

import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Product {

    private final int id; //(целое число)
    private String name;        //(строка)
    private int price;       //(целое число)
}
