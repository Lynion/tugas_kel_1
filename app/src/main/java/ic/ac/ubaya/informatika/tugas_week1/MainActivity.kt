package ic.ac.ubaya.informatika.tugas_week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    private var nama:String = "Septian"
    private var phone:String = "12345"
    private var acc:String = "Invitation Acc"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //        Toast.makeText(this, "Wellcome to Android $nama", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "$acc by phone number $phone", Toast.LENGTH_SHORT).show()
    }
}