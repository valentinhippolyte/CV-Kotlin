import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp

data class Experience(
    val company: String,
    val skills: String,
    val years : String,
)

@Composable
fun ExperiencesComposable(experiences: List<Experience>) {
    Column(
        modifier = Modifier.padding(all= 15.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(bottom = 10.dp),
                text = "Expériences : ",
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            modifier = Modifier.padding(vertical = 10.dp)
        ) {
            for (experience in experiences) {
                val bulletPoint = "• "
                val text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append(bulletPoint)
                    }
                    append(experience.company)
                    append(" (${experience.years})")
                    append(" où j'ai appris ")
                    append(experience.skills)

                }

                Text(text = text)

                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}