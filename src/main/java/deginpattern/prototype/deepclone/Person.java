package deginpattern.prototype.deepclone;

import com.sun.corba.se.impl.orb.PropertyOnlyDataCollector;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import sun.net.util.IPAddressUtil;

import java.io.*;

/**
 * @Author: Alay
 * @Date: 2020-07-19 19:33:40
 */
@Data
@AllArgsConstructor
@ToString
public class Person implements Cloneable, Serializable {
    private static final long serialVersionUId = 1L;
    private int age;
    private String name;
    private Car car;


    public Person deepClone() {
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis =null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Person person = null;
        try {
            // 系列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 当前这个对象与对象流形式输出
            oos.writeObject(this);

            // 反系列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            // 将输入流读取称为对象
            person = (Person) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return person;
    }
    @Override
    protected Person clone() throws CloneNotSupportedException {
        // 完成对基本数据类型 和 String 类型的 克隆，即 浅拷贝
        Person person = (Person) super.clone();
        // 再对对象属性进行一次克隆（若多属性则需要一一处理）,深拷贝
        this.car = car.clone();
        return person;
    }

}