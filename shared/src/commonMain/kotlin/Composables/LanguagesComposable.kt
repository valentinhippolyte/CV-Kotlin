import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class Language(
    val name: String,
    val level: Double
)

@Composable
fun LanguagesComposable(languages: List<Language>) {
    Column(
        modifier= Modifier.padding(all= 15.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(bottom = 10.dp),
                text = "Langues : ",
                fontWeight = FontWeight.Bold
            )
        }

        Column() {
            for (language in languages) {
                Text(text = language.name)
                LinearProgressIndicator(
                    progress = language.level.toFloat(),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(4.dp)
                        .background(Color.Gray)
                )
            }
        }
    }
}
