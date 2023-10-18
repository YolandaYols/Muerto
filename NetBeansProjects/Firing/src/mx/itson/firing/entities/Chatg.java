package mx.itson.firing.entities;

import java.util.List;

/**
 * FirinG* users have access to react to posts
 *
 * @author marcmartinez
 */
public class Chatg {

    private List<String> comment;
    private int like;
    private int dislike;
    private User user;

    public List<String> getComment() {
        return comment;
    }

    public void setComment(List<String> comment) {
        this.comment = comment;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
