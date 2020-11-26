package juc;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * CopyOnWriteArrayList/CopyOnWirteArraySet ： "写入并复制"
 * 注意：若写入操作多是，不建议使用，因为每次都会进行复制。若并发迭代多操多时建议使用。
 */
public class TestCopyOnWriteArrayList {
	
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		
		for (int i = 0; i < 10; i++) {
			new Thread(td).start();
		}
	}

}

class ThreadDemo implements Runnable{
	
//	private static List<String> list = Collections.synchronizedList(new ArrayList<>());
	
	private static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
	
	static{
		list.add("AA");
		list.add("BB");
		list.add("CC");
	}

	@Override
	public void run() {
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			
			list.add("AA");
		}
	}
	
}