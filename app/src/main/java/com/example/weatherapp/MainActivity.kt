package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Homescreen();

                }
            }
        }
    }
}


@Composable
fun Homescreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            color = Color.Black,
            text = "SARAS APP",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Boxscreen()

        Spacer(modifier = Modifier.padding(10.dp))

        Lokasi()

        Spacer(modifier = Modifier.padding(15.dp))

        BoxKeterangan()
    }
}

@Composable
fun Boxscreen() {
    Box(
        Modifier
            .clip(RoundedCornerShape(25.dp))
            .background(color = Color.LightGray)
            .fillMaxWidth()
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(painter = painterResource(id = R.drawable.background), contentDescription = "",
            modifier = Modifier.size(200.dp)
            )
            Text(text = "Rain",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(15.dp))
        }
    }
}

@Composable
fun Lokasi() {
    Text(text = "19°C", fontSize = 64.sp, fontWeight = FontWeight.Bold)

    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_location_on_24),
            contentDescription = "",
            modifier = Modifier.size(35.dp))

        Spacer(modifier = Modifier.padding(3.dp))

        Text(text = "Yogyakarta", fontWeight = FontWeight.Bold, fontSize = 40.sp)
    }
    Spacer(modifier = Modifier.padding(5.dp))

    Text(text = "Kasihan, Kabupaten Bantul,",
        textAlign = TextAlign.Center,
        fontSize = 15.sp,
        color = Color.Gray,
        fontWeight = FontWeight.Bold
    )

    Spacer(modifier = Modifier.padding(1.dp))

    Text(text = "Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        fontSize = 15.sp,
        color = Color.Gray,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun BoxKeterangan() {
    Box(
        Modifier
            .clip(RoundedCornerShape(25.dp))
            .background(color = Color.LightGray)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
           Column(
               horizontalAlignment = Alignment.CenterHorizontally,
               modifier = Modifier.fillMaxHeight(),
               verticalArrangement = Arrangement.Center
           ) {
               Text(text = "Humidity", fontSize = 20.sp, color = Color.Black, modifier = Modifier.padding(5.dp))
               Text(text = "98%", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.Black)

               Spacer(modifier = Modifier.padding(10.dp))

               Text(text = "Sunrise", fontSize = 20.sp, color = Color.Black, modifier = Modifier.padding(5.dp))
               Text(text = "05.00 AM", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.Black)
           }
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "UV Index", fontSize = 20.sp, color = Color.Black, modifier = Modifier.padding(5.dp))
                Text(text = "9/10", fontSize = 25.sp, fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.padding(10.dp))

                Text(text = "Sunset", fontSize = 20.sp, color = Color.Black, modifier = Modifier.padding(5.dp))
                Text(text = "05.40 PM", fontSize = 25.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

