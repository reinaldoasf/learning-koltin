package com.example.exercicio3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Vertical
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exercicio3.ui.theme.Exercicio3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exercicio3Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    QuadrantCards()
                }
            }
        }
    }
}

@Composable
fun QuadrantCards() {
    Column (modifier = Modifier.fillMaxSize()){
        Row (modifier = Modifier.weight(1f)){
            InfoCard(
                title = stringResource(R.string.title1),
                content = stringResource(id = R.string.content1),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                title = stringResource(R.string.title2),
                content = stringResource(id = R.string.content2),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )

        }
        Row (modifier = Modifier.weight(1f)){
            InfoCard(
                title = stringResource(R.string.title3),
                content = stringResource(id = R.string.content3),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                title = stringResource(R.string.title4),
                content = stringResource(id = R.string.content4),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun InfoCard(
    title: String,
    content: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier
        .padding(16.dp)
        .fillMaxSize()
        .background(color = backgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(
            text = title,
            modifier = Modifier
                .padding(16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Exercicio3Theme {
        QuadrantCards()
    }
}