package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    // initialise the webView
    lateinit var wb1: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // link to webview from xml
        wb1 = findViewById(R.id.wb_Dogs)

        wb1.webViewClient = WebViewClient()

        wb1.apply {
            // allows javascript to run
            settings.javaScriptEnabled = true
            // if the user clicks a link in the webview android makes sure it's not malicious
            settings.safeBrowsingEnabled = true
            // loads the html file from the assets folder
            loadUrl("file:///android_asset/dogs.html")
        }
    }


}