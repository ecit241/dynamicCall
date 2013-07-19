package cn.uc.gamesdk;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import cn.uc.gamesdk.ilistener.SdkCallbackListener;
import cn.uc.gamesdk.tools.GlobalVars;

/**
 * 从动态加载类中的统一回调接收方法
 * 
 * @author：ligs@ucweb.com
 */
public class SdkListener implements SdkCallbackListener {

	private static final String CLASS_NAME = "SdkListener";

	private static SdkListener sdkListener = null;

	public static SdkListener getInstance() {
		if (null == sdkListener)
			sdkListener = new SdkListener();

		return sdkListener;
	}

	@Override
	public void callback(String apiName, Bundle data) {
		Log.d(CLASS_NAME, apiName + ":" + data.getString("data"));

		Toast.makeText(GlobalVars.context,
				"api:"+apiName + " call\ndata:" + data.getString("data"),
				Toast.LENGTH_SHORT).show();
	}
}
