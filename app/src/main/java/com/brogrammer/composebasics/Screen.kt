package com.brogrammer.composebasics

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview
//@Composable
//fun PreviewItem(){
//    BlogCategory(img = R.drawable.user, title = "Programming", subTitle = "Learn Different Languages")
//}

//Normal Scrolling implementation
//@Preview(heightDp = 500)
//@Composable
//fun PreviewItem(){
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCategoryList().map { item ->
//            BlogCategory(img = item.img, title = item.title, subTitle = item.subTitle)
//        }
//    }
//}

//Lazy Column Implementation(Scrolling)
//@Preview(heightDp = 500)
//@Composable
//fun PreviewItem(){
//    LazyColumn(content = {
//        items(getCategoryList()){ item ->
//            BlogCategory(img = item.img, title = item.title , subTitle = item.subTitle)
//        }
//    })
//}
//
//@Composable
//fun BlogCategory(img: Int, title: String, subTitle: String) {
//    Card(elevation = 8.dp, modifier = Modifier.padding(8.dp)) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier.padding(8.dp)
//        ) {
//            Image(
//                painter = painterResource(id = img),
//                contentDescription = "",
//                modifier = Modifier
//                    .size(48.dp)
//                    .padding(8.dp)
//                    .weight(.2f)
//            )
//            ItemDescription(title, subTitle, Modifier.weight(0.8f))
//        }
//
//    }
//}
//
//@Composable
//private fun ItemDescription(title: String, subTitle: String, modifier: Modifier) {
//    Column(modifier = modifier) {
//        Text(
//            text = title,
//            style = MaterialTheme.typography.h6
//        )
//        Text(
//            text = subTitle,
//            style = MaterialTheme.typography.subtitle1,
//            fontWeight = FontWeight.Thin
//        )
//
//    }
//}
//
//
//data class Category(val img: Int, val title: String, val subTitle: String)
//
//
//fun getCategoryList(): MutableList<Category> {
//    val list= mutableListOf<Category>()
//    list.add(Category(R.drawable.user, "Programming", "Learn Different Languages"))
//    list.add(Category(R.drawable.user, "Technology", "Latest news about Technology"))
//    list.add(Category(R.drawable.user, "Full Stack Development", "From BackEnd to FrontEnd"))
//    list.add(Category(R.drawable.user, "DevOps", "Deployment CI, CD, etc"))
//    list.add(Category(R.drawable.user, "AI & ML", "Basics of Artificial Intelligence"))
//    list.add(Category(R.drawable.user, "Programming", "Learn Different Languages"))
//    list.add(Category(R.drawable.user, "Technology", "Latest news about Technology"))
//    list.add(Category(R.drawable.user, "Full Stack Development", "From BackEnd to FrontEnd"))
//    list.add(Category(R.drawable.user, "DevOps", "Deployment CI, CD, etc"))
//    list.add(Category(R.drawable.user, "AI & ML", "Basics of Artificial Intelligence"))
//    list.add(Category(R.drawable.user, "Programming", "Learn Different Languages"))
//    list.add(Category(R.drawable.user, "Technology", "Latest news about Technology"))
//    list.add(Category(R.drawable.user, "Full Stack Development", "From BackEnd to FrontEnd"))
//    list.add(Category(R.drawable.user, "DevOps", "Deployment CI, CD, etc"))
//    list.add(Category(R.drawable.user, "AI & ML", "Basics of Artificial Intelligence"))
//    list.add(Category(R.drawable.user, "Programming", "Learn Different Languages"))
//    list.add(Category(R.drawable.user, "Technology", "Latest news about Technology"))
//    list.add(Category(R.drawable.user, "Full Stack Development", "From BackEnd to FrontEnd"))
//    list.add(Category(R.drawable.user, "DevOps", "Deployment CI, CD, etc"))
//    list.add(Category(R.drawable.user, "AI & ML", "Basics of Artificial Intelligence"))
//
//    return list
//}