package c.verbswithexample.materialdesign;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mytxtgradient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytxtgradient = findViewById(R.id.mytxtgradient);

        LinearGradient linearGradient = new LinearGradient(0,0,mytxtgradient.getTextSize(), 0, Color.GREEN, Color.RED, Shader.TileMode.MIRROR);

        mytxtgradient.getPaint().setShader(linearGradient);



    }
}
