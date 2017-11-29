package rohitkadam.rohitcontact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        getMenuInflater().inflate(R.menu.contact_item,menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int selecteditem=item.getItemId();

        if(selecteditem==R.id.addContact){
            Intent intent=new Intent(MainActivity.this,AddActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
