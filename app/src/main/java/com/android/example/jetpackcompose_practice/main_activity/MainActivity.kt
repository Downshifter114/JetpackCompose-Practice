package com.android.example.jetpackcompose_practice.main_activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.example.jetpackcompose_practice.practice_files.general.BackgroundColor
import com.android.example.jetpackcompose_practice.practice_files.general.ClickableView
import com.android.example.jetpackcompose_practice.practice_files.general.PaddingOffsetAspectRatio
import com.android.example.jetpackcompose_practice.ui.theme.JetpackCompose_PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BackgroundColor()
        }
    }
}

