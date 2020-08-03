package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiceController {


    @GetMapping("/roll-dice")
    public String dice() {
        return "dice";
    }

    @GetMapping("/roll-dice/{number}")
    @ResponseBody
    public String rolled(@PathVariable int number, Model model) {
        int randomNum = (int) Math.floor((Math.random() * 5) + 1);
        if(number == randomNum) {
            return "You rolled a " + randomNum + " and guessed " + number + ", you guessed correctly!";
        } else {
            return "You rolled a " + randomNum + " and guessed " + number + ", you guessed incorrectly...";
        }
    }
}
