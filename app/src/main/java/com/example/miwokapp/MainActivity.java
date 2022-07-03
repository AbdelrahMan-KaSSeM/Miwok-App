        package com.example.miwokapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //find the view  that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // set  a ClickListener on the VIew
        numbers.setOnClickListener(new View.OnClickListener() {
        // The code in this method will be executed when the numbers View is clicked on.
        @Override
        public void onClick(View view) {
            Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
            startActivity(numbersIntent);}});


            //find the view  that shows the family category
            TextView family = (TextView) findViewById(R.id.family);

            // set  a ClickListener on the VIew
            family.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the family View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(familyIntent);}});

                    // Find the View that shows the colors category
                    TextView colors = (TextView) findViewById(R.id.colors);

                    // Set a click listener on that View
                    colors.setOnClickListener(new View.OnClickListener() {
                        // The code in this method will be executed when the colors View is clicked on.
                        @Override
                        public void onClick(View view) {
                            Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                            startActivity(colorsIntent);}});

                            // Find the View that shows the phrases category
                            TextView phrases = (TextView) findViewById(R.id.phrases);

                            // Set a click listener on that View
                            phrases.setOnClickListener(new View.OnClickListener() {
                                // The code in this method will be executed when the phrases View is clicked on.
                                @Override
                                public void onClick(View view) {
                                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                                    startActivity(phrasesIntent); }}); }
                    }