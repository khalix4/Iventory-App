package Api;

import DrinkServices.DrinkService;
import Repository.DrinkRepository;
import ng.edu.binghamuni.inventory.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class DrinkApiController {

    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkService drinkService;

    @RequestMapping("/drinks")
    @GetMapping("/drinks")

    public ResponseEntity<List<Drink>> getAllDrinks(){
        return ResponseEntity.ok().body(drinkService.getAllDrinks());
    }


}
