package com.example.wazitoecommerce.ui.theme.screens.busforbooking
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.wazitoecommerce.data.BusBookingViewModel
import com.example.wazitoecommerce.data.PassengerViewModel
import com.example.wazitoecommerce.models.Passenger
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun ViewBusBookedScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var bookedbusRepository = BusBookingViewModel(navController, context)


        val emptyBookedBusState = remember { mutableStateOf(Passenger("","","","","")) }
        var emptyBookedBusListState = remember { mutableStateListOf<Passenger>() }

        var bookedbus = bookedbusRepository.allProducts(emptyBookedBusState, emptyBookedBusListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All BookedBus",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(bookedbus){
                BookedbusItem(
                        name = it.name,
                        destination = it.destination,
                        fare = it.fare,
                        id = it.id,
                        navController = navController,
                        bookedbusRepository = bookedbusRepository,
                        bookedbusImage = it.imageUrl
                    )
                }
            }
        }
    }
}


@Composable
fun BookedbusItem(name:String, destination:String, fare:String, id:String,
                  navController:NavHostController,
                  bookedbusRepository:BusBookingViewModel, bookedbusImage:String) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = destination)
        Text(text = fare)
        Image(
            painter = rememberAsyncImagePainter(bookedbusImage),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )
        Button(onClick = {
            bookedbusRepository.deleteProduct(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            //navController.navigate(ROUTE_UPDATE_PASSENGERS+"/$id")
        }) {
            Text(text = "Update")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ViewPassengersScreenPreview(){
    WazitoECommerceTheme {
        ViewBusBookedScreen(navController = rememberNavController())
    }
}