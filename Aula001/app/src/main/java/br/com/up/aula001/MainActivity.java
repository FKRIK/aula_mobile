package br.com.up.aula001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private Button buttonText;
    private ArrayList<String> phrases = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        textViewTitle = findViewById(R.id.textView2);
        buttonText = findViewById(R.id.button_one);
        phrases.add("Comprar pastel para o professor");
        phrases.add("Comprar pizza para o professor");
        phrases.add("Comprar café para o professor");
        phrases.add("Chamar o professor para o churras");
        phrases.add("Chamar o professor para andar de kart");

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Random random = new Random();
                int position = random.nextInt(phrases.size());
                String escolhida = phrases.get(position);
                textViewTitle.setText(escolhida);
            }
        };

        buttonText.setOnClickListener(listener);
    }

}