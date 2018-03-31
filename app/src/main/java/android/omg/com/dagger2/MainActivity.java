package android.omg.com.dagger2;

import android.omg.com.dagger2.models.DaggerWarComponent;
import android.omg.com.dagger2.models.War;
import android.omg.com.dagger2.models.WarComponent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WarComponent warComponent = DaggerWarComponent.create();
        War war = warComponent.getWar();

        war.getReady();
    }
}
