package LinkedList;

/**
 * 定义一个单向链表，用于管理英雄节点
 *
 * @author Alay
 * @create 2020-01-09 23:03
 */
public class SingleLinkedList {

    //先初始换一个头节点,头节点不要动，不存具体的数据
    private HeroNode head = new HeroNode(0, "", "");

    /**
     * 添加节点到单项链表
     * 思路：（当不考虑编号顺序时）
     * 1、找到当前链表的最后节点
     * 2、将最后节点的 next 域指向添加的新节点
     *
     * @param heroNode
     */
    public void add(HeroNode heroNode) {
        //因为 head节点不能动，因此我们需要一个 temp 辅助遍历
        HeroNode temp = head;

        //遍历链表，找到最后的节点
        while (true) {
            //当 next 域weinull，说明找到节点的最后了
            if (temp.next == null) {
                break;
            }
            //如果没有找到，temp就往后移动一位
            temp = temp.next;
        }
        //当退出循环时，temp就是最后一个节点了,将新节点添加到最后的节点
        temp.next = heroNode;
    }


    /**
     * 根据排名将英雄添加到指定位置
     */
    public void addByOrder(HeroNode heroNode) {
        //因为 head节点不能动，因此我们需要一个 temp 辅助指针(变量)来帮助我们找到添加位置
        //因为是单链表,因此我们的 temp位于添加位置的前一个节点，否则无法插入
        HeroNode temp = head;
        //标识添加的编号是否存在，若已经存在，则无法插入默认false
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                //说明已经在链表的最后了
                break;
            }
            if (temp.next.No > heroNode.No) {
                //位置找到了
                break;
            } else if (temp.next.No == heroNode.No) {
                //说明添加的节点的编号链表中已经存在了
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            //说明编号已存在，不能添加
            System.out.println("插入的英雄的编号已经存在" + heroNode.No);
        } else {
            //可以插入数据，插入到temp的后面
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }


    /**
     * 修改节点
     *
     * @param newNode
     */
    public void update(HeroNode newNode) {
        if (head.next == null) {
            System.err.println("链表为空");
            return;
        }
        //定义一个临时变量辅助遍历
        HeroNode temp = head.next;
        //表示是否找到该节点
        boolean flag = false;
        while (true) {
            //表示已经遍历到链表的最后了
            if (temp == null) {
                break;
            }
            //表示找到了
            if (temp.No == newNode.No) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = newNode.name;
            temp.nickName = newNode.nickName;
        } else {
            System.err.printf("没有找到编号：%d的节点信息\n", newNode.No);
        }
    }


    /**
     * 删除节点
     *
     * @param No
     */
    public void delete(int No) {
        //定义个临时变量辅助遍历
        HeroNode temp = head;
        if (temp.next == null) {
            System.err.println("链表为空");
            return;
        }
        //表示是否找到该节点
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                //表示遍历到最后了
                break;
            }
            if (temp.next.No == No) {
                //节点找到了
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.err.printf("没有找到编号：%d的节点信息\n", No);
        }
    }


    /**
     * 遍历显示链表
     */
    public void list() {
        //如果头节点的 next域无数据，说明链表为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //头结点不能动，需要一个临时变量来辅助遍历
        HeroNode temp = head.next;
        while (true) {
            //遍历到最后了
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            //遍历往后移一位
            temp = temp.next;
        }
    }

    /**
     * 排除头节点 链表大小
     *
     * @return
     */
    public int exHeadSize() {
        //链表为空
        if (head.next == null) {
            return 0;
        }
        int size = 0;
        HeroNode current = head.next;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    /**
     * 含头节点的链表长度
     *
     * @return
     */
    public int inHeadsize() {
        int size = 0;
        HeroNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    /**
     * 是否有下一个节点
     *
     * @return
     */
    public boolean hasNext() {
        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                return false;
            } else {
                return true;
            }
        }
    }


    /**
     * 获取指定索引的元素
     *
     * @param index
     * @return
     */
    public HeroNode getNode(int index) {
        int size = this.exHeadSize();
        if (size == 0) {
            return null;
        } else if (this.exHeadSize() < index) {
            throw new RuntimeException("下角标越界");
        }
        int cursor = 0;
        HeroNode current = this.head;
        while (cursor < index) {
            current = current.next;
            cursor++;
        }
        return current;
    }


    public void reversal() {
        int size = this.inHeadsize();
        if (size == 0) {
            throw new RuntimeException("链表为空");
        }
        HeroNode temp = new HeroNode();
        temp = head;
        head.next=null;
        while (true) {
            if (temp ==null){
                break;
            }
            HeroNode one = temp.next;
            HeroNode two = one.next;
            one.next = temp;
            temp = two;
            if (two!=null){
                two.next = one;
            }
        }
    }
}