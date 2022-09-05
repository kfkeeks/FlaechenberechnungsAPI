package com.example.FlaechenberechnungsAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FlaechenberechnungsController {

    FlaechenberechnungsService service =new FlaechenberechnungsService();

   @GetMapping("/calculate")
   public double circle(@RequestParam double circle) {
       return service.circle(circle);
   }
    @GetMapping("/square")
    public double square(@RequestParam double square){
        return service.square(square);
    }

}
