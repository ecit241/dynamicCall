package cn.uc.gamesdk.iface;

import cn.uc.gamesdk.ilistener.UCCallbackListener;

public interface IDispatcher {
	public boolean loadClass(String clazz);

	public boolean loadMethodFromClass(String apiName,
			UCCallbackListener<String> listener, Object... params);

	public void setClassLoader(IDexClassLoader classLoader);
}
