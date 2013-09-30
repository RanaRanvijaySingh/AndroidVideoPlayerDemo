package com.webonise.videoplayerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {
	VideoView video_player_view;
	DisplayMetrics dm;
	MediaController media_Controller;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getInit();
	}

	public void getInit() {
		video_player_view = (VideoView) findViewById(R.id.video);
		media_Controller = new MediaController(this);
		dm = new DisplayMetrics();
		this.getWindowManager().getDefaultDisplay().getMetrics(dm);
		int height = dm.heightPixels;
		int width = dm.widthPixels;
		video_player_view.setMinimumWidth(width);
		video_player_view.setMinimumHeight(height);
		video_player_view.setMediaController(media_Controller);
		video_player_view
				.setVideoPath("android.resource://com.webonise.videoplayerdemo/"
						+ R.raw.istillhaveasoul);
		video_player_view.start();
	}
}
