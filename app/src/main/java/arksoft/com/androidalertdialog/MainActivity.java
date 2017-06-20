package arksoft.com.androidalertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Standart bir uyarı diyaloğu kurar,
     *    setTitle metodu başlık eklemek, setMessage metodu mesaj eklemek,
     *    ve setPositiveButton ve setNegativeButton uyarı üzerine buton yerleştirmek için kullanılır.
     * Hangi butona tıklandıysa kullanıcıya Toast mesajı gösteriyoruz
     */
    public void onClickShowAlert(View view) {
        // Uyarı diyaloğunu oluştur
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(MainActivity.this);
        // Başlığını oluştur
        myAlertBuilder.setTitle("Çıkış Yap");
        // Mesajı ayarla.
        myAlertBuilder.setMessage("Devam etmek için OK'a bitirmek için İPTAL'e basın");
        // Butonları ekle.

        myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // User clicked OK button.
                Toast.makeText(getApplicationContext(), "Ok butonu basıldı",
                        Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        myAlertBuilder.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Kullanıcı İptal butonuna basarsa aşağıdaki toast mesajını gösteriyoruz
                Toast.makeText(getApplicationContext(), "İptal butonu basıldı",
                        Toast.LENGTH_SHORT).show();
            }
        });


        // Diyaloğu ekranda göstermek için son olarak bu metodu çağırırız.
        myAlertBuilder.show();

    }
}
