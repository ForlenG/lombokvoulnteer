import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
}