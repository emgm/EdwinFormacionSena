package app.edwinformacionsena;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdd3PointTeamA, btnAdd2PointTeamA, btnAdd1PointTeamA;
    private TextView tvNameEquipoA, tvMarcadorEquipoA, tvMarcadorEquipoB;

    private Button btnReset;

    int valorActualMarcador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        btnAdd3PointTeamA = (Button) findViewById(R.id.btnAdd3PointTeamA);
        btnAdd3PointTeamA.setOnClickListener(this);

        btnAdd2PointTeamA = (Button) findViewById(R.id.btnAdd2PointTeamA);
        btnAdd2PointTeamA.setOnClickListener(this);

        btnReset = (Button) findViewById(R.id.btnReset);
        btnReset.setOnClickListener(this);

        tvMarcadorEquipoA = (TextView) findViewById(R.id.tvMarcadorEquipoA);
        tvMarcadorEquipoB = (TextView) findViewById(R.id.tvMarcadorEquipoB);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnAdd3PointTeamA:

             valorActualMarcador = Integer.parseInt(tvMarcadorEquipoA.getText().toString());

            valorActualMarcador = valorActualMarcador + 3;

            tvMarcadorEquipoA.setText(String.valueOf(valorActualMarcador));

            break;


            case R.id.btnAdd2PointTeamA:

                 valorActualMarcador = Integer.parseInt(tvMarcadorEquipoA.getText().toString());

                valorActualMarcador = valorActualMarcador + 2;

                tvMarcadorEquipoA.setText(String.valueOf(valorActualMarcador));

                break;


            case R.id.btnReset:

                tvMarcadorEquipoA.setText("0");
                tvMarcadorEquipoB.setText("0");

                break;


















        }







    }
}
