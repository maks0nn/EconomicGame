package my.task.javacourse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer investor_id;

    private String name;

    private String surname;

    private Integer cash;

    public Investor() {
    }

    public Investor(Integer investor_id, String name, String surname, Integer cash) {
        this.investor_id = investor_id;
        this.name = name;
        this.surname = surname;
        this.cash = cash;
    }

    public Integer getInvestor_id() {
        return investor_id;
    }

    public void setInvestor_id(Integer investor_id) {
        this.investor_id = investor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Investor{" +
                "investor_id=" + investor_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cash=" + cash +
                '}';
    }
}
