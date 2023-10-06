package com.example.featureone

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import org.koin.compose.koinInject

@RootNavGraph(start = true)
@Destination
@Composable
fun FeatureOneScreen() {
    val featureOneRouter: FeatureOneRouter = koinInject()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "FeatureOneScreen")

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            featureOneRouter.navigateToFeatureTwo()
        }) {
            Text(text = "Continue")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeatureOneScreenPreview() {
    FeatureOneScreen()
}