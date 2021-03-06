package cn.uc.gamesdk.iface;

import java.util.Map;

import android.os.Bundle;
import cn.uc.gamesdk.ilistener.SdkCallbackListener;

public interface IDispatcher {
	public boolean loadClass(String clazz);

	public Bundle apiInvoke(String apiName, Bundle data);

	public Bundle apiInvoke(String apiName);
	
	public void invokeActivity(IActivityControl activity);

	public void register(SdkCallbackListener listener,Map<String, IDispatcher> dispatcherMap);

	public SdkCallbackListener getRegisterCallback();
}
