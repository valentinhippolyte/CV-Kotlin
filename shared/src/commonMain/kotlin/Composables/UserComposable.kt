import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

data class User(
    val firstName: String,
    val lastName: String,
    val job: String,
    val description: String,
    val phoneNumber: String,
    val email: String,
    val drivingLicence: String,
)

@Composable
fun UserHeaderComposable(user: User) {
    Column(

        modifier = Modifier.padding(all= 15.dp)
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp)) {
                    append(user.firstName + " " + user.lastName)
                }
                append("\n")
                withStyle(style = SpanStyle(fontStyle = FontStyle.Italic, fontSize = 16.sp)) {
                    append(user.job)
                }
            },
            modifier = Modifier.padding(bottom = 30.dp),
            style = TextStyle(
                textAlign = TextAlign.Start
            )
        )
        Text(
            text= user.description,
            style = TextStyle(textAlign = TextAlign.Justify)
        )
    }
}

@Composable
fun UserContactComposable(user: User) {
    Column(
        modifier= Modifier.padding(all= 15.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(bottom = 10.dp),
                text = "Contact : ",
                fontWeight = FontWeight.Bold
            )
        }

        Column() {
            Text(text= user.email)
            Text(text= user.phoneNumber)
            Text(text= user.drivingLicence)
        }
    }
}
@OptIn(ExperimentalResourceApi::class)
@Composable
fun ImageComposable() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.30f)
                .padding(all = 10.dp),
            painter = painterResource("photo.jpg"),
            contentDescription = null
        )
    }
}
