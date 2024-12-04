package the.coyote.contabil.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class teste {
    
    @GetMapping
    public String status() {
        return new String("OK");
    }

}
