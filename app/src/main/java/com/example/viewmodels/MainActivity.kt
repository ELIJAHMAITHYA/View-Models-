package com.example.viewmodels

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.viewmodels.ui.theme.ContactsViewModel
import com.example.viewmodels.ui.theme.ViewModelsTheme

class MainActivity : ComponentActivity() {
    private val viewModel = ContactsViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewModelsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel.backgroundColor
                ) {
                    Button(onClick = {
                        viewModel.changebackgroundColor()
                    }) {
                        Text(text = "Change UI Back_Color")
                    }
                }
            }
        }
    }
}

