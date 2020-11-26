package LinkedList;

/**
 * 定义一个HeroNode,每一个HeroNode对象就是一个节点
 *
 * @author Alay
 * @create 2020-01-09 22:55
 */
public class HeroNode {

    //data域
    public int No;
    public String name;
    public String nickName;

    //next域
    public HeroNode next;

    public HeroNode() {
    }

    public HeroNode(int no, String name, String nickName) {
        No = no;
        this.name = name;
        this.nickName = nickName;
    }

    /**
     * 为了显示方便，重写toString()
     *
     * @return
     */
    @Override
    public String toString() {
        return "HeroNode{" +
                "No=" + No +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
