package activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bloodbank.R;

public class Profile extends AppCompatActivity implements View.OnClickListener{
    Button btnLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btnLogOut = findViewById(R.id.btnLogOut);
        btnLogOut.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


    }
}
