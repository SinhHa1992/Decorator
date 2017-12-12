package trungbanh.com.decorator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import trungbanh.com.decorator.Coffe.Chocola;
import trungbanh.com.decorator.Coffe.Coffe;
import trungbanh.com.decorator.Coffe.Whiper;

public class MainActivity extends AppCompatActivity {

    int num = 0 ;
    TextView tv ;
    TextView show ;
    CheckBox w ;
    CheckBox c ;
    boolean cs ,ws ;
    int total =0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        w = findViewById(R.id.cb_checksWip) ;
        c = findViewById(R.id.cb_checksChoco) ;

        tv = findViewById(R.id.tv_num);
        show = findViewById(R.id.tv_showorder) ;

        Button add = findViewById(R.id.bt_cong) ;
        Button mid = findViewById(R.id.bt_tru) ;
        Button od = findViewById(R.id.bt_order) ;

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num ++ ;
                tv.setText(String.valueOf(num));
            }
        });
        mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num <= 0) {
                    Toast.makeText(MainActivity.this, "nhap sai", Toast.LENGTH_SHORT).show();
                }else {
                    num-- ;
                    tv.setText(String.valueOf(num));
                }
            }
        });
        od.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cs = c.isChecked();
                ws = w.isChecked();

                if (Integer.parseInt(tv.getText().toString()) < 0) {
                    Toast.makeText(MainActivity.this, "nhap sai", Toast.LENGTH_SHORT).show();
                    show.setText("");
                    c.setChecked(false);
                    w.setChecked(false);
                } else {
                    Coffe coffe = new Coffe();
                    if (cs) {
                        for (int i = 0; i < Integer.parseInt(tv.getText().toString()); i++) {
                            coffe = new Chocola(coffe);
                        }
                    }
                    if (ws) {
                        for (int i = 0; i <= Integer.parseInt(tv.getText().toString()); i++) {
                            coffe = new Whiper(coffe);
                        }
                    }


                    total = coffe.getCost();
                    String oder = "name : trung \n" + "Add whipper cream " + ws + "\nAdd Chocolates " + cs + "\nQuantity " + tv.getText().toString() + "\ntotal = " + total + "\n ThankYou !!";
                    show.setText(oder);
                    total = 0;
                }
            }
        });
    }
}
