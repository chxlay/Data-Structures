package deginpattern.ocp;

/**
 * @Author: Alay
 * @Date: 2020-07-17 20:07:10
 */
public class Ocp {

    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        //新增功能时改动源代码才能满足需求
        graphicEditor.drawShape(new Triangle());
    }
}

class GraphicEditor {
    //接收 Shape 对象，然后根据 type，来绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }

}

/**
 * Shape 类基类
 */
abstract class Shape {

    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println(" 绘制矩形 ");
    }
}


class Circle extends Shape {
    @Override
    void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

/**
 * 新增画三角形
 */
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

