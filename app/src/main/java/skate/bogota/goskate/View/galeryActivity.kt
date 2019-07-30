package skate.bogota.goskate.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import skate.bogota.goskate.R

class galeryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galery)

        menu_nav.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.home_menu -> {
                    val home = Intent(this, MainActivity::class.java)
                    startActivity(home)
                }

                R.id.item_mapa -> {
                    val map = Intent(this, MapsGoSkate::class.java)
                    startActivity(map)
                }

                R.id.item_cam -> {

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
