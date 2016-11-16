package tw.org.iii.will03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button test1, test2;
    private Main2Activity mainApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("will", "onCreate");

        test1 = (Button) findViewById(R.id.test1);
        test2 = (Button) findViewById(R.id.test2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("will", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("will", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("will", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("will", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("will", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("will", "onDestroy");
    }

    public void test1(View view) {
        if (view == test1) {
            Intent it = new Intent(this, Page2Activity.class);      // Intent(物件, 要跳到的頁面.class);
            startActivity(it);
            Log.v("will", "test1 return");
        } else if (view == test2) {
            finish();
        }
    }
    public void test3(View view) {
        Intent it = new Intent(this, Page3Activity.class);      // Intent(物件, 要跳到的頁面.class);
        it.putExtra("name", "Will");
        it.putExtra("level", 4);
        it.putExtra("sound", true);
        startActivity(it);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String key1 = data.getStringExtra("key1");

        Log.v("will", "onActivityResult" + requestCode + " : " + resultCode + " : " + key1);
    }

    public void test4(View view) {
        Intent it = new Intent(this, Page3Activity.class);      // Intent(物件, 要跳到的頁面.class);
        it.putExtra("name", "Will");
        it.putExtra("level", 4);
        it.putExtra("sound", true);
//        startActivity(it);
        startActivityForResult(it, 123);       // requestCode => 123
    }
}
