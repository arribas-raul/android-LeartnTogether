package com.arribas.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arribas.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    PrintArticle(
                        title =  stringResource(R.string.title),
                        subtitle =  stringResource(R.string.subtitle),
                        body = stringResource(R.string.body))
                }
            }
        }
    }
}

@Composable
fun PrintArticle(title: String, subtitle: String, body: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {

        val image = painterResource(R.drawable.bg_compose_background)

        Image(
            painter = image,
            contentDescription = null
        )

        Text(
            text = title,
            fontSize = 26.sp,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = subtitle,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )

        Text(
            text = body,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        PrintArticle(
            title =  stringResource(R.string.title),
            subtitle =  stringResource(R.string.subtitle),
            body = stringResource(R.string.body))
    }
}