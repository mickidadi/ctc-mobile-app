package com.ucc.ctc.views;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ucc.ctc.R;


public class ItemdataActivity extends AppCompatActivity {

    TextView name;
    TextView place;
    TextView desc;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.list_item_data);

        // getSupportActionBar().setTitle("Informations");

        name=findViewById(R.id.itemName);
        place=findViewById(R.id.itemPlace);
        desc=findViewById(R.id.itemDesc);
        image=findViewById(R.id.itemPhoto);

        Intent intent = getIntent();

        name.setText(intent.getStringExtra("name"));
        place.setText(intent.getStringExtra("place"));
        desc.setText(intent.getStringExtra("desc"));
        image.setImageResource(intent.getIntExtra("image",0));
    }
}
