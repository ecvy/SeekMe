package com.ecvybtw.seekme.presentation.mainAct

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.DocumentsContract.Root
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ecvybtw.seekme.presentation.mainAct.ENums.RootNav
import com.ecvybtw.seekme.presentation.mainAct.subViews.PINOnBStep
import com.ecvybtw.seekme.presentation.mainAct.subViews.SMSAccess
import com.ecvybtw.seekme.presentation.mainAct.subViews.WelcomeOnBStep
import com.ecvybtw.seekme.ui.theme.SeekMeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SeekMeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Navigation()
                }
            }
        }
    }

    @Composable
    private fun Navigation() {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = RootNav.WELCOME_SCREEN.toString()
        ) {
            composable(RootNav.WELCOME_SCREEN.toString()) { WelcomeOnBStep(onNavigateToPINOnBStep = {navController.navigate(RootNav.PINOnBStep_SCREEN.toString())}) }
            composable(RootNav.PINOnBStep_SCREEN.toString()) { PINOnBStep(onNavigateToSMSAccess = {navController.navigate(RootNav.SMSAccess_SCREEN.toString())}) }
            composable(RootNav.SMSAccess_SCREEN.toString()) {SMSAccess(onNavigateToSMSAccess = {}) }

        }
    }
}
