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

data class Skill(
    val name: String,
    val level: Double
)

@Composable
fun SkillsComposable(skills: List<Skill>) {
    Column(
        modifier = Modifier.padding(all= 15.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(bottom = 10.dp),
                text = "Compétences : ",
                fontWeight = FontWeight.Bold
            )
        }

        Column() {
            for (skill in skills) {
                Text(text = skill.name)
                LinearProgressIndicator(
                    progress = skill.level.toFloat(), // Assurez-vous que MAX_LEVEL est la valeur maximale possible pour language.level
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(4.dp)
                        .background(Color.Gray)
                )
            }
        }
    }
}