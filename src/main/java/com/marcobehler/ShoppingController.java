package com.marcobehler;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

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


    @RequestMapping(value = "/item/{id:\\d+}-{slug:[\\w-]+}")
    public Item details(@PathVariable Integer id, @PathVariable String slug) {
        // fake! db!
        Item item = new Item();
        item.id = id;
        item.slug = slug;
        item.name = "fake name";
        item.details = "This sword is so big, even the mountain couldn't handle it!";
        return item;
    }

    @RequestMapping(value = "/basket/update", method = RequestMethod.POST)
    public String updateBasket(@RequestBody Item item) {
        // fake!!!
        return "Item [" + item.id + " , " + item.name + " , " + item.added + " ] got added to the shopping basket!";
    }


    @RequestMapping(value = "/searchItems", method = RequestMethod.GET)
    public List<Item> searchItems(@RequestParam(required = false) String name, @RequestParam(required = false) Integer id,
                                  @RequestParam(required = false) @DateTimeFormat(pattern = "dd.MM.yyyy") Date added) {
        // fake!
        return Arrays.asList(new Item(name, id, added));
    }

}
