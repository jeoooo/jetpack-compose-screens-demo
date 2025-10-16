package com.example.jetpack_compose_screens_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpack_compose_screens_demo.screens.DashboardScreen
import com.example.jetpack_compose_screens_demo.screens.LoginScreen
import com.example.jetpack_compose_screens_demo.ui.theme.JetpackcomposescreensdemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackcomposescreensdemoTheme {
                val navController = rememberNavController()

                Scaffold(modifier = Modifier) { _ ->
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {

                        // define composable routes
                        composable("login") {
                            LoginScreen(
                                onLoginClick = { navController.navigate("dashboard") },
                            )
                        }

                        composable("dashboard") {
                            DashboardScreen()
                        }
                    }
                }
            }
        }
    }
}
