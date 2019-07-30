package skate.bogota.goskate.View

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import skate.bogota.goskate.R

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        menu_nav.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.home_menu -> {

                }

                R.id.item_mapa -> {
                    val galery = Intent(this, MapsGoSkate::class.java)
                    startActivity(galery)
                }

                R.id.item_cam -> {
                    val spot = Intent(this, galeryActivity::class.java)
                    startActivity(spot)
                }

                R.id.item_shop -> {
                    val shop = Intent(this, shopActivity::class.java)
                    startActivity(shop)
                }

                R.id.item_newspot -> {
                    val spot = Intent(this, newSpotActivity::class.java)
                    startActivity(spot)
                }
            }

            true
        }

    }

}
