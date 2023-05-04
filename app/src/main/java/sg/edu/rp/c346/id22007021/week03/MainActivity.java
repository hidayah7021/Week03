package sg.edu.rp.c346.id22007021.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    // Step 1 ; Declaring Variables, UI to Code
    TextView tvDisplay;
    Button buttonDisplay;
    EditText etInput;
    ToggleButton tgButton;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Linking java files to xml files
        tvDisplay = findViewById(R.id.textViewDisplay);
        buttonDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tgButton = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.RadioGroupGender);

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioMale){
                    // if male; he says ...
                    stringResponse = "He says " + stringResponse;
                }
                else{
                    // she says ...
                    stringResponse = "She says " + stringResponse;
                }
                tvDisplay.setText(stringResponse);
            }
        });
        tgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code requirements;
                // get state of toggle button
                // enabling and disabling etInput
                boolean isChecked = tgButton.isChecked();
                if (isChecked) {
                    etInput.setEnabled(true);
                }else{
                    etInput.setEnabled(false);
                }
            }
        });

    }
}