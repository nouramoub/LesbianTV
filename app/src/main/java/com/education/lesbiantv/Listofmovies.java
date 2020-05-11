package com.education.lesbiantv;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Listofmovies extends AppCompatActivity {
    private RecyclerView recyclerView ;
    private ArrayList<Movie> movies;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofmovies);





        movies = new ArrayList<>() ;
        recyclerView = findViewById(R.id.rcycl);
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
        movies.add(new Movie("You",R.drawable.you,"QsEL9b8mvBQ","Synopsis: Kristen is a photographer who is opening her first ever gallery show. Her girlfriend, Samantha and all her friends are there. Everything was going as planned except when her parents randomly shows up on her gallery show, which was full of queer art. Deprived of this knowledge of their daughter's sexuality, her parents confront her. Kristen is caught between a chaos of her parents and her girlfriend, and on top of it all while trying to hold her composure for the other guests in her gallery which eventually triggers her anxiety. How will she hold up?\n"));
        movies.add(new Movie("Invite you",R.drawable.invite_you,"CQckSkRUN30","Parched Productions ~ view our features on Amazon: Parched, Parched 2: Hangry, Blood Falls - and Reap (coming soon)\n"));
        movies.add(new Movie("traumtänzerin ",R.drawable.traumtnzerin,"B1bc50Ckz4s","Es ist soweit. Endlich kann ich ihn euch zeigen! Im Herbst 2018 drehte ich zusammen mit einem wundervollen Team meinen Bachelorfilm. 1 1/2 Jahre später darf ich ihn nun auf Youtube veröffentlichen! "));
        movies.add(new Movie("AVA",R.drawable.ava,"LfBZRbx7MtA","\"In a gay conversion center, a young girl risks everything to save her new friend.\" An updated, 2019 version of my short film! I really took into consideration all of the great feedback and constructive criticism from the 2018 release of this film"));
        movies.add(new Movie("Pulse",R.drawable.pulse,"wU1U28kZl2c","A Double A Films production, directed by Alejandra Hou, based on a true event. In honor of the LGBTQ+ community who deserves to be treated same as others because we are all the same."));


        Adapter myadapter = new Adapter(this,movies) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);

    }


}
