package com.example.searchviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list; // ListView declared to hold the string data from the ArrayList
    ArrayList<String> list1; // ArrayList of type String to add the data
    ArrayAdapter<String> adapter; // ArrayAdapter to convert ArrayList of objects/strings into View menu items
    SearchView s; // declare SearchView widget

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllViews();

        list1 = new ArrayList<>(); // initilaize the new ArrayList
        list1.add("CENG 319"); //  add the data to the list starting with the first String
        list1.add("CENG 317");
        list1.add("CENG 318");
        list1.add("CENG 355");

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list1); // take the context, and the appended list items and add a simple layut to display the items
        list.setAdapter(adapter); // used to display items in the list(set all the items to the listview)

        s.setOnQueryTextListener(new SearchView.OnQueryTextListener() { //sets up a listener to take the action from the SearchView
            @Override
            public boolean onQueryTextSubmit(String query) { // when the query is submitted
                Toast.makeText(getApplicationContext(), "You searched" + query,Toast.LENGTH_SHORT).show(); // display this toast message with the query that is entered by the user
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) { // used to check query and automatically change context while the user types into the searchbar
                adapter.getFilter().filter(newText); // takes the items in the list, and filters through the listview,only showing the filtered items
                Toast.makeText(getApplicationContext(), "Were you trying to search for.." + list1 + "?", Toast.LENGTH_SHORT).show();
                return false;
            }
        });




    }

    private void findAllViews(){
        s = findViewById(R.id.search);
        list = findViewById(R.id.listView);
    }
}
