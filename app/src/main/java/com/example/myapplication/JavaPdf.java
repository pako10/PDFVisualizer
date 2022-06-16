package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class JavaPdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_pdf);

        WebView webView = findViewById(R.id.webviewJ);

        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);


        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + "https://www.aforebanamex.com.mx/zonaAbierta/c/pdf/aviso_de_privacidad.pdf");


    }
}
