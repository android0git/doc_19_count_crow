package ru.startandroid.doc_19_count_crow;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mHelloTextView, mСountTextView;
    private int mCntСrow = 0, mCntСat = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = (TextView) findViewById(R.id.text_KtoTi);
        mСountTextView = (TextView) findViewById(R.id.text_rez);

    }

    public void Click_new_crow(View view) {
        // mСountTextView.setText("Я насчитал " + ++mCntСrow + " ворон"+"["+mCntСat );
        mCntСrow++;

        LayoutInflater inflater  = getLayoutInflater() ;
        View layout = inflater.inflate(R.layout.custom_layout ,
                (ViewGroup) findViewById(R.id.toast_layout) );
        Toast ts_crow = Toast.makeText( getApplicationContext() , "ворон" ,  Toast.LENGTH_SHORT);
        ts_crow.setGravity(Gravity.LEFT , 0, 0);
        ts_crow.setView(layout);

        ts_crow.show();
        rez_Say();
    }

    public void Click_new_cat(View view) {
        mCntСat++;
        Toast ts_cat = Toast.makeText( getApplicationContext() , "котиков" ,  Toast.LENGTH_LONG);
        ts_cat.setGravity(Gravity.RIGHT , 0, 0);
        LinearLayout toastContainer = (LinearLayout) ts_cat.getView();
        ImageView catImg =new ImageView( getApplicationContext());
        catImg.setImageResource(R.drawable.cat) ;
        toastContainer.addView( catImg , 0);
        ts_cat.show();
        rez_Say();
        // mСountTextView.setText("Я насчитал " + ++mCntСat + "котиков "+"["+mCntСrow );
    }

    public void rez_Say() {
        mСountTextView.setText("Я насчитал " + mCntСrow + " ворон и " + mCntСat + " котиков ");
    }

    public void Click_Say(View view) {
        mHelloTextView.setText("Hello User!");
    }
}

