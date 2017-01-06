package com.marcobehler;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
public class ParamsController {

    @RequestMapping(value = "/requestParam")
    public String requestParam(@RequestParam String name) {
        return "Hello, " + name + " what a nice request param!";
    }


    @RequestMapping(value = "/requestBody")
    public String requestBody(@RequestBody User user) {
        return "Hello, " + user.name + " " + user.age + " what a nice request body!";
    }

    public static class User {
        public String name;
        public Integer age;
    }

}
