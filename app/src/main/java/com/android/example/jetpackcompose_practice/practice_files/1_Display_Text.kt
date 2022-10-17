package com.android.example.jetpackcompose_practice.practice_files

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

//Think as this is main function, according to the examples repo.
@Composable
fun DisplayText() {
    SimpleText(string = "This is my practice on displaying text!")
}

@Composable
fun SimpleText(string: String) {
    Text(text = string)
}

@Preview
@Composable
fun DisplayTextPreview() {
    DisplayText()
}