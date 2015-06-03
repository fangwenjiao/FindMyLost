package com.example.findmylost.activity;



import com.example.findmylost.R;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;


	@SuppressLint("HandlerLeak")
	public class SplashActivity extends BaseActivity {

		@Override
		public void setContentView() {
			// TODO Auto-generated method stub
			setContentView(R.layout.activity_splash);

		}

		@Override
		public void initViews() {
			// TODO Auto-generated method stub

		}

		@Override
		public void initListeners() {
			// TODO Auto-generated method stub

		}

		@Override
		public void initData() {
			// TODO Auto-generated method stub
			mHandler.sendEmptyMessageDelayed(GO_HOME, 3000);
		}

		public void goHome() {
			Intent intent = new Intent(this, MainActivity.class);
			startActivity(intent);
			this.finish();
		}

		private static final int GO_HOME = 100;
		
		private Handler mHandler = new Handler() {
			@Override
			public void handleMessage(Message msg) {
				switch (msg.what) {
				case GO_HOME:
					goHome();
					break;
				}
			}
		};
	
	
	
	
	
	
	
}
