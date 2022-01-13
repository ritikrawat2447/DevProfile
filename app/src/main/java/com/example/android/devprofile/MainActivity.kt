package com.example.android.devprofile

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.example.android.devprofile.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val bitmap = BitmapFactory.decodeResource(resources , R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap)
        rounded.cornerRadius = 15f
        binding.logo.setImageDrawable(rounded)

    }
}