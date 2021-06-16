package com.example.instagramui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramui.adapters.PostAdapter
import com.example.instagramui.adapters.StoryAdapter
import com.example.instagramui.models.Post
import com.example.instagramui.models.Story

class MainActivity : AppCompatActivity() {

    private val storyList = ArrayList<Story>()
    private lateinit var storiesAdapter: StoryAdapter

    private val postList = ArrayList<Post>()
    private lateinit var postsAdapter: PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val storiesView = findViewById<RecyclerView>(R.id.storieslist)
        storiesAdapter = StoryAdapter(storyList)
        val storiesLayoutManager = LinearLayoutManager(applicationContext)
        storiesLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        storiesView.layoutManager = storiesLayoutManager
        storiesView.itemAnimator = DefaultItemAnimator()
        storiesView.adapter = storiesAdapter
        prepareStoryData()

        val postsView = findViewById<RecyclerView>(R.id.postsView)
        postsAdapter = PostAdapter(postList)
        val postLayoutManager = LinearLayoutManager(applicationContext)
        postLayoutManager.orientation = LinearLayoutManager.VERTICAL
        postsView.layoutManager = postLayoutManager
        postsView.itemAnimator = DefaultItemAnimator()
        postsView.adapter = postsAdapter
        preparePostData()

    }
    fun preparePostData(){
        var post1 = Post("https://cdn.britannica.com/25/222725-050-170F622A/Indian-cricketer-Mahendra-Singh-Dhoni-2011.jpg","MS Dhoni","https://www.thestatesman.com/wp-content/uploads/2020/01/MS-Dhoni-3.jpg")
        postList.add(post1)
        var post2 = Post("https://st3.cricketcountry.com/wp-content/uploads/cricket/20140522043438.jpeg","Kumar Sangakkara","https://media.gettyimages.com/photos/kumar-sangakkara-of-sri-lanka-plays-a-shot-during-the-2015-icc-world-picture-id464823904?s=612x612")
        postList.add(post2)
        var post3 = Post("https://st3.cricketcountry.com/wp-content/uploads/cricket/20140522043211.jpeg","Mahela Jayawardene","https://www.cityam.com/wp-content/uploads/2019/05/jayawardene-cricket-getty-1024x640-57eda47dc479b-57eda47de55b4.jpg")
        postList.add(post3)
        var post4 = Post("https://s3.india.com/imageTopics/95ca27b84de3713cc9468be4ca872048.jpg?impolicy=Medium_Widthonly&w=200","Sachin Tendulkar","https://c.ndtvimg.com/2021-04/99d70qq8_sachin-tendulkar-2011-world-cup-win-afp_625x300_24_April_21.jpg")
        postList.add(post4)
        var post5 = Post("https://i0.wp.com/thegreatbiography.com/wp-content/uploads/2019/10/Sourav-Ganguly-Biography.jpg","Sourav Ganguly","https://cricketcult.com/wp-content/uploads/2020/12/0.5838695532438507.jpeg")
        postList.add(post5)
        postsAdapter.notifyDataSetChanged()
    }
    fun prepareStoryData(){
        var story1 = Story("Dhoni","https://cdn.britannica.com/25/222725-050-170F622A/Indian-cricketer-Mahendra-Singh-Dhoni-2011.jpg")
        storyList.add(story1)
        var story2 = Story("Sangakkara","https://st3.cricketcountry.com/wp-content/uploads/cricket/20140522043438.jpeg")
        storyList.add(story2)
        var story3 = Story("Mahela","https://st3.cricketcountry.com/wp-content/uploads/cricket/20140522043211.jpeg")
        storyList.add(story3)
        var story4 = Story("Sachin","https://s3.india.com/imageTopics/95ca27b84de3713cc9468be4ca872048.jpg?impolicy=Medium_Widthonly&w=200")
        storyList.add(story4)
        var story5 = Story("Ganguly","https://i0.wp.com/thegreatbiography.com/wp-content/uploads/2019/10/Sourav-Ganguly-Biography.jpg")
        storyList.add(story5)
        var story6 = Story("Malinga","https://biographywikia.com/wp-content/uploads/2020/11/GettyImages-689265800-e1522074848376.jpg")
        storyList.add(story6)
        storiesAdapter.notifyDataSetChanged()
    }
}