package com.example.amphibians.ui.model

import com.google.gson.annotations.SerializedName

data class Amphibian (
    val name: String = "test Name",
    val type: String = "test Type",
    val description: String = "test Description",
    @SerializedName("img_src")
    val imgSrc: String = "test imgSrc"
)