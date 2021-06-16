package com.example.instagramui.models

class Post(profile: String?,name: String?,content:String?) {
    private var profile: String
    private var name: String
    private var content: String

    init {
        this.profile = profile!!
        this.name = name!!
        this.content = content!!
    }

    fun setProfile(profile: String?){
        this.profile = profile!!
    }

    fun getProfile():String{
        return this.profile;
    }

    fun setName(name: String?){
        this.name = name!!
    }

    fun getName():String{
        return this.name
    }

    fun setContent(content: String?){
        this.content = content!!
    }

    fun getContent():String{
        return this.content
    }

}