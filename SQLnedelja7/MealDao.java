package rs.itbootcamp.dao;

import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.MealModel;

import java.util.List;

public interface MealDao {
    void insert(MealModel mm);

    void delete(int id);

    void update(MealModel mm);

    MealModel getMeal(int id);

    List<MealModel> getAllMeals();

    List<String> getFoodMealNames(int mealId);

    List<FoodModel> getFoodMeal(int mealId); // Сва храна за јело са id = meal_id
}
