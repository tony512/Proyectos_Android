package pacm.pruebasdeinterfaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class prueba_informacion extends AppCompatActivity implements View.OnClickListener {
    CheckBox chk_Correcto_Pre1;
    CheckBox chk_Incorrecto_Pre1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_informacion);
     chk_Correcto_Pre1= (CheckBox)findViewById(R.id.chk_correcto);


     chk_Incorrecto_Pre1=(CheckBox)findViewById(R.id.chk_incorrecto);

     chk_Incorrecto_Pre1.setOnClickListener(this);
     chk_Correcto_Pre1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int contador1=0;
        int contador2=0;
        switch (v.getId())
        {
            case R.id.chk_correcto:
                contador1=contador1+1;
                chk_Incorrecto_Pre1.setEnabled(false);
                break;

        }
    }
}
