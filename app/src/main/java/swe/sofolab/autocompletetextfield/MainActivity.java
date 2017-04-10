package swe.sofolab.autocompletetextfield;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView atutext;

    String[] countries=new String[]{

            "aFGANISTAN",
            "AMERICA",
            "ARGENTINA",
            "ABRAHAM",
            "ARABAMIRAT",
            "ABUDHABI",
            "AFRICA",
            "ARABAMIRAT",
            "aFGANISTAN",
            "AMERICA",
            "ARGENTINA",
            "ABRAHAM",
            "ARABAMIRAT",
            "ABUDHABI",
            "AFRICA",
            "ARABAMIRAT",
            "aFGANISTAN",
            "AMERICA",
            "ARGENTINA",
            "ABRAHAM",
            "ARABAMIRAT",
            "ABUDHABI",
            "AFRICA",
            "ARABAMIRAT",
            "aFGANISTAN",
            "AMERICA",
            "ARGENTINA",
            "ABRAHAM",
            "ARABAMIRAT",
            "ABUDHABI",
            "AFRICA",
            "ARABAMIRAT",



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auto_field();
    }



    public void auto_field(){

        atutext=(AutoCompleteTextView)findViewById(R.id.autotext);

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.select_dialog_item,countries);


        atutext.setThreshold(1);

        atutext.setAdapter(adapter);


    }



}
