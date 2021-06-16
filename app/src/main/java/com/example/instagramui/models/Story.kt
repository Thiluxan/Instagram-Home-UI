package com.example.instagramui.models

class Story (name:String?,image:String?){
    private var name:String
    private var image:String

    init {
        this.image = image!!
        this.name = name!!
    }

    fun setName(name: String?){
        this.name = name!!
    }

    fun getName():String{
        return this.name
    }

    fun setImage(image: String?){
        this.image = image!!
    }

    fun getImage():String{
        return this.image
    }
}