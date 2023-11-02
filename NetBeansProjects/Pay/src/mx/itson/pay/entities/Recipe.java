package mx.itson.pay.entities;

import com.google.gson.Gson;
import java.util.List;
import mx.itson.pay.enums.Difficulty;

/**
 *
 * @author marcmartinez
 */
public class Recipe {

    private String name;
    private String description;
    private User user;
    private List<String> ingredients;
    private List<Direction> directions;
    private int time;
    private int servings;
    private Difficulty difficulty;
    private List<NutritionFact> nutriotionFacts;

    public Recipe deserialize(String json) {
        Recipe recipe = new Recipe();
        try {
            recipe = new Gson().fromJson(json, Recipe.class);
        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());

        }
        return recipe;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the ingredients
     */
    public List<String> getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * @return the directions
     */
    public List<Direction> getDirections() {
        return directions;
    }

    /**
     * @param directions the directions to set
     */
    public void setDirections(List<Direction> directions) {
        this.directions = directions;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the servings
     */
    public int getServings() {
        return servings;
    }

    /**
     * @param servings the servings to set
     */
    public void setServings(int servings) {
        this.servings = servings;
    }

    /**
     * @return the difficulty
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the nutriotionFacts
     */
    public List<NutritionFact> getNutriotionFacts() {
        return nutriotionFacts;
    }

    /**
     * @param nutriotionFacts the nutriotionFacts to set
     */
    public void setNutriotionFacts(List<NutritionFact> nutriotionFacts) {
        this.nutriotionFacts = nutriotionFacts;
    }

}
