import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val windowState = rememberWindowState()

    Window(
        onCloseRequest = ::exitApplication,
        title = "ComposeMultiplatformIssue4380",
        state = windowState,
    ) {
        Column {
            Text(
                text = "Current: ${windowState.placement}"
            )

            Row {
                WindowPlacement.entries.forEach {
                    TextButton(
                        onClick = {
                            windowState.placement = it
                        }
                    ) {
                        Text(it.name)
                    }

                }
            }
        }
    }
}