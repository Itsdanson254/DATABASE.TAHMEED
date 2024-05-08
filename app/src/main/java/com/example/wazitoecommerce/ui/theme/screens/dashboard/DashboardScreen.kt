package com.example.wazitoecommerce.ui.theme.screens.dashboard

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ROUT_CLOTHING
import com.example.wazitoecommerce.navigation.ROUT_KISUMU
import com.example.wazitoecommerce.navigation.ROUT_MALINDI
import com.example.wazitoecommerce.navigation.ROUT_MOMBASA
import com.example.wazitoecommerce.navigation.ROUT_NAIVASHA
import com.example.wazitoecommerce.navigation.ROUT_NAKURU
import com.example.wazitoecommerce.ui.theme.Blue1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController) {

    Column (modifier = Modifier.fillMaxSize()){

        //topappbar
        TopAppBar(
            title = { Text(text = "TAHMEED BOOKING") }
        )
        //end of topappbar

        Spacer(modifier = Modifier.height(30.dp))

        Row (modifier = Modifier.padding(start = 1.dp)){

            Image(
                painter = painterResource(id = R.drawable.tm10),
                contentDescription ="" ,
                modifier = Modifier.size(180.dp))

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(text = "TAHMEED", fontSize =26.sp, color = Blue1, fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Serif)
                Text(text = "BOOK YOUR DESTINATION", fontSize = 13.sp)
            }

            Spacer(modifier = Modifier.width(20.dp))


        }
        //end of row

        Spacer(modifier = Modifier.height(30.dp))

        Column (modifier = Modifier.padding(start = 20.dp)){

            Row {
                val mContext = LocalContext.current
                Card(modifier = Modifier
                    .size(width = 150.dp, height = 100.dp)

                    //CODE FOR NAVIGATION FROM DASHBOARD
                    .clickable {
                        navController.navigate(ROUT_CLOTHING)
                        Toast.makeText(mContext,"HEADING FOR BOOKING!",
                            Toast.LENGTH_SHORT).show()
                    })
                //END OF CODE FOR NAVIGATION TO RESPECTIVE SCREEN
                {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.tmnairobi),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = "NAIROBI BOOKING STATION",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))
                val context= LocalContext.current
                Card(modifier = Modifier
                    .size(width = 150.dp, height = 100.dp)
                    //CODE FOR NAVIGATION FROM DASHBOARD
                    .clickable {
                        navController.navigate(ROUT_NAKURU)
                        Toast.makeText(mContext,"HEADING FOR BOOKING!",
                            Toast.LENGTH_SHORT).show()
                    })
                //END OF CODE FOR NAVIGATION TO RESPECTIVE SCREEN

                {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.tmnakuru),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = "NAKURU BOOKING STATION",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }


            }
            //end of row

            Spacer(modifier = Modifier.height(30.dp))
            Row {
                val mContext= LocalContext.current
                Card(modifier = Modifier
                    .size(width = 150.dp, height = 100.dp)
                    //CODE FOR NAVIGATION FROM DASHBOARD
                    .clickable {
                        navController.navigate(ROUT_KISUMU)
                        Toast.makeText(mContext,"HEADING FOR BOOKING!",
                            Toast.LENGTH_SHORT).show()
                    })
                //END OF CODE FOR NAVIGATION TO RESPECTIVE SCREEN

                {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.tmkm),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = "KISUMU BOOKING STATION",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier
                    .size(width = 150.dp, height = 100.dp)
                    //CODE FOR NAVIGATION FROM DASHBOARD
                    .clickable {
                        navController.navigate(ROUT_MOMBASA)
                        Toast.makeText(mContext,"HEADING FOR BOOKING!",
                            Toast.LENGTH_SHORT).show()
                    })
                //END OF CODE FOR NAVIGATION TO RESPECTIVE SCREEN
                {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.tmmombasa),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = "MOMBASA BOOKING STATION",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }


            }
            //end of row

            Spacer(modifier = Modifier.height(30.dp))
            Row {
                val mContext = LocalContext.current
                Card(modifier = Modifier
                    .size(width = 150.dp, height = 100.dp)
                    //CODE FOR NAVIGATION FROM DASHBOARD
                    .clickable {
                        navController.navigate(ROUT_MALINDI)
                        Toast.makeText(mContext,"HEADING FOR BOOKING!",
                            Toast.LENGTH_SHORT).show()
                    })
                //END OF CODE FOR NAVIGATION TO RESPECTIVE SCREEN

                {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.tmmalindi),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = " MALINDI BOOKING STATION",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))
                val MContext = LocalContext.current
                Card(modifier = Modifier
                    .size(width = 150.dp, height = 100.dp)
                    //CODE FOR NAVIGATION FROM DASHBOARD
                    .clickable {
                        navController.navigate(ROUT_NAIVASHA)
                        Toast.makeText(MContext,"HEADING FOR BOOKING!",
                            Toast.LENGTH_SHORT).show()
                    })
                //END OF CODE FOR NAVIGATION TO RESPECTIVE SCREEN

                {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.tmnaivasha),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = "NAIVASHA BOOKING STATION",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }


            }
            //end of row


        }



    }

}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    DashboardScreen(rememberNavController())
}