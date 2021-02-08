package mcm.edu.ph.narca_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity<display, lastName, middleInitial, firstName, myAge, myDreamTVLGrade> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView display;
        display =

                findViewById(R.id.displaytxt);

        String firstName = "Luke Aison";
        char middleInitial = 'M';
        String lastName = "Narca";
        int myAge = 18;
        float myDreamTVLGrade = 100.0f;
        double myMoney = 15000000000.00;


        //String.valueOf(myMoney)
        display.setText("My name is " + firstName + " "
                + String.valueOf(middleInitial) + " "
                + lastName + "\nand my age is "
                + myAge + ". \nI want my grade in TVL3 to be "
                + String.valueOf(myDreamTVLGrade));

        boolean amIMarried = false;
    }
}

