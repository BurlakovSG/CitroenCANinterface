package psa.citroencaninterface;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends Activity {
    TextView tvInfo;

    static Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_dialog);

        tvInfo = (TextView) findViewById(R.id.tvInfo);

        Intent intent = getIntent();

        String text = intent.getStringExtra("text");

        tvInfo.setText(text);

        activity = this;
    }

//    public void close(){
//        if(InfoActivity.ac != null) InfoActivity.ac.finish();
//    }
}
