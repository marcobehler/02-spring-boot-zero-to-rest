package com.marcobehler;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 *                                                __   ._.
 *     ___.__. ____  __ __  _______  ____   ____ |  | _| |
 *    <   |  |/  _ \|  |  \ \_  __ \/  _ \_/ ___\|  |/ / |
 *     \___  (  <_> )  |  /  |  | \(  <_> )  \___|    < \|
 *     / ____|\____/|____/   |__|   \____/ \___  >__|_ \__
 *     \/                                      \/     \/\/
 *
 * </pre>
 */
@RestController
public class ShoppingController {


    @RequestMapping(value = "/basket/update", method = RequestMethod.POST)
    public String updateBasket(@RequestParam String name, @RequestParam Integer id, @RequestParam @DateTimeFormat(pattern = "dd.MM.yyyy") Date added) {
        // fake!!!
        return "Item [" + id + " , " + name + " , " + added + " ] got added to the shopping basket!";
    }


    @RequestMapping(value = "/searchItems", method = RequestMethod.GET)
    public List<Item> searchItems(@RequestParam(required = false) String name, @RequestParam(required = false) Integer id,
                                  @RequestParam(required = false) @DateTimeFormat(pattern = "dd.MM.yyyy") Date added) {
        // fake!
        return Arrays.asList(new Item(name, id, added));
    }

    public static class Item {
        public String name;
        public Integer id;
        public Date added;

        public Item() {
        }

        public Item(String name, Integer id, Date added) {
            this.name = name;
            this.id = id;
            this.added = added;
        }
    }
}
