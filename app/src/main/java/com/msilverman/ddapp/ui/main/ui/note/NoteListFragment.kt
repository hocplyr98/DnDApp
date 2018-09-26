package com.msilverman.ddapp.ui.main.ui.note

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.msilverman.ddapp.R
import kotlinx.android.synthetic.main.fragment_note.*

class NoteListFragment : Fragment() {

    private lateinit var viewModel: NoteListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_note, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NoteListViewModel::class.java)
        // TODO: Use the ViewModel

        addNoteFAB.setOnClickListener{ view ->
            Navigation.findNavController(view).navigate(R.id.newNoteFragment)
        }
    }
}
