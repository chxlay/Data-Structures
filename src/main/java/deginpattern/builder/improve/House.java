package deginpattern.builder.improve;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @Author: Alay
 * @Date: 2020-07-19 21:11:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
// 产品 -->>Product
public class House {
    private String baise;
    private String wall;
    private String roofed;
}
