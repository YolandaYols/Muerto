package mx.itson.firing.entities;

import java.util.Date;
import java.util.List;
import mx.itson.firing.enums.Rol;

/**
 * FirinG* users have access to react to posts
 *
 * @author marcmartinez
 */
public class CommentUser {

    private List<CommentUser> comment;
    private String description;
    private int like;
    private int dislike;
    private User user;
    private Date date;
    private Rol rol;

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<CommentUser> getComment() {
        return comment;
    }

    public void setComment(List<CommentUser> comment) {
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
