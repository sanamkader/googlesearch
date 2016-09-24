package sanam.com.googlesearch;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText search;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search = (EditText) findViewById(R.id.search);
        searchButton = (Button) findViewById(R.id.button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url="https://www.google.com/#q=";
                String searchtext=search.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url.concat(searchtext)));
                startActivity(intent);
            }
        });
    }
}