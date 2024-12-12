package com.example.backstepapplication.compose.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HomeContent(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier.padding(innerPadding)
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text("Content goes here", modifier = Modifier.padding(16.dp))
    }
}