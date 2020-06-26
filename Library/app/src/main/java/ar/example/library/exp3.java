package ar.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class exp3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp3);

        //PDF View
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Handbook of Data Structures and Applications.pdf")
                .enableSwipe(true) // allows to block changing pages using swipe
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                // spacing between pages in dp. To define spacing color, set view background
                .spacing(0)
                .pageFitPolicy(FitPolicy.WIDTH)
                .load();
    }
}