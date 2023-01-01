package uz.widvan.example.pythonplus

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.downloader.Error
import com.downloader.OnDownloadListener
import com.downloader.PRDownloader
import com.mindorks.example.pythonplus.utils.FileUtils
import kotlinx.android.synthetic.main.activity_pdf_view.*
import java.io.File

class PdfViewActivity : AppCompatActivity() {

    companion object {
        private const val PDF_SELECTION_CODE = 99
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_view)

        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.black))

        PRDownloader.initialize(applicationContext)
        checkPdfAction(intent)
    }

    private fun showPdfFromAssets(pdfName: String) {
        pdfView.fromAsset(pdfName)
            .password(null)
            .defaultPage(0)
            .onPageError { page, _ ->
                Toast.makeText(
                    this@PdfViewActivity,
                    "Error at page: $page", Toast.LENGTH_LONG
                ).show()
            }
            .load()
    }


    private fun checkPdfAction(intent: Intent) {
        when (intent.getStringExtra("ViewType")) {
            "assets1" -> {
                showPdfFromAssets(FileUtils.getPdfNameFromAssetsBtn1())
            }
        }
        when (intent.getStringExtra("ViewType")) {
            "assets2" -> {
                showPdfFromAssets(FileUtils.getPdfNameFromAssetsBtn2())
            }
        }
        when (intent.getStringExtra("ViewType")) {
            "assets3" -> {
                showPdfFromAssets(FileUtils.getPdfNameFromAssetsBtn3())
            }
        }
        when (intent.getStringExtra("ViewType")) {
            "assets4" -> {
                showPdfFromAssets(FileUtils.getPdfNameFromAssetsBtn4())
            }
        }
        when (intent.getStringExtra("ViewType")) {
            "assets5" -> {
                showPdfFromAssets(FileUtils.getPdfNameFromAssetsBtn5())
            }
        }
        when (intent.getStringExtra("ViewType")) {
            "assets6" -> {
                showPdfFromAssets(FileUtils.getPdfNameFromAssetsBtn6())
            }
        }
        when (intent.getStringExtra("ViewType")) {
            "assets7" -> {
                showPdfFromAssets(FileUtils.getPdfNameFromAssetsBtn7())
            }
        }
        when (intent.getStringExtra("ViewType")) {
            "assets8" -> {
                showPdfFromAssets(FileUtils.getPdfNameFromAssetsBtn8())
            }
        }
    }
}
