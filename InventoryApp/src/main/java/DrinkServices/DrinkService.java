package DrinkServices;

import ng.edu.binghamuni.inventory.domain.Drink;

import java.util.List;

public interface DrinkService {


    Drink saveDrink(Drink drink);

    Drink getDrinkById(long id);

    List<Drink> getAllDrinks();

    Drink updateDrink(long id);

    List<Drink> getAllDrink();

    Drink updateDrink(Drink drink);

    void deleteDrink(long id);
}
