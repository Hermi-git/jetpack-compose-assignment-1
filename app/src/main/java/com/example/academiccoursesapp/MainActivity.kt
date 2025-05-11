package com.example.academiccoursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.academiccoursesapp.model.Course
import com.example.academiccoursesapp.ui.screens.CourseListScreen
import com.example.academiccoursesapp.ui.theme.AcademicCoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AcademicCoursesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CourseListScreen(courses = sampleCourses)
                }
            }
        }
    }
}

private val sampleCourses = listOf(
    Course(
        id = "1",
        title = "Introduction to Computer Science",
        code = "CS101",
        credits = 4,
        description = "An introductory course covering fundamental concepts of computer science, including programming basics, algorithms, and data structures.",
        prerequisites = "None"
    ),
    Course(
        id = "2",
        title = "Data Structures and Algorithms",
        code = "CS201",
        credits = 4,
        description = "Advanced study of data structures and algorithms, including trees, graphs, sorting, and searching techniques.",
        prerequisites = "CS101"
    ),
    Course(
        id = "3",
        title = "Database Systems",
        code = "CS301",
        credits = 3,
        description = "Study of database design, implementation, and management. Topics include SQL, normalization, and database architecture.",
        prerequisites = "CS201"
    ),
    Course(
        id = "4",
        title = "Software Engineering Principles",
        code = "CS401",
        credits = 4,
        description = "Comprehensive study of software development methodologies, design patterns, and best practices in software engineering.",
        prerequisites = "CS201"
    ),
    Course(
        id = "5",
        title = "Mobile Application Development",
        code = "CS501",
        credits = 3,
        description = "Learn to develop mobile applications using modern frameworks and tools. Covers UI/UX design, platform-specific features, and app deployment.",
        prerequisites = "CS201"
    ),
    Course(
        id = "6",
        title = "Artificial Intelligence and Machine Learning",
        code = "CS601",
        credits = 4,
        description = "Introduction to AI concepts, machine learning algorithms, and their practical applications in solving real-world problems.",
        prerequisites = "CS201, CS301"
    ),
    Course(
        id = "7",
        title = "Web Development and Cloud Computing",
        code = "CS701",
        credits = 3,
        description = "Modern web development techniques, cloud services, and deployment strategies for scalable applications.",
        prerequisites = "CS301"
    ),
    Course(
        id = "8",
        title = "Cybersecurity Fundamentals",
        code = "CS801",
        credits = 4,
        description = "Study of security principles, cryptography, network security, and ethical hacking techniques.",
        prerequisites = "CS201, CS301"
    ),
    Course(
        id = "9",
        title = "Computer Networks and Distributed Systems",
        code = "CS901",
        credits = 4,
        description = "Understanding of network protocols, distributed computing concepts, and system architecture.",
        prerequisites = "CS201"
    ),
    Course(
        id = "10",
        title = "Advanced Programming Languages",
        code = "CS1001",
        credits = 3,
        description = "In-depth study of programming language paradigms, compilers, and language design principles.",
        prerequisites = "CS201, CS401"
    )
)

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AcademicCoursesTheme {
        CourseListScreen(courses = sampleCourses)
    }
}