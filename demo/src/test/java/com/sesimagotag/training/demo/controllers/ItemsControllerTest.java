package com.sesimagotag.training.demo.controllers;

import com.sesimagotag.training.demo.entities.Item;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItemsControllerTest {

    /**
     * Tests creation of Item object
     */
    @Test
    public void createItem() {
        // Initialize array list of items
        List<Item> items = new ArrayList<Item>();

        // Add item objects to array list using lombok builder pattern
        items.add(Item.builder()
                .id("aaa1")
                .price(BigDecimal.valueOf(4.54))
                .name("5234")
                .build());

        items.add(Item.builder()
                .id("aaa2")
                .price(BigDecimal.valueOf(2.54))
                .name("3235")
                .build());

        items.add(Item.builder()
                .id("aaa3")
                .price(BigDecimal.valueOf(1.54))
                .name("1236")
                .build());

        items.add(Item.builder()
                .id("aaa4")
                .price(BigDecimal.valueOf(3.54))
                .name("5237")
                .build());

        items.add(Item.builder()
                .id("aaa5")
                .price(BigDecimal.valueOf(5.66))
                .name("2456")
                .build());

        items.add(Item.builder().id("aaa6")
                .price(BigDecimal.valueOf(45.66))
                .name("1234")
                .build());

        System.out.println(items);
    }
}
