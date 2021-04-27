package ner.mon.nitx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book2 extends AppCompatActivity {
    PDFView pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);
        pdf= (PDFView)findViewById(R.id.pdfView);
        pdf.fromAsset("book3.pdf").load();
    }
}