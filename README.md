VideoPlayerDemo
===============
<<<<<<< HEAD
=======
This application to show the use of a media file from the RAW folder in the application directory.<br/>
There are very simple steps to add and use the video file in your application.<br/>
<br/>
The steps to follow are as follows : <br/>
Step 1: Create a new Folder named “raw” in your “res”  directory and add the video files.<br/>
Step 2: Create a layout using the VideoView object.<br/>
Step 3: Create the java file for the layout.<br/>
<br/>
Step 1: Need not be explained .<br/>
<br/>
Step 2: Creating the layout.<br/>

    <VideoView
        android:id="@+id/video"
        android:layout_width="match_parent"
        android:layout_height="match_parent" >
    </VideoView>


Step 3: Creating the java file :



		setContentView(R.layout.activity_main);
		getInit();


	public void getInit() {
		video_player_view = (VideoView) findViewById(R.id.video);
	video_player_view.setVideoPath("android.resource://com.webonise.videoplayerdemo/"
				+ R.raw.istillhaveasoul);
		video_player_view.start();
	}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Now for creating a default android video player we have to use the default objects like : <br/>
<br/>
DisplayMetrics 	: Allows you to get the pixels details .<br/>
MediaController	: Allow you to view and control the media being played.<br/>

	VideoView video_player_view;
	DisplayMetrics dm;
	MediaController media_Controller;
	

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





>>>>>>> 9ba78dccc320751171ff03691e877d22e389bd3b
