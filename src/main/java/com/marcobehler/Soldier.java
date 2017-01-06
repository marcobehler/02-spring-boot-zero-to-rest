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
public class Soldier {

    public String name;

    public Integer numberOfBattles;

    public Date joined;

    public Soldier() {
    }

    public Soldier(String name, Integer numberOfBattles) {
        this.name = name;
        this.numberOfBattles = numberOfBattles;
    }
}
