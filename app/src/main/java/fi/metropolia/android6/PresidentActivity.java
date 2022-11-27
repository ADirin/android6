package fi.metropolia.android6;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PresidentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.president_activity);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);
        President president = MainActivity.presidents.get(index);

        TextView name = findViewById(R.id.name);
        TextView termStart = findViewById(R.id.term_start);
        TextView termEnd = findViewById(R.id.term_end);
        TextView desc = findViewById(R.id.desc);

        name.setText(president.name);
        termStart.setText(String.valueOf(president.termStart));
        termEnd.setText(String.valueOf(president.termEnd));
        desc.setText(president.desc);

    }
}
