package com.example.myproekt;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = this.getArguments();
        String s = bundle.getString("message");
        int n = s.length(), simvol=n, clova=1, pred=1;
        for (int i=0; i<n; i++){
            if (s.charAt(i)==' ') {
                simvol-=1;
                clova+=1;
            }
            if ((s.charAt(i)=='.') || (s.charAt(i)=='!') || (s.charAt(i)=='?') ||
                    ((i+2<n)&&(s.charAt(i)=='.')&&(s.charAt(i+1)=='.')&&(s.charAt(i+2)=='.'))){
                pred+=1;
            }
        }
        if (s.charAt(n-1)==' ') clova-=1;
        double nap=68.0, pro=180.0, cht=275.0;

        String napis = String.format("%.2f", n/nap);
        String proiz = String.format("%.2f", n/pro);
        String chten = String.format("%.2f", n/cht);


        TextView textView2 = (TextView) getView().findViewById(R.id.textView2);
        textView2.setText(n);
        TextView textView4 = (TextView) getView().findViewById(R.id.textView4);
        textView4.setText(simvol);
        TextView textView5 = (TextView) getView().findViewById(R.id.textView5);
        textView5.setText(clova);
        TextView textView6 = (TextView) getView().findViewById(R.id.textView6);
        textView6.setText(pred);
        TextView textView12 = (TextView) getView().findViewById(R.id.textView12);
        textView12.setText(chten);
        TextView textView11 = (TextView) getView().findViewById(R.id.textView11);
        textView11.setText(proiz);
        TextView textView19 = (TextView) getView().findViewById(R.id.textView19);
        textView19.setText(napis);
        return inflater.inflate(R.layout.fragment_1, container, false);
    }
}