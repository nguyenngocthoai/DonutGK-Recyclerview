package snowdrop.nnt.donutgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DonutDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_detail);

        Intent intent = getIntent();
        String name_detail = intent.getStringExtra("name_detail");

        Bundle bundle = intent.getExtras();
        int img = bundle.getInt("image_detail");

        ((TextView) findViewById(R.id.name_detail)).setText(name_detail);
        ((ImageView) findViewById(R.id.image_detail)).setImageResource(img);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}