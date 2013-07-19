package cn.uc.gamesdk;

import android.app.Activity;
import android.os.Bundle;
import cn.uc.gamesdk.iconst.CApi;
import cn.uc.gamesdk.iface.IActivityControl;

public class ContainerActivity extends Activity implements IActivityControl {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		UCGameSdk.getDefault().enterUI(this);
	}
}
