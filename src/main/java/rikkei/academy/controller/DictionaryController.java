package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/translate")
    public String translate(@RequestParam String text, Model model) {
        Map<String, String> map = new HashMap<>();
        map.put("mot", "one");
        map.put("hai", "two");
        map.put("ba", "three");
        map.put("bon", "four");
        map.put("nam", "five");
        String result = map.get(text);
        if (result == null) {
            result = "Khong tim thay";
        }
        model.addAttribute("result", result);
        return "result";
    }
}
