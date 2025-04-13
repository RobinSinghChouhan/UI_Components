//package com.example.dashboard
//
//import android.media.Image
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.BorderStroke
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
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Menu
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.dashboard.ui.theme.DashboardTheme
//import com.google.android.material.appbar.MaterialToolbar
//import com.google.android.material.navigation.NavigationView
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.wrapContentHeight
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.CutCornerShape
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material.icons.filled.AccountCircle
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.Edit
//import androidx.compose.material.icons.filled.Face
//import androidx.compose.material.icons.filled.FavoriteBorder
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Info
//import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material.icons.filled.ShoppingCart
//import androidx.compose.material.icons.filled.Star
//import androidx.compose.material.icons.filled.ThumbUp
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.DrawerValue
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.HorizontalDivider
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.ModalNavigationDrawer
//import androidx.compose.material3.TopAppBar
//import androidx.compose.material3.rememberDrawerState
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.draw.shadow
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import kotlinx.coroutines.launch
//
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            DashboardTheme {
//                NavigationDrawer()
//            }
//        }
//    }
//}
//
//@Composable
//fun Dashboard(onMenuClick: () -> Unit) {
//    // Remember scroll state
//    val scrollState = rememberScrollState()
//
//    // Full screen scrollable column
//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(Color(0xFFF3F4F9))
//        ) {
//
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
//                    IconButton(onClick = { onMenuClick() }) {
//                        Icon(
//                            imageVector = Icons.Default.Menu,
//                            contentDescription = "Menu",
//                            tint = Color(0xFF000044),
//                            modifier = Modifier.size(30.dp)
//                        )
//                    }
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
//                text = "Feed",
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
//                    .size(28.dp)
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
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .verticalScroll(scrollState)
//                .padding(8.dp)
//        )
//        {
//            Spacer(modifier = Modifier.height(10.dp))
//
//            val posts = listOf(
//                Post(
//                    "Hank_Jacobs098",
//                    painterResource(R.drawable.photo_one),
//                    painterResource(R.drawable.mobile_photo_one),
//                    "Hi All, Just a photo of things which we can do in mobile...!",
//                    "FIT5046_Club",
//                    5
//                ),
//                Post(
//                    "Mary_Randall765",
//                    painterResource(R.drawable.photo_two),
//                    painterResource(R.drawable.landscape_drawing),
//                    "Hi All, Just wanted to share a painting which I did on weekend...!",
//                    "Painting_Club",
//                    3
//                )
//            )
//
//            posts.forEach { post ->
//                Card(
//                    shape = CutCornerShape(1.dp),
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(10.dp),
//                    elevation = CardDefaults.cardElevation(4.dp)
//                )
//                {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .background(Color.White)
//                            .padding(10.dp)
//                    )
//                    {
//                        Row(modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(4.dp),
//                            verticalAlignment = Alignment.CenterVertically)
//                        {
//                            Image(
//                                painter = post.profileImage, // e.g., painterResource(R.drawable.your_image)
//                                contentDescription = null,
//                                modifier = Modifier
//                                    .size(50.dp) // Set the desired size
//                                    .clip(CircleShape)
//                            )
//
//                            Column(modifier = Modifier
//                                .background(Color.White))
//                            {
//                                Text(
//                                    text = "${post.userId} \t||\t ${post.groupName}",
//                                    modifier = Modifier.padding(horizontal = 5.dp, vertical = 2.dp),
//                                    color = Color(0xFF000044),
//                                    style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Bold)
//                                )
//
//                                Text(
//                                    text = "${post.time} hr",
//                                    modifier = Modifier.padding(horizontal = 5.dp, vertical = 2.dp),
//                                    color = Color(0xFF000044),
//                                    style = TextStyle(fontSize = 12.sp)
//                                )
//                            }
//
//                            // Pushes the icon to the end
//                            Spacer(modifier = Modifier.weight(1f))
//
//                            Image(
//                                painter = painterResource(R.drawable.bookmark_icon), // e.g., painterResource(R.drawable.your_image)
//                                contentDescription = null,
//                                modifier = Modifier
//                                    .size(35.dp) // Set the desired size
//                                    .clip(CircleShape)
//                            )
//                        }
//
//                        Text(
//                            text = post.contentDescription,
//                            modifier = Modifier.padding(10.dp),
//                            color = Color(0xFF000044),
//                            style = TextStyle(fontSize = 12.sp)
//                        )
//
//                        Image(
//                            painter = post.Image,
//                            contentDescription = null,
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .height(250.dp)
//                                .padding(horizontal = 10.dp)
//                        )
//
//                        Row(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(horizontal = 4.dp)
//                        ) {
//                            IconButton(onClick = { post.likes += 1 }) {
//                                Icon(
//                                    imageVector = Icons.Default.ThumbUp,
//                                    contentDescription = "Like",
//                                    tint = Color(0xFF000044),
//                                    modifier = Modifier.size(28.dp)
//                                )
//                            }
//
//                            Text(
//                                text = " Liked by " + post.likes,
//                                modifier = Modifier.align(Alignment.CenterVertically),
//                                color = Color(0xFF000044),
//                                style = TextStyle(fontSize = 12.sp)
//                            )
//                        }
//                    }
//                }
//
//                Spacer(modifier = Modifier.height(10.dp))
//            }
//        }
//    }
//}
//
//@Composable
//fun NavigationDrawer()
//{
//    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
//    val scope = rememberCoroutineScope()
//
//    ModalNavigationDrawer(
//        drawerState = drawerState,
//        drawerContent = {
//            Surface( // this makes the drawer content opaque
//                modifier = Modifier
//                    .width(320.dp)
//                    .fillMaxHeight(),
//                color = Color.White, // or MaterialTheme.colorScheme.surface
//                tonalElevation = 8.dp
//            )
//            {
//                DrawerContent(onItemClick = {
//                    scope.launch { drawerState.close() }
//                })
//            }
//        }
//    ) {
//        MainScreen(onMenuClick = {
//            scope.launch { drawerState.open() }
//        })
//    }
//}
//
//@Composable
//fun DrawerContent(onItemClick: () -> Unit)
//{
//    Column(modifier = Modifier
//        .padding(20.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Default.ArrowBack,
//            contentDescription = "Return Icon",
//            tint = Color(0xFF000044),
//            modifier = Modifier.size(30.dp)
//        )
//
//        Spacer(modifier = Modifier.width(10.dp))
//
//        Box(modifier = Modifier.fillMaxWidth())
//        {
//            Row(modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 4.dp),
//                verticalAlignment = Alignment.CenterVertically)
//            {
//                Image(
//                    painter = painterResource(R.drawable.photo_two), // e.g., painterResource(R.drawable.your_image)
//                    contentDescription = null,
//                    modifier = Modifier
//                        .size(50.dp)
//                        .clip(CircleShape)
//                )
//
//                Spacer(modifier = Modifier.width(8.dp))
//
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .background(Color.White)
//                        .padding(10.dp)
//                ) {
//                    Text(
//                        text = "Mary_Randall765",
//                        color = Color(0xFF000044),
//                        style = TextStyle(fontSize = 20.sp)
//                    )
//
//                    Spacer(modifier = Modifier.height(5.dp))
//
//                    Text(
//                        text = "Masters of IT",
//                        color = Color(0xFF000044),
//                        style = TextStyle(fontSize = 12.sp)
//                    )
//                }
//            }
//        }
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        HorizontalDivider(
//            thickness = 2.dp,
//            color = Color(0xFF000044),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 8.dp)
//        )
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(4.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ){
//            Icon(
//                imageVector = Icons.Default.Home,
//                contentDescription = "Home Icon",
//                tint = Color(0xFF000044),
//                modifier = Modifier.size(30.dp)
//            )
//
//            Spacer(modifier = Modifier.width(5.dp))
//
//            Text("Home", modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(5.dp))
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(4.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ){
//            Image(
//                painter = painterResource(R.drawable.create_post_icon), // e.g., painterResource(R.drawable.your_image)
//                contentDescription = null,
//                modifier = Modifier
//                    .size(30.dp)
//            )
//
//            Spacer(modifier = Modifier.width(5.dp))
//
//            Text("Create a Post", modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(6.dp))
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(4.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ){
//            Image(
//                painter = painterResource(R.drawable.chat_icon), // e.g., painterResource(R.drawable.your_image)
//                contentDescription = null,
//                modifier = Modifier
//                    .size(30.dp)
//            )
//
//            Spacer(modifier = Modifier.width(5.dp))
//
//            Text("Chat", modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(6.dp))
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(4.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ){
//            Image(
//                painter = painterResource(R.drawable.communities_icon), // e.g., painterResource(R.drawable.your_image)
//                contentDescription = null,
//                modifier = Modifier
//                    .size(30.dp)
//            )
//
//            Spacer(modifier = Modifier.width(5.dp))
//
//            Text("Communities", modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(6.dp))
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(4.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ){
//            Icon(
//                imageVector = Icons.Default.Person,
//                contentDescription = "Person Icon",
//                tint = Color(0xFF000044),
//                modifier = Modifier.size(30.dp)
//            )
//
//            Spacer(modifier = Modifier.width(5.dp))
//
//            Text("Peers and Alumni", modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(5.dp))
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(4.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ){
//            Icon(
//                imageVector = Icons.Default.ShoppingCart,
//                contentDescription = "M-Kart Icon",
//                tint = Color(0xFF000044),
//                modifier = Modifier.size(30.dp)
//            )
//
//            Spacer(modifier = Modifier.width(5.dp))
//
//            Text("M-Kart", modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(5.dp))
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(4.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ){
//            Icon(
//                imageVector = Icons.Default.AccountCircle,
//                contentDescription = "Profile Icon",
//                tint = Color(0xFF000044),
//                modifier = Modifier.size(30.dp)
//            )
//
//            Spacer(modifier = Modifier.width(5.dp))
//
//            Text("Profile", modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(5.dp))
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(4.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ){
//            Icon(
//                imageVector = Icons.Default.Settings,
//                contentDescription = "Settings Icon",
//                tint = Color(0xFF000044),
//                modifier = Modifier.size(30.dp)
//            )
//
//            Spacer(modifier = Modifier.width(5.dp))
//
//            Text("Settings", modifier = Modifier
//                .fillMaxWidth()
//                .clickable { onItemClick() }
//                .padding(5.dp))
//        }
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MainScreen(onMenuClick: () -> Unit) {
//    Scaffold(
//    ) { padding ->
//        Box(modifier = Modifier.padding(padding)) {
//            Dashboard(onMenuClick)
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    DashboardTheme {
//        NavigationDrawer()
//    }
//}