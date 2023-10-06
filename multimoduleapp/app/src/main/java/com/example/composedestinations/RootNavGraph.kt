package com.example.composedestinations

import com.example.featureone.FeatureoneNavGraph
import com.example.featuretwo.FeaturetwoNavGraph
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec

object AppRootNavGraph : NavGraphSpec {

    override val route = "root"

    override val destinationsByRoute = emptyMap<String, DestinationSpec<*>>()

    override val startRoute = FeatureoneNavGraph

    override val nestedNavGraphs = listOf(
        FeatureoneNavGraph,
        FeaturetwoNavGraph
    )
}