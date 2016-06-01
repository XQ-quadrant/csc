package com.xq.csc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    private EditText editText_name;
    private Button button_showName;
    private TextView textView_content;
    String msg = "Shiyanlou :";
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The function onCreate() was called.");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editText_name = (EditText)findViewById(R.id.editText_name);
        button_showName = (Button)findViewById(R.id.button_showName);
        textView_content = (TextView)findViewById(R.id.textView_content);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        button_showName.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                // 调用editText_name对象的getText()方法来获取文本框中的输入内容
                // 再用toString()方法将输入内容转为String格式
                String name = editText_name.getText().toString();

                // 获取到输入值后，将其用textView_content对象的setText()方法显示出来
                textView_content.setText(name);

                // 还可以调用它的setTextColor()方法来改变文本的颜色
                textView_content.setTextColor(Color.RED);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


@Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The function onStart() was called.");
    }


    // 当其他的Activity已经获得了焦点时会调用onPause()方法
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The function onPause() was called.");
    }

    // 当Activity不再可见的时候会调用onStop()方法
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The function onStop() was called.");
    }

    // 当Activity被销毁的时候会调用onDestroy()方法
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The function onDestroy() was called.");
    }
}
