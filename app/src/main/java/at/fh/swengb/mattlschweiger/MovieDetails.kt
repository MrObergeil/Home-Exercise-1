package at.fh.swengb.mattlschweiger

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_movie_details.*

class MovieDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)


        val movieID = intent.getStringExtra(MainActivity.MOVIE_ID)
        var movie: Movie?

        if (movieID != null) {
            movie = MovieRepository.findMovieById(movieID)
            movie_title.text = movie!!.title
            movie_director.text = movie.director.name
            movie_actors.text = movie.actors.map{it.name}.joinToString(", ")
            movie_genre.text = movie.genre.decription
            movie_plot.text = movie.plot
            movie_release.text = movie.release
            val average: Float
            if (movie.reviews.isEmpty()) {average = 0F}
            else {average = movie.ratingAverage().toFloat()}
            movie_rating_bar.rating = average
            movie_rating_num.text = average.toString() + "    " + movie.reviews.size.toString()
            movie_rate_button.setOnClickListener {
                val intent = Intent(this, MovieRatingActivity::class.java)
                intent.putExtra(MOVIE_ID,movieID)
                startActivityForResult(intent, MOVIE_RATED)
            }
        }
        else {
            Log.v("finished","Movie couldn't be found by ID")
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == MOVIE_RATED && resultCode == Activity.RESULT_OK) {
            Log.v("Rating","Rating was added")
            Toast.makeText(this, "Rating was added", Toast.LENGTH_LONG).show()
            finish()
        }
        else {
            Log.v("Rating","Rating activity closed by user")
            Toast.makeText(this, "No new rating added", Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    companion object {
        val MOVIE_ID = "MOVIE_ID"
        val MOVIE_RATED = 1
    }
}
