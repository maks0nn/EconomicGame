package my.task.javacourse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Magazine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer magazine_id;
    private String name;
    private String type;
    private Integer rating_plus;
    private Integer rating;
    private  Integer date_to_build;

    public Magazine() {
    }

    public Magazine(Integer magazine_id, String name, String type, Integer rating_plus, Integer rating, Integer date_to_build) {
        this.magazine_id = magazine_id;
        this.name = name;
        this.type = type;
        this.rating_plus = rating_plus;
        this.rating = rating;
        this.date_to_build = date_to_build;
    }

    public Integer getMagazine_id() {
        return magazine_id;
    }

    public void setMagazine_id(Integer magazine_id) {
        this.magazine_id = magazine_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRating_plus() {
        return rating_plus;
    }

    public void setRating_plus(Integer rating_plus) {
        this.rating_plus = rating_plus;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getDate_to_build() {
        return date_to_build;
    }

    public void setDate_to_build(Integer date_to_build) {
        this.date_to_build = date_to_build;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "magazine_id=" + magazine_id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", rating_plus=" + rating_plus +
                ", rating=" + rating +
                ", date_to_build=" + date_to_build +
                '}';
    }
}
