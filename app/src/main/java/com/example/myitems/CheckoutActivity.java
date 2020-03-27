package com.example.myitems;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.craftman.cardform.Card;
import com.craftman.cardform.CardForm;
import com.craftman.cardform.OnPayBtnClickListner;

import org.w3c.dom.Text;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        CardForm cardForm = (CardForm) findViewById(R.id.cardform);
        TextView txtDes = (TextView) findViewById(R.id.payment_amount);
        Button btnPay = (Button) findViewById(R.id.btn_pay);

        txtDes.setText("$1999");
        btnPay.setText(String.format("Payer %s",txtDes.getText()));


        cardForm.setPayBtnClickListner(new OnPayBtnClickListner() {
            @Override
            public void onClick(Card card) {
                Toast.makeText(CheckoutActivity.this, "Full Name : "+card.getName()+" | Last 4 digits : "+card.getLast4()
                        ,Toast.LENGTH_SHORT).show();
            }
        });



    }
}
