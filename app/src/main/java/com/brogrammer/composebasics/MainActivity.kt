package com.brogrammer.composebasics

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.brogrammer.composebasics.ui.theme.ComposeBasicsTheme
import com.brogrammer.composebasics.ui.theme.NotificationScreen
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotificationScreen()
        }

    }
}


//Circular Image
//@Preview(showBackground = true, widthDp = 500, heightDp = 500)
//@Composable
//fun CircularImage(){
//    Image(painter = painterResource(id = R.drawable.square),
//        contentScale = ContentScale.Crop,
//        modifier = Modifier.size(80.dp)
//            .clip(CircleShape)
//            .border(2.dp, Color.LightGray, CircleShape),
//        contentDescription = "")
//}


//@Preview(showBackground = true, widthDp = 500, heightDp = 500)
////@Composable
////private fun PreviewFunction() {
////    Text(
////        text = "Hello",
////        color = Color.White,
////        modifier = Modifier
////            .clickable { }
////            .background(Color.Blue)
////            .size(200.dp)
////            .padding(36.dp)
////            .border(4.dp, Color.Red)
////            .clip(CircleShape)
////            .background(Color.Yellow)
////    )
////}

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//private fun PreviewFunction() {
//    Column {
//        ListViewItem(R.drawable.user , "Charlie", "Software Developer")
//        ListViewItem(R.drawable.man , "David Lee", " Technical Lead")
//        ListViewItem(R.drawable.user , "Henry Ford", "Software Engineer")
//        ListViewItem(R.drawable.man , "Adam Smith", "Marketing Head")
//        ListViewItem(R.drawable.user , "Kevin Shane", "Database Administrator")
//    }
//}


//@Composable
//fun ListViewItem(imgId: Int, name: String, occupation: String, modifier: Modifier) {
//    Row(modifier.padding(8.dp)) {
//        Image(
//            painter = painterResource(id = imgId),
//            contentDescription = "",
//            modifier = Modifier.size(40.dp)
//        )
//        Column() {
//            Text(
//                text = name,
//                fontWeight = FontWeight.Bold
//            )
//            Text(
//                text = occupation,
//                fontWeight = FontWeight.Thin,
//                fontSize = 12.sp
//            )
//        }
//    }
//}

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//private fun PreviewFunction() {
//    Box(contentAlignment = Alignment.BottomEnd){
//        Image(painter = painterResource(id = R.drawable.heart), contentDescription = "")
//        Image(painter = painterResource(id = R.drawable.arrow), contentDescription = "")
//    }
//
//}


//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//private fun PreviewFunction() {
//    Row(
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }
//
//}


//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//private fun PreviewFunction() {
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }
//
//}


//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//private fun PreviewFunction() {
////    TextField(
////        value = "Hello Kazama",
////        onValueChange = {},
////        label = { Text(text = "Enter Message")},
////        placeholder = {}
////        )
//    TextInput()
//}

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//fun TextInput(){
//    val state =  remember{mutableStateOf("")}
//    TextField(
//        value = state.value,
//        onValueChange = {
//            state.value = it
//        },
//        label = { Text(text = "Enter Message")},
//    )
//}


//private fun PreviewFunction() {
//    Button(
//        onClick = { }, colors = ButtonDefaults.buttonColors(
//            contentColor = Color.White,
//            backgroundColor = Color.Gray
//        ), enabled = false
//    ) {
//        Text(text = "Hello")
//        Image(painter = painterResource(id = R.drawable.heart), contentDescription = "Dummy Image")
//    }
//}


//private fun PreviewFunction() {
//    Image(
//        painter = painterResource(id = R.drawable.heart),
//        contentDescription = "Dummy Image",
//        colorFilter = ColorFilter.tint(Color.Blue),
//        contentScale = ContentScale.Crop
//    )
//}


//private fun PreviewFunction() {
//    Text(
//        text = "Hello Charlie",
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.Bold,
//        color = Color.Blue,
//        fontSize = 30.sp,
//        textAlign = TextAlign.Center
//    )
//}

