package com.android.example.jetpackcompose_practice.practice_files

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Think as this is main function, according to the examples repo.
@Composable
fun PaddingOffsetAspectRatio() {
    LazyColumn {
        item { SamePaddingComponent() }
        item { CustomPaddingComponent() }
        item { OffsetComponent() }
        item { AspectRatioComponent() }
    }
}

//SamePaddingComponent
@Composable
fun SamePaddingComponent() {
    androidx.compose.material.Surface(color = Color.LightGray) {
        Text(
            text = "This text has equal padding of 16dp in all directions",
            modifier = Modifier.padding(16.dp),
            fontSize = 20.sp
        )
    }
}
//CustomPaddingComponent
@Composable
fun CustomPaddingComponent() {
    androidx.compose.material.Surface(color = Color.Gray) {
        Text(
            text = "This text has 5dp top padding, 10dp bottom padding, 5dp start padding, 2dp end padding",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 5.dp, bottom = 10.dp, start = 5.dp, end = 2.dp)
        )
    }
}
//OffsetComponent
@Composable
fun OffsetComponent() {
    androidx.compose.material.Surface(color = Color.DarkGray, modifier = Modifier.offset(x = 8.dp, y = 8.dp)) {
        Text(text = "This text uses offset of 8dp, it works like margin in CSS.", fontSize = 20.sp)
    }        
}
//AspectRatioComponent
@Composable
fun AspectRatioComponent() {
    androidx.compose.material.Surface(color = Color.Red.copy(alpha = .6f), modifier = Modifier
        .aspectRatio(16 / 9f)
        .padding(top = 16.dp)) {
        Text(text = "This text is wrapped in a layout that has a fixed aspect ratio of 16/9", fontSize = 20.sp)
    }    
}



@Preview
@Composable
fun PaddingOffsetAspectRatioPreview() {
    PaddingOffsetAspectRatio()
}