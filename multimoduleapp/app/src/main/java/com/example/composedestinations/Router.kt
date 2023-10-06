package com.example.composedestinations

import androidx.navigation.NavHostController
import com.example.featureone.FeatureOneRouter
import com.example.featuretwo.FeaturetwoNavGraph
import com.ramcosta.composedestinations.navigation.navigate

class Router : FeatureOneRouter {

    private lateinit var navHostController: NavHostController

    override fun navigateToFeatureTwo() {
        navHostController.navigate(FeaturetwoNavGraph)
    }

    fun setNavController(navHostController: NavHostController) {
        this.navHostController = navHostController
    }
}