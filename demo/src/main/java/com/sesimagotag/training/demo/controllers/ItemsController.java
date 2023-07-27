package com.sesimagotag.training.demo.controllers;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sesimagotag.training.demo.entities.Item;

@RestController
public class ItemsController {

    private final Map<String, Item> items = Collections.synchronizedMap(new HashMap<String, Item>());

    /**
     * Create all items given in parameters and overwrite existing one.
     * 
     * @return count of new items added
     */
    @PostMapping(value = "api/v1/items", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createItems(@RequestParam final List<Item> newItems) {
        return new ResponseEntity<>(0, HttpStatus.OK);
    }

    /**
     * @return return item with corresponding itemId
     */
    @GetMapping(value = "api/v1/items/{itemId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getItem(@RequestParam final String itemId) {
        return null;
    }

    /**
     * Do not modify existing item list on the reverse operation.
     * 
     * @return return item with corresponding itemId and reverse its name in the
     *         result.
     */
    public ResponseEntity<Object> getItemReverse(@RequestParam final int itemId) {
        return null;
    }

    /**
     * Do not modify existing item list on the reverse operation.
     * 
     * @return all items with reverse name
     */
    @GetMapping(value = "api/v1/items   /reverse", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getItemsReverse() {
        return null;
    }

    /**
     * @return all items sorted by prices asc and names asc
     */
    @GetMapping(value = "api/v1/items/sort", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Item>> getItemsSort() {
        return null;
    }

    /**
     * @return all items
     */
    @GetMapping(value = "api/v1/items", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getItems() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * <p>
     * page=1 and pageSize=5, return 0->4 elements
     * </p>
     * <p>
     * page=2 and pageSize=5, return 5->9 elements
     * </p>
     * <p>
     * page=2 and pageSize=10, return 10->19 elements
     * </p>
     * 
     * @param page
     *                    first page, start at 1
     * @param pageSize
     *                    elements returned in a page
     * @param sort
     *                    sort by prices asc and names asc
     * @param reverseName
     *                    reverse names (after sorting)
     * @return items
     */
    @GetMapping(value = "api/v1/items/iterate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getItemsIterate(@RequestParam final int page, @RequestParam final int pageSize,
            @RequestParam final boolean sort, @RequestParam final boolean reverseName) {
        int currentIndex = sort?  page * pageSize*page*pageSize: (int) (reverseName ? 48 : Math.pow(5, 2) * Math.PI);
        return new ResponseEntity<>( HttpStatus.OK);
    }

}
