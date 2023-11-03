import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        val skills = listOf(
            Skill("Symfony", 0.8),
            Skill("Git", 0.9),
            Skill("AngularJs", 0.7)
        )

        val languages = listOf(
            Language("Anglais", 0.9),
            Language("Espagnol", 0.7)
        )

        val user = User(
            "Valentin",
            "Hippolyte",
            "Apprenti développeur web",
            "je suis un apprenti développeur motivé et dynamique qui étudie actuellement à Efficom (Lille) en Master Management du Développement Digital. Je suis indépendant et essaie constamment de fournir un travail de bonne qualité et des solutions pertinentes.\n" +
                    "\n" +
                    "Je suis actuellement en alternance chez Worldline où je développe des nouvelles fonctionnalités pour des clients bancaires internationaux.",
            "06 07 08 09 10",
            "monmail@mail.com",
            "Permis B, véhiculé"
        )

        val experiences = listOf(
            Experience("La boite à ID ", "Wordpress, WooCommerce etc.", "2021"),
            Experience("Worldline", "Symfony, AngularJs etc. ", "2021-2024"),
        )

        val studies = listOf(
            Study("IUT-Lens", "DUT Informatique", "2019-2021"),
            Study("IUT- Calais", "LP DIM", "2021-2022"),
            Study("EFFICOM-LILLE", "MASTER MANAGEMENT DEVOPS", "2022-2024"),
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center

        ) {

            // SideBar
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.25f)
                    .background(Color(204,206,207)),

                ) {
                ImageComposable()

                UserContactComposable(user)

                SkillsComposable(skills)

                LanguagesComposable(languages)
            }

            // Corps
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.75f)
                    .background(Color(245,245,245)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                UserHeaderComposable(user)

                ExperiencesComposable(experiences)

                StudiesComposable(studies)
            }
        }
    }
}

expect fun getPlatformName(): String