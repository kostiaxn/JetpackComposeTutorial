package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TutorialImage(
                        stringResource(R.string.jetpack_compose_tutorial),
                        stringResource(R.string.second_text),
                        stringResource(R.string.third_text)
                    )
                }
            }
        }
    }
}

@Composable
fun TutorialText(
    firstText: String,
    secondText: String,
    thirdText: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
    ) {
        Text(
            text = firstText,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = secondText,
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = Justify
        )
        Text(
            text = thirdText,
            modifier = modifier.padding(16.dp),
            textAlign = Justify

        )
    }
}

@Composable
fun TutorialImage(
    firstText: String,
    secondText: String,
    thirdText: String,
    modifier: Modifier = Modifier
) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
    ) {
        Image(
            painter = image,
            contentDescription = null

        )
        TutorialText(firstText = firstText, secondText = secondText, thirdText = thirdText)

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialTheme {
        TutorialImage(
            stringResource(R.string.jetpack_compose_tutorial),
            stringResource(R.string.second_text),
            stringResource(R.string.third_text)
        )
    }
}