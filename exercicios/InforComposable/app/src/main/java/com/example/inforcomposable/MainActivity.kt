package com.example.inforcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.inforcomposable.ui.theme.InforComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InforComposableApp()
        }
    }
}

@Composable
fun InforComposableCard(
    title: String,
    content: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                bottom = 16.dp
            )
        )
        Text(
            text = content
        )
    }
}

@Composable
fun InforComposableApp(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            InforComposableCard(
                title = "Text composable",
                content = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )

            InforComposableCard(
                title = "Image composable",
                content = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(modifier = Modifier.weight(1f)) {
            InforComposableCard(
                title = "Row composable",
                content = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )

            InforComposableCard(
                title = "Column composable",
                content = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview
@Composable
fun InforComposablePreview() {
    InforComposableApp()
}