package my.task.javacourse.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long houseId;

    private String name;

    private String type;

    private Integer rating_plus;

    private Integer rating;

    private Integer prise;

    private Integer date_to_build;

    private Integer number_of_flat;

    public House() {
    }

    public House( String name, String type, Integer rating_plus, Integer rating, Integer prise,
                 Integer date_to_build, Integer number_of_flat) {

        this.name = name;
        this.type = type;
        this.rating_plus = rating_plus;
        this.rating = rating;
        this.prise = prise;
        this.date_to_build = date_to_build;
        this.number_of_flat = number_of_flat;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
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

    public Integer getPrise() {
        return prise;
    }

    public void setPrise(Integer prise) {
        this.prise = prise;
    }

    public Integer getDate_to_build() {
        return date_to_build;
    }

    public void setDate_to_build(Integer date_to_build) {
        this.date_to_build = date_to_build;
    }

    public Integer getNumber_of_flat() {
        return number_of_flat;
    }

    public void setNumber_of_flat(Integer number_of_flat) {
        this.number_of_flat = number_of_flat;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseId=" + houseId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", rating_plus=" + rating_plus +
                ", rating=" + rating +
                ", prise=" + prise +
                ", date_to_build=" + date_to_build +
                ", number_of_flat=" + number_of_flat +
                '}';
    }
}
