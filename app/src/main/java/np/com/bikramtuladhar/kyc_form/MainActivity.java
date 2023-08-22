package np.com.bikramtuladhar.kyc_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name, address;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.editTextUserName);
        address = findViewById(R.id.editTextAddress);
        btn = findViewById(R.id.buttonSubmit);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FormPreviewActivity.class);

                intent.putExtra("name", name.getText().toString());
                intent.putExtra("address", address.getText().toString());

                startActivity(intent);
            }
        });
    }
}