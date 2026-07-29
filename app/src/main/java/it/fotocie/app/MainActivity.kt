package it.fotocie.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FotoCIEApp()
        }
    }
}


@Composable
fun FotoCIEApp() {

    MaterialTheme {

        Surface(
            color = Color(0xFF0D47A1)
        ) {

            Text(
                text = "Foto-CIE\n\nCrea la tua foto tessera",
                color = Color.White
            )

        }
    }
}
