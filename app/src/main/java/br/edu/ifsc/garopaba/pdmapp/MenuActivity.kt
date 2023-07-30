package br.edu.ifsc.garopaba.pdmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MenuActivity : AppCompatActivity() {

    private lateinit var textAppVersion: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        textAppVersion = findViewById(R.id.tv_version)
        textAppVersion.text = String.format(
            getString(R.string.version_information),
            BuildConfig.VERSION_NAME
        )
    }
}
