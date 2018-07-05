package vidioapp.smartserve.com.vidoimoapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TabLayoutActivity extends AppCompatActivity {
ImageView signImage;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        signImage = (ImageView) findViewById(R.id.imageView1);
        button = (Button) findViewById(R.id.getSign);
        String image_path = getIntent().getStringExtra("imagePath");
        Bitmap bitmap = BitmapFactory.decodeFile(image_path);
        signImage.setImageBitmap(bitmap);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TabLayoutActivity.this, SignatureActivity.class);
                startActivity(i);
            }
        });
    }

}
