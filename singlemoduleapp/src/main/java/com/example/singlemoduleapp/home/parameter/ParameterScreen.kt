package com.example.singlemoduleapp.home.parameter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.singlemoduleapp.home.HomeNavGraph
import com.ramcosta.composedestinations.annotation.Destination

@HomeNavGraph
@Destination
@Composable
fun ParameterScreen(parameter: String) {
    // @kotlinx.serialization.Serializable annotated types possible! https://composedestinations.rafaelcosta.xyz/destination-arguments/navigation-arguments

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Parameter Screen - $parameter")
    }
}