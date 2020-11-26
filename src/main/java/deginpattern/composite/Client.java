package deginpattern.composite;

/**
 * @Author: Alay
 * @Date: 2020-07-30 22:32:47
 */
public class Client {

    public static void main(String[] args) {
        // 创建大学
        University university = new University("清华大学", "中国顶级院校");

        // 创建学院
        College computerCollege = new College("计算机学院", "搞计算机的学院");
        College infoEnginnerCollege = new College("信息工程学院", "搞信息工程的学院");

        // 创建专业
        Department department1 = new Department("软件工程", "软件开发的");
        Department department2 = new Department("网络工程", "网络开发的");
        Department department3 = new Department("计算机科学与技术", "计算机科学老牌专业");

        Department department4 = new Department("信息工程", "计信息工程不错");
        Department department5 = new Department("通讯工程", "通讯工程不错");

        // 将专业放入学院
        computerCollege.add(department1);
        computerCollege.add(department2);
        computerCollege.add(department3);

        infoEnginnerCollege.add(department4);
        infoEnginnerCollege.add(department5);

        // 将学院放入大学
        university.add(computerCollege);
        university.add(infoEnginnerCollege);

        // 输出整个学校的信息
        university.print();

        // 输出某个学院的信息
        computerCollege.print();

        // 输出某个专业的信息
        department5.print();
    }
}