package skate.bogota.goskate.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import skate.bogota.goskate.R

class newSpotActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_spot)

        bottom_nav.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.nav_home_btn -> {
                    val home = Intent(this, MainActivity::class.java)
                    startActivity(home)
                }

                R.id.nav_map_btn -> {
                    val map = Intent(this, MapsGoSkate::class.java)
                    startActivity(map)
                }

                R.id.cam_btn -> {
                    val galery = Intent(this, galeryActivity::class.java)
                    startActivity(galery)
                }

                R.id.shop_btn -> {
                    val shop = Intent(this, shopActivity::class.java)
                    startActivity(shop)
                }

                R.id.new_spot_btn -> {

                }
            }

            true
        }
    }
}
