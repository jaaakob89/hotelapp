package pl.sda.project.hotelapp.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;
    private String roomNumber;
    private int beds;
    private BigDecimal price;

}
