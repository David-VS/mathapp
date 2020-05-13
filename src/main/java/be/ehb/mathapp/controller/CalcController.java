package be.ehb.mathapp.controller;

import be.ehb.mathapp.utils.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalcController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public int sum(@RequestParam(value = "a") int a,
                   @RequestParam(value = "b") int b){
        return Calculator.sum(a, b);
    }
}
