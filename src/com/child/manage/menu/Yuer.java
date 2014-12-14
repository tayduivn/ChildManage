package com.child.manage.menu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.child.manage.ChildApplication;
import com.child.manage.R;
import com.child.manage.anim.UgcAnimations;
import com.child.manage.base.FlipperLayout;
import com.child.manage.ui.CheckInActivity;
import com.child.manage.ui.VoiceActivity;
import com.child.manage.ui.WriteRecordActivity;
import com.child.manage.util.ActivityForResultUtil;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 菜单首页类
 * 
 * @author rendongwei
 * 
 */
public class Yuer {
    private Button mMenu;
	private Context mContext;
	private Activity mActivity;
	private ChildApplication mKXApplication;
	private View mYule;

	private FlipperLayout.OnOpenListener mOnOpenListener;

	private ListView mPopDisplay;

	/**
	 * 判断当前的path菜单是否已经显示
	 */
	private boolean mUgcIsShowing = false;

	public Yuer(Context context, Activity activity, ChildApplication application) {
		mContext = context;
		mActivity = activity;
		mKXApplication = application;
        mYule = LayoutInflater.from(context).inflate(R.layout.yuer, null);

		findViewById();
		setListener();

	}

	private void findViewById() {
		mMenu = (Button) mYule.findViewById(R.id.yuer_menu);

	}

	private void setListener() {
		mMenu.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (mOnOpenListener != null) {
					mOnOpenListener.open();
				}
			}
		});


	}


	public View getView() {
		return mYule;
	}

	public void setOnOpenListener(FlipperLayout.OnOpenListener onOpenListener) {
		mOnOpenListener = onOpenListener;
	}
}
