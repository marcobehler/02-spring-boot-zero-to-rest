package com.marcobehler;

import java.util.Date;

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
public class Item {

    public String name;
    public Integer id;
    public Date added;
    public String slug;
    public String details;

    public Item() {
    }

    public Item(String name, Integer id, Date added) {
        this.name = name;
        this.id = id;
        this.added = added;
    }
}
