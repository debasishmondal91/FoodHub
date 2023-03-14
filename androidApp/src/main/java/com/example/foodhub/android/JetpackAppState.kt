package com.example.foodhub.android

import android.content.res.Resources
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.foodhub.android.components.SnackbarManager
import kotlinx.coroutines.CoroutineScope

object MainDestinations {
    const val HOME_ROUTE = "home"
    const val SNACK_DETAIL_ROUTE = "snack"
    const val SNACK_ID_KEY = "SnackId"
}

@Composable
fun rememberJetpackAppState(
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    navController: NavHostController = rememberNavController(),
    snackBarManager: SnackbarManager = SnackbarManager,
    resources: Resources = resources(),
    coroutineScope: CoroutineScope = rememberCoroutineScope()
) =
    remember(scaffoldState, navController, snackBarManager, resources, coroutineScope){
        JetpackAppState(scaffoldState, navController, snackBarManager, resources, coroutineScope)
    }


class JetpackAppState(
    val scaffoldState: ScaffoldState,
    val navController: NavHostController,
    private val snackBarManager: SnackbarManager,
    private val resources: Resources,
    coroutineScope: CoroutineScope
) {

}


@Composable
@ReadOnlyComposable
private fun resources(): Resources {
    LocalConfiguration.current
    return LocalContext.current.resources
}