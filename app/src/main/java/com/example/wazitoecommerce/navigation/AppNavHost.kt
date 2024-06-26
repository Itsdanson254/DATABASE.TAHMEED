package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.busforbooking.ViewBusBookedScreen
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.passenger.AddPassengersScreen
import com.example.wazitoecommerce.ui.theme.screens.passenger.ViewPassengersScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = LOGIN_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PASSENGERS_URL){
            AddPassengersScreen(navController = navController)
        }
        composable(VIEW_PASSENGERS_URL){
            ViewPassengersScreen(navController = navController)
        }

        composable(ADD_BUSBOOKING_URL){
            ViewBusBookedScreen(navController = navController)
        }

        composable(VIEW_BUSBOOKING_URL){
            ViewBusBookedScreen(navController = navController)
        }







    }
}