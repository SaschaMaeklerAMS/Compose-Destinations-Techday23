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
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

// TODO Mache diesen Screen zu einer Destination im WelcomeNavGraph

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
            // TODO navigiere zum WelcomeScreen2
        }) {
            Text(text = "Continue")
        }
    }
}



