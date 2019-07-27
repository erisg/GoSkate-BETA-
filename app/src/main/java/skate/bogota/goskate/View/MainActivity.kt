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


    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbarHome.setTitle(R.string.app_name)
        toolbarHome.setTitleTextColor(R.color.colorBlanco)

        bottom_nav.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.nav_home_btn -> {

                }

                R.id.cam_btn -> {
                    val galery = Intent(this, galeryActivity::class.java)
                    startActivity(galery)
                }

                R.id.nav_map_btn -> {
                    val map = Intent(this, MapsGoSkate::class.java)
                    startActivity(map)
                }

                R.id.shop_btn -> {
                    val shop = Intent(this, shopActivity::class.java)
                    startActivity(shop)
                }

                R.id.new_spot_btn -> {
                    val spot = Intent(this, newSpotActivity::class.java)
                    startActivity(spot)
                }
            }

            true
        }

    }

}
