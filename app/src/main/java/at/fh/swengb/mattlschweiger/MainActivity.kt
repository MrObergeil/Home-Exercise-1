package at.fh.swengb.mattlschweiger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val movieAdapter = MovieAdapter() {
        val implicitIntent = Intent(this, MovieDetails::class.java)
        implicitIntent.putExtra(MOVIE_ID, it.id)
        startActivity(implicitIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieAdapter.updateList(MovieRepository.movies)
        movie_recycler_view.layoutManager = LinearLayoutManager(this)
        movie_recycler_view.adapter = movieAdapter
    }

    override fun onResume() {
        super.onResume()

        movieAdapter.updateList(MovieRepository.movies)
    }

    companion object {
        val MOVIE_ID = "MOVIE_ID_EXTRA"
    }
}
