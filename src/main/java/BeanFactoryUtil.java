

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryUtil {
	private static ApplicationContext ctx_producer = null;

	public static void init() {
		if (ctx_producer != null) {
			return;
		}
		ctx_producer = new ClassPathXmlApplicationContext("spring.xml");
	}

	public static ApplicationContext getContext() {
		init();
		return ctx_producer;
	}
	
}
