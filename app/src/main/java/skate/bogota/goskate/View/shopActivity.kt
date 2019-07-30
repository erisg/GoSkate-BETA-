package skate.bogota.goskate.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_shop.*
import kotlinx.android.synthetic.main.activity_shop.menu_nav
import skate.bogota.goskate.R

class shopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        /**
         * Menu
         * 7/30/2019
         */

        menu_nav.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.home_menu -> {
                    val home = Intent(this, MainActivity::class.java)
                    startActivity(home)
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
