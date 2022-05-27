package com.example.myproekt;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import java.text.BreakIterator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {
    public EditText Edit;
    public String s;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Edit = (EditText) findViewById(R.id.Edit);
    }

    public void onClick1(View view){
        s = Edit.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("message", s);
        Fragment1 fragInfo = new Fragment1();
        fragInfo.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.cont, fragInfo);
        transaction.commit();
    }
}