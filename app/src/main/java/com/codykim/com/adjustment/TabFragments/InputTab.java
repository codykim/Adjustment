package com.codykim.com.adjustment.TabFragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.codykim.com.adjustment.R;

/**
 * Created by Kim on 2018. 1. 27..
 */

public class InputTab extends Fragment {

    private ListView listview;
    private String[] items = new String[1];
    private View view;
    private ArrayAdapter<String> arrayAdapter;

    private String[] adapterData = new String[] { "Afghanistan", "Albania", "Algeria",
            "American Samoa", "Andorra", "Angola"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tab_fragment_input, container, false);

        // listview, header, footer 참조 획득.
        listview = (ListView)view.findViewById(R.id.listview_input) ;
        final View header = inflater.inflate(R.layout.listview_input_header, null, false) ;
        View footer = inflater.inflate(R.layout.listview_input_footer, null, false) ;

        // listView에 header, footer 추가.
        listview.addHeaderView(header) ;
        listview.addFooterView(footer) ;

        // 데이터를 지정하지 않은 adapter 생성하여 listview에 지정.
        arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1);
        listview.setAdapter(arrayAdapter);

        Button addButton = (Button) footer.findViewById(R.id.add);
        addButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int count ;

                // Adapter에서 현재 아이템 개수 얻어온 다음 아이템 추가.
                count = arrayAdapter.getCount() + 1 ;
                arrayAdapter.add("LIST" + Integer.toString(count)) ;

                // Header View의 "count" TextView에 아이템 개수 업데이트.
                TextView textView = (TextView) header.findViewById(R.id.count) ;
                textView.setText(Integer.toString(count)) ;
            }
        });

        return view;
    }

}