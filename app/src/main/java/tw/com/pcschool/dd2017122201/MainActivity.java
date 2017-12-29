package tw.com.pcschool.dd2017122201;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        tv.setText("Hello World!");

        et = (EditText) findViewById(R.id.editText);
    }

    public void click1(View v)
    {
        String str = et.getText().toString();
        tv.setText("Good Afternoon..." + str);
    }


}
