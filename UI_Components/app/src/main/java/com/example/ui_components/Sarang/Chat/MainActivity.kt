//package com.example.chat
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.layout.wrapContentHeight
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.CutCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.ArrowForward
//import androidx.compose.material.icons.filled.Menu
//import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material.icons.filled.Send
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.HorizontalDivider
//import androidx.compose.material3.Icon
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.chat.ui.theme.ChatTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            ChatTheme {
//                Chat()
//            }
//        }
//    }
//}
//
//@Composable
//fun Chat() {
//    // Remember scroll state
//    val scrollState = rememberScrollState()
//    var name by remember { mutableStateOf("") }
//
//
//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(Color(0xFFF3F4F9))
//    ){
//        Surface(
//            modifier = Modifier
//                .fillMaxWidth()
//                .wrapContentHeight(),
//            tonalElevation = 1024.dp,
//            shadowElevation = 16.dp,
//            color = Color.White
//        )
//        {
//            Box(modifier = Modifier.fillMaxWidth())
//            {
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(16.dp),
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Menu,
//                        contentDescription = "Menu",
//                        tint = Color(0xFF000044),
//                        modifier = Modifier.size(30.dp)
//                    )
//
//                    Spacer(modifier = Modifier.weight(1f))
//
//                    Icon(
//                        imageVector = Icons.Default.Notifications,
//                        contentDescription = "Notification",
//                        tint = Color(0xFF000044),
//                        modifier = Modifier.size(28.dp)
//                    )
//                }
//
//                // This will keep the heading in the middle
//                Text(
//                    text = "MonashHub",
//                    style = TextStyle(
//                        fontSize = 22.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color(0xFF000044)
//                    ),
//                    modifier = Modifier.align(Alignment.Center)
//                )
//            }
//        }
//
//        Row(modifier = Modifier
//            .fillMaxWidth()
//            .padding(20.dp),
//            verticalAlignment = Alignment.CenterVertically)
//        {
//            Text(
//                text = "Chat",
//                style = TextStyle(
//                    fontSize = 22.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = Color(0xFF000044)
//                )
//            )
//
//            Spacer(modifier = Modifier.weight(1f))
//
//            Image(
//                painter = painterResource(R.drawable.filter_icon), // e.g., painterResource(R.drawable.your_image)
//                contentDescription = null,
//                modifier = Modifier
//                    .size(25.dp)
//            )
//
//            Spacer(modifier = Modifier.width(10.dp))
//
//            Image(
//                painter = painterResource(R.drawable.asc_desc_icon), // e.g., painterResource(R.drawable.your_image)
//                contentDescription = null,
//                modifier = Modifier
//                    .size(30.dp)
//            )
//        }
//
//        HorizontalDivider(
//            thickness = 2.dp,
//            color = Color(0xFF000044),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 20.dp)
//        )
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 20.dp)
//                .background(Color.White, shape = CutCornerShape(1.dp)) // apply shape here
//        )
//        {
//            ->
//            OutlinedTextField(
//                value = name,
//                onValueChange = { name = it },
//                label = { Text("Search") },
//                modifier = Modifier
//                    .fillMaxWidth(),
//                trailingIcon = {
//                    Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
//                },
//                shape = CutCornerShape(1.dp),
//            )
//        }
//
//        Card(
//            shape = CutCornerShape(1.dp),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(20.dp),
//            elevation = CardDefaults.cardElevation(4.dp)
//        ){
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .background(Color.White)
//                    .padding(10.dp)
//            ){
//                Row()
//                {
//                    Image(
//                        painter = painterResource(R.drawable.photo_one), // e.g., painterResource(R.drawable.your_image)
//                        contentDescription = null,
//                        modifier = Modifier
//                            .size(50.dp) // Set the desired size
//                            .clip(CircleShape)
//                    )
//
//                    Text(
//                        text = "Hank_Jacobs098",
//                        modifier = Modifier
//                            .padding(horizontal = 10.dp)
//                            .align(Alignment.CenterVertically),
//                        color = Color(0xFF000044),
//                        style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
//                    )
//
//                    Spacer(modifier = Modifier.weight(1f))
//
//                    Icon(
//                        imageVector = Icons.Default.Send,
//                        contentDescription = "Send Request",
//                        tint = Color(0xFF000044),
//                        modifier = Modifier
//                            .size(28.dp)
//                            .align(Alignment.CenterVertically)
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun PeerChat()
//{
//    var name by remember { mutableStateOf("") }
//
//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(Color(0xFFF3F4F9))
//    ){
//        Surface(
//            modifier = Modifier
//                .fillMaxWidth()
//                .wrapContentHeight(),
//            tonalElevation = 1024.dp,
//            shadowElevation = 16.dp,
//            color = Color.White
//        )
//        {
//            Box(modifier = Modifier.fillMaxWidth())
//            {
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(16.dp),
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Menu,
//                        contentDescription = "Menu",
//                        tint = Color(0xFF000044),
//                        modifier = Modifier.size(30.dp)
//                    )
//
//                    Spacer(modifier = Modifier.weight(1f))
//
//                    Icon(
//                        imageVector = Icons.Default.Notifications,
//                        contentDescription = "Notification",
//                        tint = Color(0xFF000044),
//                        modifier = Modifier.size(28.dp)
//                    )
//                }
//
//                // This will keep the heading in the middle
//                Text(
//                    text = "MonashHub",
//                    style = TextStyle(
//                        fontSize = 22.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color(0xFF000044)
//                    ),
//                    modifier = Modifier.align(Alignment.Center)
//                )
//            }
//        }
//
//        Row(modifier = Modifier
//            .fillMaxWidth()
//            .padding(20.dp),
//            verticalAlignment = Alignment.CenterVertically)
//        {
//            Icon(
//                imageVector = Icons.Default.ArrowBack,
//                contentDescription = "Notification",
//                tint = Color(0xFF000044),
//                modifier = Modifier.size(35.dp)
//            )
//
//            Spacer(modifier = Modifier.width(10.dp))
//
//            Image(
//                painter = painterResource(R.drawable.photo_two), // e.g., painterResource(R.drawable.your_image)
//                contentDescription = null,
//                modifier = Modifier
//                    .size(40.dp)
//                    .clip(CircleShape)
//            )
//
//            Spacer(modifier = Modifier.width(10.dp))
//
//            Text(
//                text = "Mary_Randall765",
//                style = TextStyle(
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = Color(0xFF000044)
//                )
//            )
//        }
//
//        HorizontalDivider(
//            thickness = 2.dp,
//            color = Color(0xFF000044),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 20.dp)
//        )
//
//        Card(
//            shape = CutCornerShape(1.dp),
//            modifier = Modifier
//                .width(100.dp)
//                .padding(10.dp)
//                .align(Alignment.CenterHorizontally),
//            elevation = CardDefaults.cardElevation(4.dp)
//        ){
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .background(Color.White)
//                    .padding(10.dp)
//            ){
//                Text(
//                    text = "12/04/25",
//                    style = TextStyle(
//                        fontSize = 12.sp,
//                        color = Color(0xFF000044)
//                    )
//                )
//            }
//        }
//
//        Card(
//            shape = CutCornerShape(1.dp),
//            modifier = Modifier
//                .width(250.dp)
//                .padding(vertical = 10.dp, horizontal = 20.dp)
//                .align(Alignment.End),
//            elevation = CardDefaults.cardElevation(4.dp)
//        ){
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .background(Color.White)
//                    .padding(5.dp)
//            ){
//                Text(
//                    text = "Hello Mary, \nHow are you?",
//                    style = TextStyle(
//                        fontSize = 12.sp,
//                        color = Color(0xFF000044)
//                    )
//                )
//
//                Text(
//                    text = "5.45 PM",
//                    style = TextStyle(
//                        fontSize = 10.sp,
//                        color = Color(0xFF000044)
//                    ),
//                    modifier = Modifier
//                        .align(Alignment.End)
//                        .padding(vertical = 5.dp)
//                )
//            }
//        }
//
//        Card(
//            shape = CutCornerShape(1.dp),
//            modifier = Modifier
//                .width(250.dp)
//                .padding(vertical = 10.dp, horizontal = 20.dp)
//                .align(Alignment.Start),
//            elevation = CardDefaults.cardElevation(4.dp)
//        ){
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .background(Color.White)
//                    .padding(5.dp)
//            ){
//                Text(
//                    text = "Hello Hank, \nWhatsup? \nI am fine. Thank you for asking..",
//                    style = TextStyle(
//                        fontSize = 12.sp,
//                        color = Color(0xFF000044)
//                    )
//                )
//
//                Text(
//                    text = "6.00 PM",
//                    style = TextStyle(
//                        fontSize = 10.sp,
//                        color = Color(0xFF000044)
//                    ),
//                    modifier = Modifier
//                        .align(Alignment.End)
//                        .padding(vertical = 5.dp)
//                )
//            }
//        }
//
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(bottom = 40.dp)
//        )
//        {
//            OutlinedTextField(
//                value = name,
//                onValueChange = { name = it },
//                label = { Text("Type your message here") },
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .align(Alignment.BottomCenter)
//                    .padding(horizontal = 20.dp, vertical = 20.dp)
//                    .background(Color.White),
//                trailingIcon = {
//                    Icon(imageVector = Icons.Default.Send,
//                        contentDescription = "Send Icon",
//                        modifier = Modifier.padding(10.dp))
//                },
//                shape = CutCornerShape(1.dp)
//            )
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ChatTheme {
//        PeerChat()
//    }
//}