package tw.org.iii.will03;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends Application {
    int a = 10;
    public Main2Activity() {
        a = 100;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
