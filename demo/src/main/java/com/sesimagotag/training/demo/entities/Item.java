package com.sesimagotag.training.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.*;

@Builder(toBuilder = true)
@Data
public class Item implements Serializable {
    private String id;
    private BigDecimal price;
    private String name;

//    /**
//     * Copy constructor to create a shallow copy of Item object
//     * @param item
//     */
//    public Item(Item item) {
//        this.id = item.id;
//        this.price = new BigDecimal(item.price.toString());
//        this.name = item.name;
//    }
}
