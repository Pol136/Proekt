package com.example.myproekt;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Fragment1 extends Fragment {

    public static double getRandomIntegerBetweenRange(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
    public String na, napis, proiz, chten, sim, cl, p;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = this.getArguments();
        String s = bundle.getString("message");
        int n = s.length();
        int simvol=n, clova=1, pred=1;
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

        napis = String.format("%.2f", n/nap);
        proiz = String.format("%.2f", n/pro);
        chten = String.format("%.2f", n/cht);

        int k=(int)getRandomIntegerBetweenRange(1,12);

        na = String.valueOf(n);
        sim = String.valueOf(simvol);
        cl = String.valueOf(clova);
        p = String.valueOf(pred);
        return inflater.inflate(R.layout.fragment_1, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView textView = (TextView) getView().findViewById(R.id.textView);
        //textView.setText(sqlit);
        TextView textView2 = (TextView) getView().findViewById(R.id.textView2);
        textView2.setText(na);
        TextView textView4 = (TextView) getView().findViewById(R.id.textView4);
        textView4.setText(sim);
        TextView textView5 = (TextView) getView().findViewById(R.id.textView5);
        textView5.setText(cl);
        TextView textView6 = (TextView) getView().findViewById(R.id.textView6);
        textView6.setText(p);
        TextView textView12 = (TextView) getView().findViewById(R.id.textView12);
        textView12.setText(chten);
        TextView textView11 = (TextView) getView().findViewById(R.id.textView11);
        textView11.setText(proiz);
        TextView textView19 = (TextView) getView().findViewById(R.id.textView19);
        textView19.setText(napis);
    }
}