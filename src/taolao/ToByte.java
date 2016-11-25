package taolao;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class ToByte {

	public static byte[] parseMapToByte(Map<String, Object> params)
			throws UnsupportedEncodingException {
		StringBuilder postData = new StringBuilder();
		for (Map.Entry<String, Object> entry : params.entrySet()) {
			if (postData.length() != 0) {
				postData.append('&');
			}
			postData.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
			postData.append("=");
			postData.append(URLEncoder.encode(String.valueOf(entry.getValue()),
					"UTF-8"));
		}
		byte[] returnData = postData.toString().getBytes("UTF-8");
		return returnData;
	}
}
