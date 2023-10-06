package com.example.singlemoduleapp.welcome

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
import androidx.compose.ui.unit.dp
import com.example.singlemoduleapp.destinations.WelcomeScreen2Destination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@WelcomeNavGraph(start = true)
@Destination
@Composable
fun WelcomeScreen(navigator: DestinationsNavigator) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "WelcomeScreen 1")

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navigator.navigate(WelcomeScreen2Destination)
        }) {
            Text(text = "Continue")
        }
    }
}



