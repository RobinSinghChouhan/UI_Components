package com.example.ui_components.Robin

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.ui_components.R
import com.example.ui_components.ui.theme.inactiveGrey
import com.example.ui_components.ui.theme.primaryBg
import com.example.ui_components.ui.theme.primaryText

@Preview(showBackground = false)
@Composable
fun MKartFormScreenContinuePreview()
{
    MKartFormScreenContinue()
}

@Composable
fun MKartFormScreenContinue() {
    val context = LocalContext.current
    val productDescription = remember { mutableStateOf("") }
    val imageUri = remember { mutableStateOf<Uri?>(null) }
    val labelFocused = remember { derivedStateOf { imageUri.value != null } }
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) {
        imageUri.value = it
    }
    val isActive = remember { mutableStateOf(false) }

    Surface(
        modifier = Modifier.fillMaxSize(),
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
                        tint = primaryText,
                        modifier = Modifier.size(26.dp)
                    )
                    Spacer(
                        modifier = Modifier.width(5.dp)
                    )
                    Text(
                        text = "Add product for rent or sell",
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = primaryText
                        )
                    )
                }

                HorizontalDivider(
                    modifier = Modifier.padding(vertical = 16.dp),
                    thickness = 2.dp,
                    color = primaryText
                )



                Spacer(modifier = Modifier.height(10.dp))

                // Product Description
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = primaryText
                            )
                        ) {
                            append("Product Description: ")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 18.sp,
                                color = Color.Red
                            )
                        ) {
                            append("*")
                        }
                    }
                )
                OutlinedTextField(
                    value = productDescription.value,
                    onValueChange = { productDescription.value = it },
                    placeholder = { Text("Enter Description") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(top = 5.dp),
                    shape = RectangleShape,
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        errorContainerColor = Color.Red,
                        focusedLabelColor = primaryText,
                        unfocusedLabelColor = inactiveGrey,
                        focusedIndicatorColor = primaryText,
                        unfocusedIndicatorColor = inactiveGrey,
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

//                 Upload Image
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = primaryText
                            )
                        ) {
                            append("Upload Product Image: ")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 18.sp,
                                color = Color.Red
                            )
                        ) {
                            append("*")
                        }
                    }
                )

                Spacer(modifier = Modifier.height(6.dp))



                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                        .background(Color.Transparent)
                        .border(1.dp, color = if (isActive.value) primaryText else inactiveGrey)
                        .clickable {
                            isActive.value = true
                            launcher.launch("image/*")
                        }
                        .padding(top = 5.dp),
                    contentAlignment = Alignment.Center
                ) {

                    if (imageUri.value != null) {
                        Image(
                            painter = rememberAsyncImagePainter(imageUri.value),
                            contentDescription = "Selected Image",
                            modifier = Modifier.fillMaxSize()
                        )
                    } else {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                Icons.Default.Add,
                                contentDescription = "Upload",
                                modifier = Modifier.size(40.dp),
                                tint = if (isActive.value) primaryText else inactiveGrey
                            )
                            Text("Upload Image", color = if (isActive.value) primaryText else inactiveGrey)
                        }
                    }
                }





                Spacer(modifier = Modifier.height(20.dp))

                // Create Button
                Button(
                    onClick = { /* Create Post Logic */ },
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .width(150.dp)
                        .padding(top = 16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = primaryText)
                ) {
                    Text(
                        "Create",
                        color = primaryBg,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
