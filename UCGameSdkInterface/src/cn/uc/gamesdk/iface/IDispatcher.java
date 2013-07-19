package cn.uc.gamesdk.iface;

import android.os.Bundle;
import cn.uc.gamesdk.ilistener.SdkCallbackListener;

public interface IDispatcher {
	public boolean loadClass(String clazz);

	public Bundle loadMethodFromClass(String apiName, Bundle data);

	public Bundle loadMethodFromClass(String apiName);
	
	public void invokeActivity(IActivityControl activity);

	public void registerCallback(SdkCallbackListener listener);

	public SdkCallbackListener getRegisterCallback();
}
