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
import gomodule.ExampleStruct
import gomodule.Gomodule

@Composable
fun StructTab() {
    var result by rememberSaveable { mutableStateOf("") }

    Text(text = result)

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        val exampleStruct = ExampleStruct(1, 2, 3, 4, 5, 6)
        result = "exampleStruct = $exampleStruct"
    }) { Text(text = "new ExampleStruct(1, 2, 3, 4, 5, 6)") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        val exampleStruct = Gomodule.newExampleStruct(1, 2, 3, 4, 5, 6)
        result = "exampleStruct = $exampleStruct"
    }) { Text(text = "NewExampleStruct(1, 2, 3, 4, 5, 6)") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        val exampleStruct = Gomodule.newExampleStruct(1, 2, 3, 4, 5, 6)
        result = "exampleStruct.b = ${exampleStruct.b}"
    }) { Text(text = "ExampleStruct(1, 2, 3, 4, 5, 6).b") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        val exampleStruct = Gomodule.newExampleStruct(1, 2, 3, 4, 5, 6)
        exampleStruct.setD(0, 0)
        result = "exampleStruct = $exampleStruct"
    }) { Text(text = "ExampleStruct(1, 2, 3, 4, 5, 6).setD(0, 0)") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        val exampleStruct = Gomodule.newExampleStruct(0, 0, 0, 0, 0, 0)
        exampleStruct.addAXP(1, 2, 3)
        result = "exampleStruct = $exampleStruct"
    }) { Text(text = "ExampleStruct(0, 0, 0, 0, 0, 0).addAXP(1, 2, 3)") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        result = "E = ${Gomodule.getE()}"
    }) { Text(text = "E") }
}
