package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test {

	@SuppressWarnings("unused")
	private void ControlSelectedByReflection() {

		List<Product> list = new ArrayList<Product>();

		for (Object obj : list) {

			try {
				Class cls = obj.getClass();
				@SuppressWarnings("unchecked")
				Method mtd = cls.getMethod("setSelected", new Class[] { boolean.class });

				mtd.invoke(obj, true);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
