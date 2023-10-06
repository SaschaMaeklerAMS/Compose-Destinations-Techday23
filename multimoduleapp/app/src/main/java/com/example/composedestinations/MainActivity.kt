package com.example.composedestinations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.composedestinations.ui.ComposeDestinationsTheme
import com.example.featureone.FeatureOneRouter
import com.ramcosta.composedestinations.DestinationsNavHost
import org.koin.android.ext.android.inject
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.bind
import org.koin.dsl.module

class MainActivity : ComponentActivity() {

    private val router: Router by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startKoin {
            modules(module {
                single { Router() } bind FeatureOneRouter::class
            })
        }

        setContent {
            ComposeDestinationsTheme {

                val navController = rememberNavController().also { router.setNavController(it) }


                DestinationsNavHost(
                    navGraph = AppRootNavGraph,
                    navController = navController
                )
            }
        }
    }
}