import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.commons.lang3.StringUtils;

public class MyResourceBundle extends ResourceBundle {

	static Map listKey = new HashMap<String, String>();

	public MyResourceBundle() {
		super();
	}

	@Override
	public Object handleGetObject(String key) {
		String nvKey = StringUtils.lowerCase(StringUtils.trim(key));
		if (listKey.containsKey(nvKey)) {
			return listKey.get(nvKey);
		} else {
			return "  ";
		}
	}


	public static Map getListKey() {
		return listKey;
	}

	public static void setListKey(Map listKey) {
		MyResourceBundle.listKey = listKey;
	}

	@Override
	public Enumeration<String> getKeys() {
		return null;
	}

}