// kotlin
package com.example.jetpack_compose_screens_demo.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true, showSystemUi = false, name = "Basic Text Composable")
@Composable
fun BasicComposable() {
    Text(
        text = "Hello, Jetpack Compose!",
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .background(Color(0xFFEDE7F6))
    )
}

//@Preview(showBackground = true, showSystemUi = false, name = "Basic Like Button Composable")
@Composable
fun LikeButton() {
    Button(onClick = { /* TODO */ }) {
        Text("Like")
    }
}

@Preview(showBackground = true, showSystemUi = false, name = "Basic Composable")
@Composable
fun ButtonComposable() {
    Button(
        onClick = {
            /* Handle click */
        }
    ) {
        Icon(Icons.Filled.Favorite, contentDescription = "Like")
        Spacer(Modifier.width(8.dp))
        Text("Like")
    }
}
