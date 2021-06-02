package sg.edu.rp.c346.id20039202.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCallSon, btnCallDaughter; //link to xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCallSon = findViewById(R.id.buttonCallSon);
        btnCallDaughter = findViewById(R.id.buttonCallDaughter);

        btnCallSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "1243567"));  //this will open dialer
                startActivity(i);
            }
        });

        btnCallDaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.com")); //this will open website
                startActivity(i);
            }
        });
    }
}