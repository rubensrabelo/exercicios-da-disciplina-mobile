package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardApp()
        }
    }
}

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2F8D2))
            .padding(16.dp)
    ) {

        Spacer(modifier = Modifier.weight(1f))

        BusinessCardAbout(
            logo = R.drawable.android_logo,
            name = "Rubens Rabêlo",
            description = "Student of the Information Systems Course",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.weight(1f))

        BusinessCardContact(
            phoneNumber = "(XX) X XXXX-XXXX",
            shareTo = "@rubensrabelo",
            email = "rubensrabelo123@gmail.com",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp)
        )
    }
}

@Composable
fun BusinessCardAbout(
    @DrawableRes logo: Int,
    name: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .background(Color(0xFF073042))
                .padding(20.dp)
        ) {
            Image(
                painter = painterResource(logo),
                contentDescription = "Personal Logo",
                modifier = Modifier.size(100.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = name,
            fontSize = 48.sp,
            color = Color.Black
        )


        Text(
            text = description,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color(0xFF1B5E20)
        )
    }
}

@Composable
fun BusinessCardContact(
    phoneNumber: String,
    shareTo: String,
    email: String,
    modifier: Modifier = Modifier
) {

    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 16.dp)
    ) {

        ContactItem(
            icon = Icons.Default.Phone,
            contact = phoneNumber
        )

        ContactItem(
            icon = Icons.Default.Share,
            contact = shareTo
        )

        ContactItem(
            icon = Icons.Default.Email,
            contact = email
        )
    }
}

@Composable
fun ContactItem(
    icon: ImageVector,
    contact: String,
    modifier: Modifier = Modifier
) {

    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(8.dp)
    ) {

        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF1B5E20)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = contact,
            fontSize = 16.sp
        )
    }
}

@Preview
@Composable
fun BusinessCardPreview() {
    BusinessCardApp()
}