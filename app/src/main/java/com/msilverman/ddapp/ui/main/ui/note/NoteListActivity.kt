package com.msilverman.ddapp.ui.main.ui.note

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.msilverman.ddapp.R

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)

//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                    .replace(R.id.container, NoteListFragment.newInstance())
//                    .commitNow()
//        }
    }

}
