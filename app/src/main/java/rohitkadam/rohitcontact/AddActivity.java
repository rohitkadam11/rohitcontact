package rohitkadam.rohitcontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    EditText editTextName, editTextNumber;
    Button buttonAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        editTextName=findViewById(R.id.editTextName);
        editTextNumber=findViewById(R.id.editTextNumber);
        buttonAdd=findViewById(R.id.buttonAdd);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addContact();


            }
        });
    }

    public void addContact(){
        String name=editTextName.getText().toString();
        String number=editTextNumber.getText().toString();


    }
}
