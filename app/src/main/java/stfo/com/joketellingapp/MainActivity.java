package stfo.com.joketellingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.JokeClass;
import com.udacity.example.jokes.JokeSmith;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JokeClass jokeClass = new JokeClass();
        Log.d("JOKE_APP",jokeClass.getJoke());
    }
}
