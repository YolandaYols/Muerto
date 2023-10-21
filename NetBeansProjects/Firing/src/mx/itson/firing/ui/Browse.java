package mx.itson.firing.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.firing.entities.Category;
import mx.itson.firing.entities.CommentUser;
import mx.itson.firing.entities.Post;
import mx.itson.firing.entities.User;
import mx.itson.firing.enums.Rol;

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

        User user2 = new User();
        user2.setName("Namjoon");
        user2.setEmail("Nam@gmail.com");
        user2.setPassword("Nam123");

        User user3 = new User();
        user3.setName("Jungkook");
        user3.setEmail("Jung@gmail.com");
        user3.setPassword("jung123");

        Category category = new Category();
        category.setName("Laughter");

        Date fechaActual = new Date();

        Post post = new Post();
        post.setUser(user);
        post.setCategory(category);
        post.setTitule("Bob toronja");
        post.setDay(fechaActual);
        post.setImagen("      \\`\"-. \n"
                + "        )  _`-. \n"
                + "       ,  : `. \\ \n"
                + "       : _   '  \\ \n"
                + "       ; *` _.   `--._ \n"
                + "       `-.-'          `-. \n"
                + "         |       `       `. \n"
                + "         :.       .        \\ \n"
                + "         | \\  .   :   .-'   . \n"
                + "         :  )-.;  ;  /      : \n"
                + "         :  ;  | :  :       ;-. \n"
                + "         ; /   : |`-:     _ `- ) \n"
                + "      ,-' /  ,-' ; .-`- .' `--' \n"
                + "      `--'   `---' `---' ");
        post.setLike(24);
        post.setDislike(2);

        CommentUser comment1 = new CommentUser();
        comment1.setUser(user2);
        comment1.setRol(Rol.Follower);
        comment1.setDate(fechaActual);
        comment1.setDescription("The cat is funnY, hahahahaha");
        comment1.setLike(10);
        comment1.setDislike(2);

        CommentUser comment2 = new CommentUser();
        comment2.setUser(user3);
        comment2.setRol(Rol.Follower);
        comment2.setDate(fechaActual);
        comment2.setDescription("Cats are beautiful in any color");
        comment2.setLike(5);
        comment2.setDislike(1);

        List<CommentUser> comment = new ArrayList<>();
        comment.add(comment1);
        comment.add(comment2);

        List<CommentUser> comment3 = new ArrayList<>();

        System.out.println("\nUser: " + user.getName()
                + "\n" + post.getCategory().getName()
                + "\n" + post.getTitule()
                + "\n" + post.getDay()
                + "\n" + post.getImagen()
                + "\nLikes: " + post.getLike() + " Dislikes: " + post.getDislike());

        for (CommentUser comm : comment) {
            System.out.println("\nUser: " + comm.getUser().getName() + comm.getDate() + "\n" + comm.getDescription() + "\nLikes " + comm.getLike() + " Dislikes " + comm.getDislike());
        }

    }

}
