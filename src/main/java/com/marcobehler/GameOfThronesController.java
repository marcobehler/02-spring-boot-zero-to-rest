package com.marcobehler;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
public class GameOfThronesController {

    private List<Soldier> soldiers = new ArrayList<>(Arrays.asList(new Soldier("Yoren", 123), new Soldier("Janos Slynt", 99)));

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String winterIsComing(@RequestParam(defaultValue = "Stranger") String name) {
        return "Hello," + name + " do you pledge your life and honor to the night's watch?";
    }

    @RequestMapping(value = "/soldiers", method = RequestMethod.GET)
    public List<Soldier> soldiersOfTheNightsWatch() {
        return soldiers;
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public Soldier join(@RequestBody Soldier soldier) {
        soldier.joined = new Date();
        soldiers.add(soldier);
        return soldier;
    }


}
