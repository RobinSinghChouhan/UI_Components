package com.example.dashboard

import androidx.compose.ui.graphics.painter.Painter

public class Post (userId: String, profileImage: Painter, Image: Painter, contentDescription: String, groupName: String, time: Int) {
    val userId = userId;
    val profileImage = profileImage
    val Image = Image
    val contentDescription = contentDescription
    val groupName = groupName
    val time = time
    var likes = 0
    var save = mutableListOf<String>()
}
