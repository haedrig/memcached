
import com.haedrig.service.IUserService;


public class Main {

	public static void main(String[] args) {
		IUserService iUserService = (IUserService) BeanFactoryUtil.getContext().getBean("iUserService");
		System.out.println("first begin");
		iUserService.findUsers();
		System.out.println("first end");
		System.out.println("second begin");
		iUserService.findUsers();
		System.out.println("second end");
		System.out.println("three begin");
		iUserService.findUsers();
		System.out.println("three end");
	}

}
