package c.verbswithexample.materialdesign;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mytxtgradient;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytxtgradient = findViewById(R.id.mytxtgradient);

        LinearGradient linearGradient = new LinearGradient(0,0,mytxtgradient.getTextSize(), 0, Color.GREEN, Color.RED, Shader.TileMode.MIRROR);

        mytxtgradient.getPaint().setShader(linearGradient);

//    main code with api if we're running on android 5.0 or higher
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){

            // use code here

        }else{

            // for below api 21
            // implement this feature

        }





    }

    public void TransTest(View view) {

        Intent intent = new Intent(this, SecondActivity.class);

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        startActivity(intent, options.toBundle());


    }
}
