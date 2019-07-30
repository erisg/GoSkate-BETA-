package skate.bogota.goskate.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.login_button
import kotlinx.android.synthetic.main.activity_login.login_email
import kotlinx.android.synthetic.main.activity_main.*
import skate.bogota.goskate.R

class loginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        /**
         * Validacion formulario
         */

        login_button.setOnClickListener {
            if (login_email.text.toString().isEmpty()) {
                login_email.error = "Porfavor Ingresar Email"
                login_email.requestFocus()
            }
            if (password_login.text.toString().isEmpty()) {
                password_login.error = "Porfavor Ingresar contraseña"
                password_login.requestFocus()
            }
        }

        noAcount_button.setOnClickListener {
            val nowAcount = Intent(this, newUserActivity::class.java)
            startActivity(nowAcount)
        }

        login_button.setOnClickListener {
            val login = Intent(this, MainActivity::class.java)
            startActivity(login)
        }


    }

}
