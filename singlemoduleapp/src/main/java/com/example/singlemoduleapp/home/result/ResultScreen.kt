package com.example.singlemoduleapp.home.result

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.singlemoduleapp.destinations.EnterResultScreenDestination
import com.example.singlemoduleapp.home.HomeNavGraph
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.result.NavResult
import com.ramcosta.composedestinations.result.ResultRecipient

@HomeNavGraph
@Destination
@Composable
fun ResultScreen(
    navigator: DestinationsNavigator,
    resultRecipient: ResultRecipient<EnterResultScreenDestination, String>
) {
    resultRecipient.onNavResult { navResult ->
        when (navResult) {
            is NavResult.Canceled -> {
                // `EnterResultScreenDestination` was shown but it was canceled
                // and no value was set (example: dialog/bottom sheet dismissed)
            }

            is NavResult.Value -> {
                navResult.value // do something with result
            }
        }
    }

    Button(onClick = {
        navigator.navigate(EnterResultScreenDestination)
    }) {
        Text(text = "Go to Enter Result")
    }
}

