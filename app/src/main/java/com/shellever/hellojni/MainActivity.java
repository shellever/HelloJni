package com.shellever.hellojni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

@SuppressWarnings("All")
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mInfoFromJni;

    /* this is used to load the 'hello-jni' library on application
     * startup. The library has already been unpacked into
     * /data/data/com.example.hellojni/lib/libhello-jni.so at
     * installation time by the package manager.
     */
    static {
        System.loadLibrary("hello-jni");
    }


    // Called when the activity is first created.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInfoFromJni = (TextView) findViewById(R.id.tv_info_from_jni);

        findViewById(R.id.btn_get_string_from_jni).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get_string_from_jni:
                getStringFromJni();
                break;
        }
    }

    public void getStringFromJni() {
        mInfoFromJni.setText(HelloJni.getStringFromJni());  // call native method from JNI
    }
}
