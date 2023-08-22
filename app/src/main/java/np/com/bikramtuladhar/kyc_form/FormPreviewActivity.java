package np.com.bikramtuladhar.kyc_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FormPreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_preview);

        TextView name = findViewById(R.id.tvFullName);
        TextView address = findViewById(R.id.tvAddress);

        Intent intent = getIntent();
        String getName = intent.getStringExtra("name");
        String getAddress = intent.getStringExtra("address");

        name.setText(getName);
        address.setText(getAddress);

        Button btnBack = findViewById(R.id.back);

        btnBack.setOnClickListener(view -> {
            Intent intent1 = new Intent(FormPreviewActivity.this, MainActivity.class);
            startActivity(intent1);
        });
    }
}