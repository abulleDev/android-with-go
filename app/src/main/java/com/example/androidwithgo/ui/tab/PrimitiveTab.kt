package com.example.androidwithgo.ui.tab

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import gomodule.Gomodule

@Composable
fun PrimitiveTab() {
    var result by rememberSaveable { mutableStateOf("") }

    Text(text = result)

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        result = "IsTrue = ${Gomodule.getIsTrue()}"
    }) { Text(text = "IsTrue") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        result = "Int64Var = ${Gomodule.getInt64Var()}"
    }) { Text(text = "Int64Var") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        result = "Float64Var = ${Gomodule.getFloat64Var()}"
    }) { Text(text = "Float64Var") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        result = "StringVar = \"${Gomodule.getStringVar()}\""
    }) { Text(text = "StringVar") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        Gomodule.setStringVar("hi")
    }) { Text(text = "StringVar = \"hi\"") }
}
