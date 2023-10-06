package com.example.singlemoduleapp.home.result

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.singlemoduleapp.home.HomeNavGraph
import com.ramcosta.composedestinations.annotation.Destination

@HomeNavGraph
@Destination
@Composable
fun EnterResultScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Enter Result Screen")

        Spacer(modifier = Modifier.height(30.dp))

        var result by remember { mutableStateOf("") }
        TextField(value = result, onValueChange = { result = it })

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            // TODO add result to ResultBackNavigator and navigate back
        }) {
            Text(text = "Submit Result (navigate back)")
        }
    }
}