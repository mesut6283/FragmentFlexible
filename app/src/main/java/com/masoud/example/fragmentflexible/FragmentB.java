package com.masoud.example.fragmentflexible;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MASOUD on 5/23/2016.
 */
public class FragmentB extends Fragment {
    TextView textView;
    String data;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_b,container,false);
        if(savedInstanceState==null){

        }else {
            data=savedInstanceState.getString("mydata");
            TextView textv= (TextView) view.findViewById(R.id.textView);
            textv.setText(data);
        }
        return view;



    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView= (TextView) getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mydata",data);
    }

    public void chaneData(int i) {
        Resources res=getResources();
        String[]discreptions=res.getStringArray(R.array.descriptions);
        data=discreptions[i];
        textView.setText(discreptions[i]);
    }
}
