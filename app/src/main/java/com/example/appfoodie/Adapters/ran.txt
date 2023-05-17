import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView textView = findViewById(R.id.textView);
        
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        
        textView.setText("Random number: " + randomNumber);
    }
}
