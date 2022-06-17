package my.task.javacourse.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer season_id;
    private String name;
    private Integer rating;

    public Season() {
    }

    public Season(Integer season_id, String name, Integer rating) {
        this.season_id = season_id;
        this.name = name;
        this.rating = rating;
    }

    public Integer getSeason_id() {
        return season_id;
    }

    public void setSeason_id(Integer season_id) {
        this.season_id = season_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Season{" +
                "season_id=" + season_id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
