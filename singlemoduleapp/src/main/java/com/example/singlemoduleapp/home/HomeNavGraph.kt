package com.example.singlemoduleapp.home

import com.example.singlemoduleapp.AppRootNavGraph
import com.ramcosta.composedestinations.annotation.NavGraph


@AppRootNavGraph
@NavGraph
annotation class HomeNavGraph(
    val start: Boolean = false
)