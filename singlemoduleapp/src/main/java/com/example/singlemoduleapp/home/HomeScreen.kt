package com.example.singlemoduleapp.home

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
import com.example.singlemoduleapp.destinations.EnterParameterScreenDestination
import com.example.singlemoduleapp.destinations.ResultScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@HomeNavGraph(start = true)
@Destination
@Composable
fun HomeScreen(navigator: DestinationsNavigator) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Welcome Home <3")

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navigator.navigate(EnterParameterScreenDestination)
        }) {
            Text(text = "ParameterScreen")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navigator.navigate(ResultScreenDestination)
        }) {
            Text(text = "ResultScreen")
        }
    }
}