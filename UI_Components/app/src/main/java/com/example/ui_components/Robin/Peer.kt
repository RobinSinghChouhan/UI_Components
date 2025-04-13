package com.example.ui_components.Robin

import androidx.compose.ui.graphics.painter.Painter

public class Peer (userId: String, profileImage: Painter, department: String, location: String, follow: Boolean) {
    val userId = userId
    val profileImage = profileImage
    val department = department
    val location = location
    var follow = follow
}
