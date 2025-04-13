package com.example.ui_components

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginpage.ui.screens.PostCreationScreen
import com.example.ui_components.Robin.MKartFormScreen
import com.example.ui_components.Robin.MKartFormScreenContinue
import com.example.ui_components.Robin.PeerProfileScreen
import com.example.ui_components.Robin.PeersAndAlumniScreen
import com.example.ui_components.ui.theme.UI_ComponentsTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UI_ComponentsTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                    PeerProfileScreen()
//                MKartFormScreen()
//                PostCreationScreen()
//                }
                MKartFormScreen()
//                PeersAndAlumniScreen()
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UI_ComponentsTheme {
        Greeting("Android")
    }
}