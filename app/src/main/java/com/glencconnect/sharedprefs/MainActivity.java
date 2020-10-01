package com.glencconnect.sharedprefs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ListViewCompat;

import android.app.ListActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity{

    private static final String SHARED_PREFERENCES = "position";
    private static final String KEY_EDIT = "key_edit";
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor mEditor;
    private EditText text;
    private List<Books> booksList;
    private ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        booksList = new ArrayList<>();

        listAdapter = new ListAdapter(this,booksList);
        setListAdapter(listAdapter);

    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        mEditor.putString(KEY_EDIT,text.getText().toString());
//        mEditor.apply();
//    }
}
