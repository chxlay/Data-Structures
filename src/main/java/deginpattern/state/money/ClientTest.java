package deginpattern.state.money;

/**测试类*/
public class ClientTest {

	public static void main(String[] args) {
		Context context = new Context();
		// 将当前状态设置未发布状态
        context.setState(new PublishState());
        //然后可以根据操作变化状态.
        System.err.println(context.getState().getCurrentState());
        //publish --> not pay
       context.acceptOrderEvent(context);
        //not pay --> paid
        context.payOrderEvent(context);

        // 失败, 检测失败时，会抛出异常
        try {
        	context.checkFailEvent(context);
        	System.out.println("流程正常..");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
        
	}

}