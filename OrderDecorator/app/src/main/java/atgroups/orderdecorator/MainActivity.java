package atgroups.orderdecorator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import atgroups.orderdecorator.Model.Chocolate;
import atgroups.orderdecorator.Model.Coffee;
import atgroups.orderdecorator.Model.Cream;
import atgroups.orderdecorator.Model.Drink;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox mChkCream;
    private CheckBox mChkChocolate;
    private Button mBtnAdd;
    private Button mBtnSub;
    private Button mBtnOrder;
    private TextView mTvName;
    private TextView mTvCream;
    private TextView mTvChocolate;
    private TextView mTvQuantity;
    private TextView mTvShowQuantity;
    private TextView mTvTotal;

    private double mTotal = 0;
    private int mQuantity = 1;
    private boolean mIsCream = false;
    private boolean mIsChocolate = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        mChkCream = findViewById(R.id.chk_cream);
        mChkChocolate = findViewById(R.id.chk_chocolate);
        mBtnAdd = findViewById(R.id.btn_add);
        mBtnSub = findViewById(R.id.btn_sub);
        mBtnOrder = findViewById(R.id.btn_order);
        mTvQuantity = findViewById(R.id.tv_quantity);
        mTvName = findViewById(R.id.tv_name);
        mTvCream = findViewById(R.id.tv_cream);
        mTvChocolate = findViewById(R.id.tv_chocolate);
        mTvShowQuantity = findViewById(R.id.tv_show_quantity);
        mTvTotal = findViewById(R.id.tv_total);

        mBtnAdd.setOnClickListener(this);
        mBtnSub.setOnClickListener(this);
        mBtnOrder.setOnClickListener(this);

        mBtnSub.setEnabled(false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add:
                add();
                break;
            case R.id.btn_sub:
                sub();
                break;
            case R.id.btn_order:
                order();
                break;
        }
    }

    // Function add quantity
    private void sub() {
        mQuantity--;
        if (mQuantity == 1) {
            mBtnSub.setEnabled(false);  //min quantity is 1
        }
        mTvQuantity.setText(String.valueOf(mQuantity));
    }

    // Function sub quantity
    private void add() {
        mQuantity++;
        mTvQuantity.setText(String.valueOf(mQuantity));
        mBtnSub.setEnabled(true);
    }

    //Function order drink
    private void order() {
        mTotal = 0;

        if (mChkCream.isChecked()) {
            mIsCream = true;
        } else {
            mIsCream = false;
        }

        if (mChkChocolate.isChecked()) {
            mIsChocolate = true;
        } else {
            mIsChocolate = false;
        }

        Drink coffee = new Coffee();
        mTotal = coffee.getCost();

        // total cost if add cream
        if (mIsCream) {
            for (int i = 1; i <= mQuantity; i++) {
                coffee = new Cream(coffee);
            }
        }

        // total cost if add chocolate
        if (mIsChocolate) {
            for (int i = 1; i <= mQuantity; i++) {
                coffee = new Chocolate(coffee);
            }
        }

        mTotal = coffee.getCost();

        String textName = getResources().getString(R.string.text_name);
        String textCream = getResources().getString(R.string.text_cream) + mIsCream;
        String textChocolate = getResources().getString(R.string.text_chocolate) + mIsChocolate;
        String textQuantity = getResources().getString(R.string.text_show_quantity) + mQuantity;
        String textTotal = getResources().getString(R.string.text_total) + mTotal;

        mTvName.setText(textName);
        mTvCream.setText(textCream);
        mTvChocolate.setText(textChocolate);
        mTvShowQuantity.setText(textQuantity);
        mTvTotal.setText(textTotal);
    }
}
