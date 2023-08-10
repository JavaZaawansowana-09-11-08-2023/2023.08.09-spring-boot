package pl.comarch.szkolenia.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class SimpleController {

    @RequestMapping(path = "/test1", method = RequestMethod.GET)
    public String test1() {
        System.out.println("cos zadzialalo !!!");
        return "test1";
    }

    @RequestMapping(path = "/test2", method = RequestMethod.GET)
    public String test2(@RequestParam("param1") String a,
                        @RequestParam("param2") String b) {
        System.out.println(a);
        System.out.println(b);
        return "test1";
    }

    @GetMapping(path = "/test3/{param1}/{param2}")
    public String test3(@PathVariable("param1") String a,
                        @PathVariable String param2) {
        System.out.println(a);
        System.out.println(param2);
        return "test1";
    }

    @GetMapping(path = "/form")
    public String form() {
        return "form";
    }

    @PostMapping(path = "/form")
    public String form2(@RequestParam String name,
                        @RequestParam String surname,
                        @RequestParam int age) {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        return "test1";
    }

    @GetMapping(path = "/test4")
    public String test4(Model model) {
        String name = "Wiesiek";
        model.addAttribute("imie", name);
        List<String> names = new ArrayList<>();
        names.add("Karol");
        names.add("Mateusz");
        names.add("Janusz");
        names.add("Zbyszek");
        model.addAttribute("imiona", names);
        model.addAttribute("random", names.get(new Random().nextInt(4)));
        return "test2";
    }

    @GetMapping(path = "/form2")
    public String form2(Model model) {
        User user = new User();
        System.out.println(user);
        model.addAttribute("modelObject", user);
        return "form2";
    }

    @PostMapping(path = "/form2")
    public String form2(@ModelAttribute User user) {
        System.out.println(user);
        return "test1";
    }
}
