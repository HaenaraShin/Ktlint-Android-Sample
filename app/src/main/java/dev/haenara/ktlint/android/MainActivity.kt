package dev.haenara.ktlint.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.haenara.ktlint.android.databinding.ActivityMainBinding
import dev.haenara.ktlint.lib.MyClass

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textView.text = MyClass().string
    }
}
