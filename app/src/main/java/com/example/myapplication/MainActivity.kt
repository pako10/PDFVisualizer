package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.annotation.RequiresApi
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val BASE_URl = "https://docs.google.com/viewer?"
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        webview.webChromeClient = object : WebChromeClient(){

        }

        webview.webViewClient = object  : WebViewClient() {


        }

        val settings : WebSettings = webview.settings
        settings.javaScriptEnabled = true


        webview.loadUrl( "https://docs.google.com/gview?embedded=true&url=" + "https://www.aforebanamex.com.mx/zonaAbierta/c/pdf/aviso_de_privacidad.pdf")



    }
}


