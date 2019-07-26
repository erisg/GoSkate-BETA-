package skate.bogota.goskate.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new_user.*
import skate.bogota.goskate.R

class newUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user)

        /**
         *  Validacion de formulario
         */

        login_button.setOnClickListener {
            if(nameUser.text.toString().isEmpty()){
                nameUser.error = "Por Favor ingresar nombre"
                nameUser.requestFocus()
            }
            if(login_email.text.toString().isEmpty()){
                login_email.error = "Por Favor ingresar Email"
               // login_email.requestFocus()
            }
            if (passwor_login.text.toString().isEmpty()){
                passwor_login.error = "Por Favor ingresar contraseña valida"
                passwor_login.requestFocus()
            }
            if(comfirPass.text.toString().isEmpty()){
                if(comfirPass.text.equals(passwor_login)) {
                    comfirPass.error = "Las contraseñas no coinciden"
                }
            }
            if(edadlogin.text.isEmpty()){
                edadlogin.error = "Por Favor ingresar edad"
            }

            val noAcount = Intent(this,MainActivity::class.java)
            startActivity(noAcount)
        }
    }
}
