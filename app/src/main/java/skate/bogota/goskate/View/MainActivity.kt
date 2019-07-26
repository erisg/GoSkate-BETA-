package skate.bogota.goskate.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import skate.bogota.goskate.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    /**
     *
     */
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.home_btn ->{
                val login = Intent(this, MainActivity::class.java)
                startActivity(login)
            }
            R.id.map_btn ->{
                val mapa = Intent(this, MapsGoSkate::class.java)
                startActivity(mapa)
            }
        }
        return super.onOptionsItemSelected(item)
    }


}
