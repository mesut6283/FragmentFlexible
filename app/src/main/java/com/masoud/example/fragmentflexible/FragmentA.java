package com.masoud.example.fragmentflexible;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by MASOUD on 5/23/2016.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {
    ListView listView;
    Commuincator commuincator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmen_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        commuincator= (Commuincator) getActivity();
        listView= (ListView) getActivity().findViewById(R.id.listView);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.title,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        commuincator.respond(position);
    }
}
