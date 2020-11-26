package deginpattern.prototype.deepclone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: Alay
 * @Date: 2020-07-19 19:34:15
 */
@Data
@AllArgsConstructor
@ToString
public class Car implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String brand;
    private String type;

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        return car;
    }
}
