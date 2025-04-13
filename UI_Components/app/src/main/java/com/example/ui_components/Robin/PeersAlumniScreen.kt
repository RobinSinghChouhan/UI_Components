package com.example.ui_components.Robin

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
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
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
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
import com.example.dashboard.Post
import com.example.ui_components.R
import com.example.ui_components.ui.theme.primaryBg
import com.example.ui_components.ui.theme.primaryText

@Preview(showBackground = false)
@Composable
fun PeersAlumniScreenPreview()
{
    PeersAndAlumniScreen()
}

@Composable
fun PeersAndAlumniScreen() {
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
                    Box(modifier = Modifier.fillMaxWidth().padding(top = 25.dp))
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
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 0.dp, horizontal = 0.dp),
                        verticalAlignment = Alignment.CenterVertically
                    )
                    {
                        Text(
                            text = "Peers & Alumni",
                            style = TextStyle(
                                fontSize = 22.sp,
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

                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 16.dp),
                        thickness = 2.dp,
                        color = primaryText
                    )


                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp)
                            .background(Color.White, shape = CutCornerShape(1.dp)) // apply shape here
                    )
                    {
                        ->
                        OutlinedTextField(
                            value = name,
                            onValueChange = { name = it },
                            placeholder = { Text("Search") },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White, shape = CutCornerShape(1.dp)), // Set background here
                            trailingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Search,
                                    contentDescription = "Search Icon"
                                )
                            },
                            shape = CutCornerShape(1.dp),
                            )
                    }

                    val peers= listOf(
                        Peer(
                            "Casandra Adams",
                            painterResource(R.drawable.default_user),
                            "Master of IT",
                            "Clayton",
                            true
                        ),
                        Peer(
                            "Casandra Adams",
                            painterResource(R.drawable.default_user),
                            "Master of IT",
                            "Calyton",
                            false
                        ),
                        Peer(
                            "Casandra Adams",
                            painterResource(R.drawable.default_user),
                            "Master of IT",
                            "Calyton",
                            false
                        ),
                        Peer(
                            "Casandra Adams",
                            painterResource(R.drawable.default_user),
                            "Master of IT",
                            "Calyton",
                            false
                        ),
                        Peer(
                            "Casandra Adams",
                            painterResource(R.drawable.default_user),
                            "Master of IT",
                            "Calyton",
                            false
                        )
                    )

                    peers.forEach { peer ->
                        Card(
                            shape = CutCornerShape(1.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 15.dp),
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
                                        painter = peer.profileImage, // e.g., painterResource(R.drawable.your_image)
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
                                            text = peer.userId,
                                            modifier = Modifier.padding(
                                                horizontal = 5.dp,
                                                vertical = 2.dp
                                            ),
                                            color = Color(0xFF000044),
                                            style = TextStyle(
                                                fontSize = 12.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        )

                                        Text(
                                            text = "${peer.department}\n${peer.location}",
                                            modifier = Modifier.padding(
                                                horizontal = 5.dp,
                                                vertical = 2.dp
                                            ),
                                            color = Color(0xFF000044),
                                            style = TextStyle(fontSize = 12.sp)
                                        )
                                    }

                                    // Pushes the icon to the end
                                    Spacer(modifier = Modifier.weight(1f))



//                                Surface(
//                                    shape = RoundedCornerShape(20.dp),
//                                    border = if(!peer.follow) BorderStroke(1.dp, primaryText) else BorderStroke(2.dp, primaryText),
////                                        elevation = 2.dp,
//                                    color = if(!peer.follow) primaryText else Color.White,
//                                    modifier = Modifier.width(100.dp),
//                                ) {
                                    if (!peer.follow)
                                    {
                                        Button(
                                            modifier = Modifier.width(110.dp),
                                            colors = ButtonDefaults.buttonColors(contentColor = primaryText, containerColor = primaryBg),
                                            border = BorderStroke(2.dp, primaryText),
                                            onClick = {}
                                        ) {
                                            Text("Follow", color = primaryText)
                                        }
                                    }
                                    else
                                    {

                                        Button(
                                            modifier = Modifier.width(110.dp),
                                            colors = ButtonDefaults.buttonColors(contentColor = primaryText),
                                            onClick = {}
                                        ) {
                                            Text("Unfollow", color = primaryBg)
                                        }
//                                        Box(
//                                            modifier = Modifier
//                                                .fillMaxWidth()
//                                                .padding(vertical = 5.dp),
//                                            contentAlignment = Alignment.Center
//                                        ) {
//                                            Text("Unfollow", fontSize = 12.sp, fontWeight = FontWeight.Bold)
//                                        }

                                    }

                                }
//                                }
                            }
                        }
                    }

                }


            }

        }
}
