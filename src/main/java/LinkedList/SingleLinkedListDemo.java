package LinkedList;

/**
 * @author Alay
 * @create 2020-01-09 23:37
 */
public class SingleLinkedListDemo {

    //测试
    public static void main(String[] args) {

        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.addByOrder(hero4);
        linkedList.addByOrder(hero1);
        linkedList.addByOrder(hero3);
        linkedList.addByOrder(hero2);
        linkedList.list();
        System.err.println(linkedList.getNode(2));
        linkedList.reversal();
        System.out.println("----------xxxxxx-------------");
        linkedList.list();

    }
}
