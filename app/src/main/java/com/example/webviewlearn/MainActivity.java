package com.example.webviewlearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView web = (WebView) findViewById(R.id.webview);

        String key = "<img";
        DisplayMetrics dm = getResources().getDisplayMetrics();
        int widthPixels = dm.widthPixels;
        String content = "<p><img width=\"100%\" height=\"auto\" src=\"http://dpimg.oss-cn-beijing.aliyuncs.com/goods/05/170805174204394.jpg\" ></p>";
        String replace = content.replace(key, key + " width=\"" + widthPixels + "px\" height=\"auto\"");
        Log.i("xiong",replace);
        web.loadData(content, "text/html", "utf-8");
    }

}
