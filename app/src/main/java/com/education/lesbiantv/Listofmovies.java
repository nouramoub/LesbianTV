package com.education.lesbiantv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Listofmovies extends AppCompatActivity {
    //GridView simpleGrid;
    //int logos[] = {R.drawable.logo1};
    //String videos[] = {"https://www.veoh.com/watch/v142017589H86pF2YP"};
    List<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofmovies);

        movies = new ArrayList<>();
        movies.add(new Movie("Without", R.drawable.logo,"WlmYVv880GE","A University of North Carolina. School of the Arts. School of Filmmaking. Student Production\n" +
                "\n" +
                "Starring\n" +
                "Noelle Franco & Elizabeth Lail\n" +
                "\n" +
                "Written and Directed by\n" +
                "Joseph Hefner\n" +
                "\n" +
                "Produced by\n" +
                "Brianna Matthews"));
        movies.add(new Movie("Warmish", R.drawable.warmish,"SjGTWVCF1Kg","My head is completely spinning with the fact that I'm really grabbing a description here for \"warmish.\" Hot has been such an era in my life, and I know it has been for everyone involved too. It has been roughly three years in the making and the last 9 months my head has been consumed with warmish. Almost every free thought I have had for a few months has been warmish and I have been putting it constantly before everything else because it is so important to me and I know it will be important to some of you too. It has been such a beautiful part of my life and I hope I make you guys proud with it and I hope it is everything you have dreamed of and more. I am here to represent myself and all of you as best I can in the lgbt + community. But this is more than just a + lgbt scenario (even if it's a huge part and plays an important role in helping our community to get stronger) I poured every ounce of my soul into this short film and I couldn't not be happier. Warmish and the warm era are definitely more, but Ellie and Parker will always be in my heart and I am so thankful to be able to share this work of art with the world."));
        movies.add(new Movie("Night drive", R.drawable.nightdrive,"2hYDMWpZ0hQ&t","I'm very nervous and excited to be releasing my very first self-written and directed short film! Since you all loved my \"break up with your boyfriend, i'm bored\" video, I decided I'd do a sequel with the same actors and storyline, but in the form of a film instead! This follows the lives of the two girls in my music video, 2 years down the road, after Heidi (Jessica Danecker) finally breaks up with her boyfriend, Travis (Matias Lucas). She finally revisits her best friend, Maia (played by me) after 2 years of not speaking. This is how their story continues..."));
        movies.add(new Movie("SHE", R.drawable.she,"-XKQgnzN1jo","a short film by Liv Buzzell and Charlotte Gruman 3 time award winner at the Micro Movie Marathon in Traverse City, MIofficial selection of the Perlen Queer Film Festival, Hannover, DE"));
        movies.add(new Movie("1 in 10 000", R.drawable.korea, "TJKGd_5mDuk","If the odds are stacked against you, what's the point?\n" +
                "\n" +
                "1 in 10,000 is a three part mini-series that tackles the concept of purpose, love, and soulmates.\n"));
        movies.add(new Movie("HomeComing", R.drawable.homecoming,"ANWpY0eIKKk","After many years away, a young woman comes home to her small town for her high school reunion and catches up with her best friend.\n"));




        GridView rcycl = (GridView) findViewById(R.id.grid);
        RecyclerViewAdapter customAdapter = new RecyclerViewAdapter(getApplicationContext(), movies);
        rcycl.setAdapter(customAdapter);
        //rcycl.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //@Override
           // public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                //
        //});
        //simpleGrid = (GridView) findViewById(R.id.grid);
        //CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), logos);
        //simpleGrid.setAdapter(customAdapter);
        //simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           // @Override
            //public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
               // Intent intent = new Intent(Listofmovies.this, MainActivity.class);
                //intent.putExtra("video", videos[position]);// put image data in Intent
               // startActivity(intent); // start Intent
            //}
        //});
    }
}
