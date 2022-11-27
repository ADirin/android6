package fi.metropolia.android6;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final Presidents presidents = new Presidents();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate:");



         ListView lv = findViewById(R.id.list);


        lv.setAdapter(new ArrayAdapter<President>(
                this, R.layout.president, presidents)
        );

        lv.setOnItemClickListener(((adapterView, view, i, l) -> {
            Log.d(TAG, "onItemClick: ");
            Intent presidentActivity = new Intent(MainActivity.this, PresidentActivity.class);
            presidentActivity.putExtra("index", 1);
            startActivity(presidentActivity);
        }));
    }
}