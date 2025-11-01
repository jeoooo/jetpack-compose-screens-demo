package com.example.jetpack_compose_screens_demo.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen(
    onLoginClick: () -> Unit = {},
    onForgotPasswordClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Sign in to your Account",
            modifier = Modifier.padding(vertical = 24.dp),
            style = TextStyle(fontSize = 36.sp)
        )

        Text(
            text = "Enter your email and password to login",
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Spacer(modifier = Modifier.height(80.dp))

        TextField(
            state = rememberTextFieldState(initialText = "email address"),
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            state = rememberTextFieldState(initialText = "password"),
            label = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        )

        TextButton(
            onClick = onForgotPasswordClick,
            modifier = Modifier
                .align(Alignment.End)
                .padding(top = 8.dp)
        ) {
            Text("Forgot Password?")
        }

        Button(
            onClick = onLoginClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text("Login")
        }
    }
}
