package sg.edu.rp.c346.id19014750.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;
    ArrayList<String> fruitss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textViewArray);

        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";

        fruitss = new ArrayList<>();
        fruitss.add("apple");
        fruitss.add("banana");
        fruitss.add("cherry");

        String strText = "Fruits\n";
        strText += "===============================\n";

        for(int i = 0; 1 < fruits.length; i++){
            strText += fruits[i] + "\n";
        }

        tv.setText(strText);

    }
}