package com.example.singlemoduleapp.home.result

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.singlemoduleapp.home.HomeNavGraph
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@HomeNavGraph
@Destination
@Composable
fun ResultScreen(
    navigator: DestinationsNavigator
) {
    // TODO add ResultRecipient

    Button(onClick = {
        // TODO navigate to EnterResultScreenDestination
    }) {
        Text(text = "Go to Enter Result")
    }
}

