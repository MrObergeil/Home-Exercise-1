package at.fh.swengb.mattlschweiger

import android.util.Log
import java.io.File
import java.lang.Exception

class Movie(val id: String,
            val title: String,
            val release: String,
            val plot: String,
            val genre: MovieGenre,
            val director: Person,
            val actors: List<Person>) {

    val reviews: MutableList<Review> = mutableListOf()

    fun ratingAverage(): Double = reviews.map{x -> x.reviewValue}.average()
}