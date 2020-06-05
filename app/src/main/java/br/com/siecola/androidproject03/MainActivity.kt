package br.com.siecola.androidproject03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import br.com.siecola.androidproject03.product.ProductInfoFragmentDirections

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // se nenhuma instância de MainActivity existir
        if (this.intent.hasExtra("product")) {
            showProductInfo(intent.getStringExtra("product")!!)
        }
    }


    // A ação criada deverá ser invocada de dentro de MainActivity, quando o usuário clicar na notificação.
    private fun showProductInfo(productInfo: String) {
        this.findNavController(R.id.nav_host_fragment)
            .navigate(ProductInfoFragmentDirections.actionShowProductInfo(productInfo))
    }


    // Esse é o caso onde MainActivity já existe, portanto ela apenas será atualizada com a informação
    // extra através do atributo intent passado pela função.
    override fun onNewIntent(intent: Intent) {

        if (intent.hasExtra("product")) {
            showProductInfo(intent.getStringExtra("product")!!)
        }

        super.onNewIntent(intent)
    }
}
