package com.education.lesbiantv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MovieActivity extends YouTubeBaseActivity {
    private static final String TAG ="MovieActivity";
    private YouTubePlayerView youTubePlayerView;
    private Button play;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    private String VideoUrl ="";
    private String Description;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        play = (Button) findViewById(R.id.button);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.view);
        Intent intent = getIntent();
        VideoUrl= intent.getStringExtra("url");
        text = (TextView) findViewById(R.id.textView);
        text.setText(intent.getStringExtra("description"));


        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(VideoUrl);

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

    }
}
