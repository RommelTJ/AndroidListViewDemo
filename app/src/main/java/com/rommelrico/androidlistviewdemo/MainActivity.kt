package com.rommelrico.androidlistviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val friendsListView = findViewById<ListView>(R.id.friendListView)
        val myFriends = arrayOf("Mark", "Jane", "Susan", "Jan")
        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, myFriends)
        friendsListView.adapter = arrayAdapter

        friendsListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id -> Toast.makeText(applicationContext, "Hello ${myFriends.get(position)}", Toast.LENGTH_LONG).show() }

    } // end onCreate.
}
