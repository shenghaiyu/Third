package cn.edu.bistu.cs.se.third;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.android.gms.appindexing.Action;
//import com.google.android.gms.appindexing.AppIndex;
//import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private RadioButton rb1;
    private RadioButton rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        Button button = (Button) findViewById(R.id.button);
        final EditText text = (EditText) findViewById(R.id.edittext);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("您点击了按钮");
            }
        });

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.tv);
        switch(view.getId()) {
            case R.id.radio1:
                if(checked){
                    Toast.makeText(this,"您的性别为男",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.radio2:
                if(checked){
                    Toast.makeText(this,"您的性别为女",Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.tv);
        switch(view.getId()) {
            case R.id.checkbox1:
                if(checked){
                    Toast.makeText(this,"您的年龄为20",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择年龄20",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkbox2:
                if(checked){
                    Toast.makeText(this,"您的年龄为21",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择年龄21",Toast.LENGTH_LONG).show();
                }
                break;

        }
    }

}