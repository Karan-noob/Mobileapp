package com.example.karankewalramani.prevacation;

import android.app.DownloadManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                DownloadManager downloadManager;
                downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                Uri u= Uri.parse("http://www.tournand.com/guillaume/project_cs_guide/counter-strike_strategy_guide.pdf");
                DownloadManager.Request request; //declaring request object
                request=new DownloadManager.Request(u)
                        .setTitle("CS GO")
                        .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                downloadManager.enqueue(request);
            }


        });
    }
}
