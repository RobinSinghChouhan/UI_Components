package com.example.ui_components.Robin

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_components.R
import com.example.ui_components.ui.theme.primaryBg
import com.example.ui_components.ui.theme.primaryText

@Preview(showBackground = false)
@Composable
fun PeerProfilePreviewScreen()
{
    PeerProfileScreen()
}

@Composable
fun PeerProfileScreen() {

    var name by remember { mutableStateOf("") }


    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = primaryBg
    ) {
        Column() {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                tonalElevation = 1024.dp,
                shadowElevation = 16.dp,
                color = Color.White
            )
            {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp))
                {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Menu",
                                tint = primaryText,
                                modifier = Modifier.size(30.dp)
                            )
                        }

                        Spacer(modifier = Modifier.weight(1f))

                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "Notification",
                            tint = primaryText,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                    Text(
                        text = "MonashHub",
                        style = TextStyle(
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            color = primaryText
                        ),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }

            Spacer(modifier = Modifier.height(36.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Notification",
                        tint = Color(0xFF000044),
                        modifier = Modifier.size(35.dp)
                    )

                    Text(
                        text = "Cassandra Adams",
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF000044)
                        )
                    )

                    Spacer(modifier = Modifier.weight(1f))
                    Button(
                        colors = ButtonDefaults.buttonColors(contentColor = primaryText),
                        onClick = {}
                    ) {
                        Text("Unfollow", color = primaryBg)
                    }
                }

                HorizontalDivider(
                    thickness = 2.dp,
                    color = Color(0xFF000044),
                    modifier = Modifier
                        .fillMaxWidth(),
                )

                Row()
                {
                    Spacer(Modifier.weight(1f))


                    Button(
                        modifier = Modifier.padding(top = 10.dp),
                        colors = ButtonDefaults.buttonColors(contentColor = primaryText, containerColor = primaryBg),
                        border = BorderStroke(2.dp, primaryText),
                        onClick = {}
                    ) {
                        Text("Chat", color = primaryText)
                    }
                }

                Text(
                    text = "Profile Summary",
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000044)
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Card(
                    shape = CutCornerShape(1.dp),
                    modifier = Modifier
                        .fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(4.dp)
                )
                {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                            .padding(10.dp)
                    )
                    {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        )
                        {
                            Image(
                                painter = painterResource(R.drawable.default_user), // e.g., painterResource(R.drawable.your_image)
                                contentDescription = null,
                                modifier = Modifier
                                    .size(50.dp) // Set the desired size
                                    .clip(CircleShape)
                            )

                            Column(
                                modifier = Modifier
                                    .background(Color.White)
                            )
                            {
                                Text(
                                    text = "Master of IT",
                                    modifier = Modifier.padding(
                                        horizontal = 5.dp,
                                    ),
                                    color = Color(0xFF000044),
                                    style = TextStyle(
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                )

                                Text(
                                    text = "Clayton Campus",
                                    modifier = Modifier.padding(
                                        horizontal = 5.dp,

                                        ),
                                    color = Color(0xFF000044),
                                    style = TextStyle(fontSize = 12.sp)
                                )

                                Text(
                                    text = "Batch: 2024",
                                    modifier = Modifier.padding(
                                        horizontal = 5.dp,

                                        ),
                                    color = Color(0xFF000044),
                                    style = TextStyle(fontSize = 12.sp)
                                )
                            }

                            // Pushes the icon to the end
                            Spacer(modifier = Modifier.weight(1f))

                        }
                        Text(
                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                            modifier = Modifier.padding(top = 10.dp))
                    }
                }

                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    Text(
                        text = "Recent Posts",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = primaryText
                        )
                    )

                    Spacer(modifier = Modifier.weight(1f))

                    Image(
                        painter = painterResource(R.drawable.baseline_filter_alt_24), // e.g., painterResource(R.drawable.your_image)
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Image(
                        painter = painterResource(R.drawable.asc_desc_icon), // e.g., painterResource(R.drawable.your_image)
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                    )
                }


                Spacer(modifier = Modifier.height(15.dp))

                Card(
                    shape = CutCornerShape(1.dp),
                    modifier = Modifier
                        .fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(4.dp)
                )
                {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                            .padding(10.dp)
                    )
                    {
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp),
                            verticalAlignment = Alignment.CenterVertically)
                        {
                            Image(
                                painter = painterResource(R.drawable.default_user), // e.g., painterResource(R.drawable.your_image)
                                contentDescription = null,
                                modifier = Modifier
                                    .size(50.dp) // Set the desired size
                                    .clip(CircleShape)
                            )

                            Column(modifier = Modifier
                                .background(Color.White))
                            {
                                Text(
                                    text = "Casandra Adams",
                                    modifier = Modifier.padding(horizontal = 5.dp, vertical = 2.dp),
                                    color = Color(0xFF000044),
                                    style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                )

                                Text(
                                    text = "2 hr",
                                    modifier = Modifier.padding(horizontal = 5.dp, vertical = 2.dp),
                                    color = Color(0xFF000044),
                                    style = TextStyle(fontSize = 12.sp)
                                )
                            }

                            // Pushes the icon to the end
                            Spacer(modifier = Modifier.weight(1f))

                            Image(
                                painter = painterResource(R.drawable.bookmark_icon), // e.g., painterResource(R.drawable.your_image)
                                contentDescription = null,
                                modifier = Modifier
                                    .size(35.dp) // Set the desired size
                                    .clip(CircleShape)
                            )
                        }

                        Text(
                            text = "post.contentDescription",
                            modifier = Modifier.padding(10.dp),
                            color = Color(0xFF000044),
                            style = TextStyle(fontSize = 12.sp)
                        )

                        Image(
                            painter = painterResource(R.drawable.landscape_drawing),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(250.dp)
                                .padding(horizontal = 10.dp)
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 4.dp)
                        ) {
                            IconButton(onClick = {  }) {
                                Icon(
                                    imageVector = Icons.Default.ThumbUp,
                                    contentDescription = "Like",
                                    tint = Color(0xFF000044),
                                    modifier = Modifier.size(28.dp)
                                )
                            }

                            Text(
                                text = " Liked by " + 2,
                                modifier = Modifier.align(Alignment.CenterVertically),
                                color = Color(0xFF000044),
                                style = TextStyle(fontSize = 12.sp)
                            )
                        }
                    }
                }
            }
        }

    }
}