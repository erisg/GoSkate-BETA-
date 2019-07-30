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
