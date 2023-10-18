package mx.itson.firing.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.firing.entities.Category;
import mx.itson.firing.entities.Chatg;
import mx.itson.firing.entities.Post;
import mx.itson.firing.entities.User;

/**
 *
 * @author marcmartinez
 */
public class Browse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        User user = new User();
        user.setName("Yoli Martinez ");
        user.setEmail("Yols123@gmail.com");
        user.setPassword("btsIsMyLive");

        Category category = new Category();
        category.setName("Laughter");

        Date fechaActual = new Date();

        Post post = new Post();
        post.setUser(user);
        post.setCategory(category);
        post.setTitule("Bob toronja");
        post.setDay(fechaActual);
        post.setImagen("  /\\_/\\  \n"
                + " ( o.o ) \n"
                + "  > ^ <");

        List<String> comment = new ArrayList<>();
        comment.add("Your cat is very cute");

        List<String> reply = new ArrayList<>();
        reply.add("Thank you, I love cats");
      

        Chatg chatg = new Chatg();
        chatg.setComment(comment);
        chatg.setLike(110);
        chatg.setDislike(20);

        System.out.println("\n ----- Twit Firing -----"
                + "\n\n" + user.getName()
                + "\n" + fechaActual
                + "\n" + post.getImagen()
                + "\n-" + post.getTitule()
                + "\nSeptember 1st"
                + "\nLike " + chatg.getLike() + " Dislike " + chatg.getDislike() + " Comments 2\n");
        for (String a : comment) {
            System.out.println("Anonimo: " + a);
            for (String b : reply) {
                System.out.println("Yoli: "+ b);
            }

        }
    }

}
