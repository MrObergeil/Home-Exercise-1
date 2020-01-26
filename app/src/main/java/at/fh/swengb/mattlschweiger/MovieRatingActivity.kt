package at.fh.swengb.mattlschweiger

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_rating.*

class MovieRatingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_rating)

        val movieID = intent.getStringExtra(MovieDetails.MOVIE_ID)
        val movie: Movie
        if (movieID != null) {
            movie = MovieRepository.findMovieById(movieID)!!
            rating_title.text = movie.title
            rate_button.setOnClickListener {
                MovieRepository.rateMovie(
                    movie.id, Review(rating_rating_bar.rating.toDouble(), feedback.text.toString())
                )
                setResult(Activity.RESULT_OK)
                finish()
            }
        }
        else {
            setResult((Activity.RESULT_CANCELED))
            finish()
        }
    }
}
