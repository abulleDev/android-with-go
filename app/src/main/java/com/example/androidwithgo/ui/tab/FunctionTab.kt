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
fun FunctionTab() {
    var result by rememberSaveable { mutableStateOf("") }

    Text(text = result)

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        result = "Not(true) = ${Gomodule.not(true)}"
    }) { Text(text = "Not(true)") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        result = "AddInt32(1, 2) = ${Gomodule.addInt32(1, 2)}"
    }) { Text(text = "AddInt32(1, 2)") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        result = "AddFloat64(1.5, 2.5) = ${Gomodule.addFloat64(1.5, 2.5)}"
    }) { Text(text = "AddFloat64(1.5, 2.5)") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        result = "Concat(\"Hello \", \"world!\") = \"${Gomodule.concat("Hello ", "world!")}\""
    }) { Text(text = "Concat(\"Hello \", \"world!\")") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        result = try {
            "Divide(1, 2) = ${Gomodule.divide(1, 2)}"
        } catch (e: Exception) {
            "Error occurred: ${e.message}"
        }
    }) { Text(text = "Divide(1, 2)") }

    Spacer(modifier = Modifier.height(12.dp))

    Button(onClick = {
        result = try {
            "Divide(1, 0) = ${Gomodule.divide(1, 0)}"
        } catch (e: Exception) {
            "Error occurred: ${e.message}"
        }
    }) { Text(text = "Divide(1, 0)") }
}
