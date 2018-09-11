package org.example.pltw.medialib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Book book1;
    private Movie movie1;
    private  Song song1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);
    }

    /**
     * This method is called when the Show Contents button is clicked
     **/
    public void showMedia(View v) {

        book1 = new Book("Harry Potter", 8, 5.50);
        movie1 = new Movie("Star Wars", 9, 9.5, 127);
        song1 = new Song("Steampowered", 18, 0.99);
        TextView outputText = (TextView) findViewById(R.id.mediaLibText);

        outputText.append("Books:");
        outputText.append("\n");

        outputText.append(book1.getTitle());
        outputText.append("\n");

        outputText.append("Movies:");
        outputText.append("\n");

        outputText.append(movie1.getTitle());
        outputText.append("\n");

        outputText.append("Songs:");
        outputText.append("\n");

        outputText.append(song1.getTitle());
        outputText.append("\n");
    }
}
