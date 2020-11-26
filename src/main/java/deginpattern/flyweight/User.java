package deginpattern.flyweight;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-09-13 14:04
 */
@Data
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }
}
