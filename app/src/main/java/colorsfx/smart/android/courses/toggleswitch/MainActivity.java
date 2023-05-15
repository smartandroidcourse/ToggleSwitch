package colorsfx.smart.android.courses.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ToggleSwitchButton toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toggle = (ToggleSwitchButton)findViewById(R.id.toggle);
        toggle.setOnTriggerListener(new ToggleSwitchButton.OnTriggerListener() {
            @Override
            public void toggledUp() {
                Toast.makeText(getApplicationContext(), "Camera Clicked", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void toggledDown() {
                Toast.makeText(getApplicationContext(), "Audio Clicked", Toast.LENGTH_SHORT).show();
            }
        });


    }
}