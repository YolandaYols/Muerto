package mx.itson.pay.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.pay.entities.Direction;
import mx.itson.pay.entities.NutritionFact;
import mx.itson.pay.entities.Recipe;
import mx.itson.pay.entities.User;
import mx.itson.pay.enums.Difficulty;

/**
 *
 * @author marcmartinez
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        serialización -> objeto a String json 
        deserialización -> String json a objeto
        
        .jar -> java archive (es un empaquetado de clases compiladas)
        .java -> son clases de código fuente 
        .class -> clases compiladas 
        generico -> puede ser de cualquier tipo
        
        */
        
        User user = new User();
        user.setName("Yols");
        user.setEmail("Yols@gmail.com");
        user.setPassword("Yols19");

        List<String> ingredients = new ArrayList<>();
        ingredients.add("3/4 Cup of CARNATION® CLAVEL® Evaporated Milk");
        ingredients.add("1 egg");
        ingredients.add("2 Tablespoons of melted butter");

        Recipe recipe1 = new Recipe();
        recipe1.setName("Classic Hot Cakes");
        recipe1.setDescription("A breakfast classic: HOT CAKES prepared with CARNATION® CLAVEL® EVAPORATED MILK and the touch of LA LECHERA®. The recipe that cannot be missed.");

        recipe1.setUser(user);
        Direction d1 = new Direction();
        d1.setStep(1);
        d1.setDescription("Mix the CARNATION® CLAVEL® Evaporated Milk with the egg 2 tablespoons of melted butter The vanilla essence and the pancake flour.");

        Direction d2 = new Direction();
        d2.setStep(2);
        d2.setDescription("Heat a frying pan, add a little butter and with the help of a ladle pour a little of the mixture to form the hot cakes; Cook on both sides and repeat the procedure with the rest of the preparation.");

        Direction d3 = new Direction();
        d3.setStep(3);
        d3.setDescription("Serve the hot cakes, decorate with blueberries, strawberries, mint leaves and a little LA LECHERA® Condensed Milk Serve Easy. Offers.");

        List<Direction> directions = new ArrayList<>();
        directions.add(d1);
        directions.add(d2);
        directions.add(d3);

        Recipe recipe = new Recipe();
        recipe.setName("Classic Hot Cakes");
        recipe.setDescription("A breakfast classic..");
        recipe.setUser(user);
        recipe.setIngredients(ingredients);
        recipe.setDirections(directions);
        recipe.setTime(90);
        recipe.setServings(6);
        recipe.setDifficulty(Difficulty.MEDIUM);
        //recipe.setNutriotionFacts(nutriotionFacts);
       

        NutritionFact nitrition = new NutritionFact();
        nitrition.setName("Carbohydrates ");
        nitrition.setValue("15.5 g");
        NutritionFact nitrition2 = new NutritionFact();
        nitrition2.setName("Energy ");
        nitrition2.setValue("137.8 kcal");
        NutritionFact nitrition3 = new NutritionFact();
        nitrition3.setName("Fat ");
        nitrition3.setValue("6.7 g");
        NutritionFact nitrition4 = new NutritionFact();
        nitrition4.setName("Sodium ");
        nitrition4.setValue("45.7 mg");

        List<NutritionFact> nutritionsFacts = new ArrayList<>();
        nutritionsFacts.add(nitrition);
        nutritionsFacts.add(nitrition2);
        nutritionsFacts.add(nitrition3);
        nutritionsFacts.add(nitrition4);
        
        
        System.out.println("\n"+recipe1.getName()
                + "\n"+recipe.getDescription()
                + "\nserve: "+ recipe.getServings()
                + "\nDificultad: "+recipe.getDifficulty()
                +"\nCreated by: "+user.getName()
                +"\n\nIngredients"
                +"\n"+recipe.getIngredients().get(0)
                +"\n"+recipe.getIngredients().get(1)
                +"\n"+recipe.getIngredients().get(2)
                +"\n\nRecipe: "
                +"\n"+d1.getStep() +" "+d1.getDescription()
                +"\n"+d2.getStep() +" "+d2.getDescription()
                +"\n"+d3.getStep() +" "+d3.getDescription()
                +"\n\nNutrition Facts: "
                +"\n"+nitrition.getName()+nitrition.getValue() 
                +"\n"+nitrition2.getName()+nitrition2.getValue()
                +"\n"+nitrition3.getName()+nitrition3.getValue()
                +"\n"+nitrition4.getName()+nitrition4.getValue());
        
        
        
        
        
        
        
        


    }

}
