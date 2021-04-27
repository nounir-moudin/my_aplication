package ner.mon.nitx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book3 extends AppCompatActivity {

    PDFView pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book3);
        pdf= (PDFView)findViewById(R.id.pdfView);
        pdf.fromAsset("book2.pdf").load();
    }
}
