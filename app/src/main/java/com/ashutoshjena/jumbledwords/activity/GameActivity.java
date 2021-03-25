package com.ashutoshjena.jumbledwords.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ashutoshjena.jumbledwords.R;
import com.ashutoshjena.jumbledwords.pojo.categories.Animals;
import com.ashutoshjena.jumbledwords.pojo.Buttons;
import com.ashutoshjena.jumbledwords.pojo.categories.Capitals;
import com.ashutoshjena.jumbledwords.pojo.categories.Cars;
import com.ashutoshjena.jumbledwords.util.RandomList;
import com.ashutoshjena.jumbledwords.pojo.categories.Chemistry;
import com.ashutoshjena.jumbledwords.pojo.categories.Clothing;
import com.ashutoshjena.jumbledwords.pojo.categories.Countries;
import com.ashutoshjena.jumbledwords.pojo.categories.Electricity;
import com.ashutoshjena.jumbledwords.pojo.categories.Flowers;
import com.ashutoshjena.jumbledwords.pojo.categories.Foods;
import com.ashutoshjena.jumbledwords.pojo.categories.Fruits;
import com.ashutoshjena.jumbledwords.pojo.categories.Movies;
import com.ashutoshjena.jumbledwords.pojo.categories.Physics;
import com.ashutoshjena.jumbledwords.pojo.categories.Planets;
import com.ashutoshjena.jumbledwords.pojo.categories.Space;
import com.ashutoshjena.jumbledwords.pojo.categories.Sports;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    TextView textViewCategory;
    TextView textViewTotalScore;
    EditText textViewArrangedWords;
    ArrayList<String> categoriesList;
    ArrayList<Integer> randomPositionList;
    SharedPreferences sharedPreferences;
    ArrayList<Integer> buttons;
    int wordPosition = 0;
    int totalScore = 0;
    final int ITEMS_COUNT = 20;
    final int WORD_MAX_LENGTH = 8;
    String arrangedWord = "";
    String storageString = "";
    final String packageDetails = "com.ashutoshjena.jumbledwords";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        sharedPreferences = this.getSharedPreferences(packageDetails, MODE_PRIVATE);

        textViewCategory = findViewById(R.id.gameCategory);
        textViewArrangedWords = findViewById(R.id.arrangedWords);
        textViewTotalScore = findViewById(R.id.totalScore);

        Intent intent = getIntent();
        String category = intent.getStringExtra("Category");

        textViewCategory.setText(category);

        buttons = Buttons.getButtons();

        categoriesList = new ArrayList<>();
        randomPositionList = new ArrayList<>();
        randomPositionList = RandomList.getRandomList(ITEMS_COUNT);

        Log.i("RANDOMPOSLIS", randomPositionList.toString());

        startGame(category);
    }

    public void startGame(String category) {

        findCategory(category);

        textViewTotalScore.setText(totalScore+"");

        setNewWord(randomPositionList.get(wordPosition));
    }

    public void setNewWord(int position) {
        String object = categoriesList.get(position);
        arrangedWord = object;
        int length = object.length();
        Log.i("Length", length+"");
        int index = 0;
        textViewArrangedWords.setText("");
        ArrayList<Integer> randomList = RandomList.getRandomList(length);
        Log.i("RandomList", randomList.toString());
        for (index = 0; index < length; index++) {
            Button button = findViewById(buttons.get(index));
            button.setVisibility(View.VISIBLE);
            button.setText(object.charAt(randomList.get(index))+"");
        }
        for (index = length; index < WORD_MAX_LENGTH; index++) {
            Button button = findViewById(buttons.get(index));
            button.setVisibility(View.GONE);
        }
    }

    public void findCategory(String category) {
        switch (category) {
            case "Animals" :
                categoriesList = Animals.getList();
                Log.i("Animals", categoriesList.toString());
                storageString = "totalScore0";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Cars" :
                categoriesList = Cars.getList();
                Log.i("Cars", categoriesList.toString());
                storageString = "totalScore1";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Capitals" :
                categoriesList = Capitals.getList();
                Log.i("Capitals", categoriesList.toString());
                storageString = "totalScore2";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Chemistry" :
                categoriesList = Chemistry.getList();
                Log.i("Chemistry", categoriesList.toString());
                storageString = "totalScore3";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Clothing" :
                categoriesList = Clothing.getList();
                Log.i("Clothing", categoriesList.toString());
                storageString = "totalScore4";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Countries" :
                categoriesList = Countries.getList();
                Log.i("Countries", categoriesList.toString());
                storageString = "totalScore5";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Electricity" :
                categoriesList = Electricity.getList();
                Log.i("Electricity", categoriesList.toString());
                storageString = "totalScore6";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Fruits" :
                categoriesList = Fruits.getList();
                Log.i("Fruits", categoriesList.toString());
                storageString = "totalScore7";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Movies" :
                categoriesList = Movies.getList();
                Log.i("Movies", categoriesList.toString());
                storageString = "totalScore8";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Physics" :
                categoriesList = Physics.getList();
                Log.i("Physics", categoriesList.toString());
                storageString = "totalScore9";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Planets" :
                categoriesList = Planets.getList();
                Log.i("Planets", categoriesList.toString());
                storageString = "totalScore10";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Space" :
                categoriesList = Space.getList();
                Log.i("Space", categoriesList.toString());
                storageString = "totalScore11";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Sports" :
                categoriesList = Sports.getList();
                Log.i("Sports", categoriesList.toString());
                storageString = "totalScore12";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Flowers" :
                categoriesList = Flowers.getList();
                Log.i("Flowers", categoriesList.toString());
                storageString = "totalScore13";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;

            case "Foods" :
                categoriesList = Foods.getList();
                Log.i("Foods", categoriesList.toString());
                storageString = "totalScore14";
                totalScore = Integer.parseInt(sharedPreferences.getString(storageString, "0"));
                break;
        }
    }

    public void checkClick(View view) {
        String currentWord = textViewArrangedWords.getText().toString();
        if (currentWord.equals(arrangedWord)) {

            totalScore += 10;
            textViewTotalScore.setText(totalScore+"");

            sharedPreferences.edit().putString(storageString, totalScore+"").apply();

            Toast.makeText(this, "Correct Word!", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(this::findNextWord, 2000);

        } else {
            Toast.makeText(this, "OOPS! Please guess again", Toast.LENGTH_SHORT).show();
        }
    }

    public void passClick(View view) {
        findNextWord();
    }

    public void findNextWord() {
        wordPosition++;
        setNewWord(randomPositionList.get(wordPosition));
    }

    public void resetClick(View view) {
        textViewArrangedWords.setText("");
    }

    public void exitClick(View view) {
        onBackPressed();
    }

    public void wordsClick(View view) {
        Button button = (Button) view;
        String text = button.getText().toString();
        Log.i("Text", text);
        textViewArrangedWords.append(text);
    }
}