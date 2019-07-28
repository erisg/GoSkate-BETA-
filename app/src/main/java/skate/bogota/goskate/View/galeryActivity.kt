package skate.bogota.goskate.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import skate.bogota.goskate.R

class galeryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galery)

//        bottom_nav.setOnNavigationItemSelectedListener { item ->
//
//            when (item.itemId) {
//                R.id.nav_home_btn -> {
//                    val home = Intent(this, MainActivity::class.java)
//                    startActivity(home)
//                }
//
//                R.id.nav_map_btn -> {
//                    val map = Intent(this, MapsGoSkate::class.java)
//                    startActivity(map)
//                }
//
//                R.id.cam_btn -> {
//
//                }
//
//
//                R.id.shop_btn -> {
//                    val shop = Intent(this, shopActivity::class.java)
//                    startActivity(shop)
//                }
//
//                R.id.new_spot_btn -> {
//                    val spot = Intent(this, newSpotActivity::class.java)
//                    startActivity(spot)
//                }
//            }
//
//            true
//        }
    }
}
