package com.astimefades.beatsyncandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.content_main.*
import org.jetbrains.anko.startActivity

class   MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manageTracks.setOnClickListener {
            startActivity<ManageTracksActivity>()
        }

        managePlaylists.setOnClickListener {
            startActivity<ManagePlaylistsActivity>()
        }

        manageSession.setOnClickListener {
            Toast.makeText(this@MainActivity, "Manage session clicked", Toast.LENGTH_SHORT).show()
        }
    }
}