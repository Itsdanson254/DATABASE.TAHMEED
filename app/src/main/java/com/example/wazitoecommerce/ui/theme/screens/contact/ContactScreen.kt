package com.example.wazitoecommerce.ui.theme.screens.contact


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ContactScreen(navController: NavHostController){

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ContactScreenPreview(){
    ContactScreen(rememberNavController())
}