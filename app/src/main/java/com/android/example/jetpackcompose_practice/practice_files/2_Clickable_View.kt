package com.android.example.jetpackcompose_practice.practice_files

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//Think as this is main function, according to the examples repo.
@Composable
fun ClickableView() {
    Column(modifier = Modifier.fillMaxSize()) {
        ClickableText()
    }
}

@Composable
fun ClickableText() {
    //declaring the boolean
    var showPopUp by remember { mutableStateOf(false) }

    //clickable view itself
   Column(
       Modifier.clickable { showPopUp = true }
   ) {
       Card(
           shape = RoundedCornerShape(4.dp), modifier = Modifier.padding(8.dp), backgroundColor = Color.LightGray
       ) {
           Text(text = "Click to see the dialog alert", modifier = Modifier.padding(16.dp))
       }
   }

    //Alert dialog
    if (showPopUp) {
        AlertDialog(
            onDismissRequest = { showPopUp = false },
            text = { Text(text = "Hey! You clicked the button!")},
            confirmButton = { Button(onClick = { showPopUp = false }) { Text(text = "Ok") }}
        )
    }
}

@Preview
@Composable
fun ClickableViewPreview() {
    ClickableView()
}