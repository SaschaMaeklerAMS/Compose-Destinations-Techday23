package com.example.singlemoduleapp.welcome

import com.example.singlemoduleapp.AppRootNavGraph
import com.ramcosta.composedestinations.annotation.NavGraph


@AppRootNavGraph(start = true)
@NavGraph
annotation class WelcomeNavGraph(
    val start: Boolean = false
)



