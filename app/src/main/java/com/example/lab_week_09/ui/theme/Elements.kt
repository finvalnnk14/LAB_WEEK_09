package com.example.lab_week_09.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//UI Element for displaying a title
@Composable
fun OnBackgroundTitleText(text: String) {
    TitleText(text = text, color =
    MaterialTheme.colorScheme.onBackground)
}
//Here, we use the titleLarge style from the typography
@Composable
fun TitleText(text: String, color: Color) {
    Text(text = text, style =
    MaterialTheme.typography.titleLarge, color = color)
}

//UI Element for displaying an item list
@Composable
fun OnBackgroundItemText(text: String) {
    ItemText(text = text, color =
    MaterialTheme.colorScheme.onBackground)
}

//Here, we use the bodySmall style from the typography
@Composable
fun ItemText(text: String, color: Color) {
    Text(text = text, style =
    MaterialTheme.typography.bodySmall, color = color)
}

//UI Element for displaying a button
@Composable
fun PrimaryTextButton(text: String, onClick: () -> Unit) {
    TextButton(text = text,
        textColor = Color.Black, //tulisan submit dan finish
        onClick = onClick
    )
}
@Composable
fun SecondaryTextButton(text: String, onClick: () -> Unit) {
    TextButton(text = text,
        textColor = Color.Blue,
        onClick = onClick
    )
}

//Here, we use the labelMedium style from the typography
@Composable
fun TextButton(text: String, textColor: Color, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.padding(8.dp),
        colors = ButtonDefaults
            .buttonColors(
                containerColor = Color.Blue, //untuk submit dan finish
                contentColor = textColor
            )
    ) {
        Text(text = text, style =
                MaterialTheme.typography.labelMedium)
    }
}