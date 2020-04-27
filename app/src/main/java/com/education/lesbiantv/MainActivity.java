package com.education.lesbiantv;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    private ImageButton btnplaypause;

    private String VideoUrl ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        VideoUrl ="android.resource://" + getPackageName() + "/" + intent.getIntExtra("video", 0);


        videoView = (VideoView) findViewById(R.id.video);
        btnplaypause = (ImageButton) findViewById(R.id.play);
        MediaController mediaController = new MediaController(MainActivity.this);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse(VideoUrl);



        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);

        videoView.start();

    }
}
