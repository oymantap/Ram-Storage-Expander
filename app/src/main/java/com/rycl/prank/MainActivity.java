package com.rycl.prank;
import android.os.*;
import android.view.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Tampilan Awal: Tombol Penipu
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(0xFFFFFFFF);

        Button btn = new Button(this);
        btn.setText("AKTIFKAN STORAGE 1TB");
        layout.addView(btn);
        setContentView(layout);

        btn.setOnClickListener(v -> {
            // Berubah jadi layar virus
            layout.setBackgroundColor(0xFF000000);
            btn.setVisibility(View.GONE);
            
            TextView tv = new TextView(this);
            tv.setTextColor(0xFFFF0000);
            tv.setGravity(Gravity.CENTER);
            tv.setTextSize(20);
            layout.addView(tv);

            // Kunci Navigasi
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

            // Simulasi Teks Berjalan
            new Handler().postDelayed(() -> tv.setText("Menghapus Data Sistem..."), 2000);
            new Handler().postDelayed(() -> tv.setText("Menghapus Galeri & Kontak..."), 4000);
            new Handler().postDelayed(() -> tv.setText("SISTEM TERKUNCI!\nMasukkan Kode:"), 6000);

            // Bom Waktu: Keluar setelah 12 detik
            new Handler().postDelayed(() -> {
                Toast.makeText(this, "Cuma Prank! Dari Rycl buat kamu!", Toast.LENGTH_LONG).show();
                finishAffinity();
            }, 12000);
        });
    }

    @Override public void onBackPressed() {} // Tombol back mati
              }
                               
