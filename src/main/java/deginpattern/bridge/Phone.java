package deginpattern.bridge;

import lombok.Data;

/**
 * @Author: Alay
 * @Date: 2020-07-21 21:24:14
 */
@Data
public abstract class Phone {

    private Brand brand;

    public void open() {
        this.brand.open();
    }

    public void close() {
        this.brand.close();
    }

    public void call() {
        this.brand.call();
    }
}
