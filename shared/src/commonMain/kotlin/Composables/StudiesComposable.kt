import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Study(
    val school: String,
    val title: String,
    val years : String,
)

@Composable
fun StudiesComposable(studies: List<Study>) {
    Column(
        modifier = Modifier.padding(all= 15.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(bottom = 10.dp),
                text = "Formations : ",
                fontWeight = FontWeight.Bold
            )
        }

        Column() {
            for (study in studies) {
                val bulletPoint = "• "
                val text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append(bulletPoint)
                    }
                    append(study.title)
                    append(" à ")
                    append(study.school)
                    append(" (${study.years})")
                }

                Text(text = text)
            }
        }
    }
}