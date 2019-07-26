package skate.bogota.goskate.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.bottom_nav
import skate.bogota.goskate.R

class galeryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galery)

        bottom_nav.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {

                R.id.nav_map_btn -> {
                    val login = Intent(this, MapsGoSkate::class.java)
                    startActivity(login)
                }

                R.id.nav_home_btn -> {
                    val login = Intent(this, MainActivity::class.java)
                    startActivity(login)
                }

                R.id.new_spot_btn -> {
                    val login = Intent(this, newSpotActivity::class.java)
                    startActivity(login)
                }
            }

            true
        }
    }
}
