package com.example.singlemoduleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import androidx.navigation.plusAssign
import com.example.singlemoduleapp.ui.theme.ComposeDestinationsTheme
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.ModalBottomSheetLayout
import com.google.accompanist.navigation.material.rememberBottomSheetNavigator
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.animations.rememberAnimatedNavHostEngine

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialNavigationApi::class, ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDestinationsTheme {
                val navController = rememberNavController()

                val bottomSheetNavigator = rememberBottomSheetNavigator()
                navController.navigatorProvider += bottomSheetNavigator

                ModalBottomSheetLayout(
                    bottomSheetNavigator = bottomSheetNavigator,
                    sheetShape = RoundedCornerShape(16.dp),
                ) {
                    DestinationsNavHost(
                        navGraph = NavGraphs.appRoot,
                        engine = rememberAnimatedNavHostEngine(),
                        navController = navController,
                    )
                }
            }
        }
    }
}