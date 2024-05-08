package com.example.wazitoecommerce.ui.theme.screens.nairobibooking

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ROUT_CLOTHING

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NairobiBookingScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {

        //Top app bar
        TopAppBar(
            title = { Text(text = "TAHMEED BOOKING ") }
        )
        //end of Top app bar
        val mContext = LocalContext.current

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center
        ) {
            val mContext = LocalContext.current
            Image(
                painter = painterResource(id = R.drawable.bus3),
                contentDescription = "",
                modifier = Modifier
                    .clickable {
                        navController.navigate(ROUT_CLOTHING)
                        Toast.makeText(mContext,"Go to winter collection !",
                            Toast.LENGTH_SHORT).show() }
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {



            }

        }
        Spacer(modifier = Modifier.height(10.dp))

        Column (modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(start = 20.dp)){
            Row {

                //CARD1
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus2),
                                contentDescription = "BUS",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "KDL 224Y",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 2500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} }, ){
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD1

                Spacer(modifier = Modifier.width(15.dp))

                //CARD2
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus66),
                                contentDescription = "BUS",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "KDH 334R",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 2500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} },
                            ) {
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD2
            }
            //end row1

            Spacer(modifier = Modifier.height(3.dp))


            Row {

                //CARD1
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus2),
                                contentDescription = "BUS",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "KDA 445R",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 2500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} },
                            ) {
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD1

                Spacer(modifier = Modifier.width(15.dp))

                //CARD2
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus44),
                                contentDescription = "BUS",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "KCP 333T",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 2500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} },
                            ) {
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD2
            }
            //end row2

            Spacer(modifier = Modifier.height(3.dp))

            Row {

                //CARD1
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.tm20),
                                contentDescription = "BUS",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "KDC 111U",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 2500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} },
                            ) {
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD1

                Spacer(modifier = Modifier.width(15.dp))

                //CARD2
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus44),
                                contentDescription = "BUS",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "KCT 444Y",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 2500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} },
                            ) {
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD2
            }
            //end row3


            Row {

//START OF ROW 4
                //CARD1
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus2),
                                contentDescription = "BUS",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "KDL 224Y",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 2500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} }, ){
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD1

                Spacer(modifier = Modifier.width(15.dp))

                //CARD2
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus66),
                                contentDescription = "BUS",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "KDH 334R",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 2500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} },
                            ) {
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD2
            }
            //end row4

        }


    }
}

@Preview(showBackground = true)
@Composable
fun NairobibookingScreenPreview(){
    NairobiBookingScreen(rememberNavController())
}