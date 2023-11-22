package DrinkServices;

import Repository.DrinkRepository;
import ng.edu.binghamuni.inventory.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class DrinkServiceImplement implements DrinkService{

    @Autowired
    DrinkRepository drinkRepository;
    private Optional<Object> OptionalDrink;

    @Override
    public Drink saveDrink(Drink drink) {
        return null;
    }

    @Override
    public Drink getDrinkById(long id) {
        Optional<Drink> drink = drinkRepository.findById(id);

        Drink emptyDrink = null;
        if (drink.isPresent()){
            emptyDrink = drink.get();
            return emptyDrink;
        }else {
            throw new RuntimeException("Drink not found");
        }
    }

    @Override
    public List<Drink> getAllDrink() {
        return null;
    }

    @Override
    public Drink updateDrink(Drink drink) {
        Optional<Drink> optionalDrink = drinkRepository.findById(drink.getId());

        if(optionalDrink.isPresent()){
            Drink updateDrink = new Drink();
            updateDrink.setCapacity(updateDrink.getCapacity());
            updateDrink.setColor(updateDrink.getColor());
            updateDrink.setCompany(updateDrink.getCompany());
            updateDrink.setName(updateDrink.getName());
            updateDrink.setType(updateDrink.getType());
            updateDrink.setId(updateDrink.getId());

            drinkRepository.save(updateDrink);
            return updateDrink;



        }
        else{
            throw new RuntimeException("Drink not found");
        }


    }

    @Override
    public void deleteDrink(long id) {
        drinkRepository.deleteById(id);

    }
}
