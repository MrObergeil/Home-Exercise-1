package at.fh.swengb.mattlschweiger

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieAdapter(val clickListener: (movie: Movie) -> Unit): RecyclerView.Adapter<MovieViewHolder>() {

    private var movieList = listOf<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from((parent.context))
        val movieItemView = inflater.inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(movieItemView, clickListener)
    }

    override fun getItemCount(): Int = movieList.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindItem(movieList[position])
    }

    fun updateList(newlist: List<Movie>) {
        movieList = newlist
        notifyDataSetChanged()
    }
}

class MovieViewHolder(itemView: View, val clickListener: (movie: Movie) -> Unit): RecyclerView.ViewHolder(itemView) {

    fun bindItem(movie: Movie) {
        var average = 0.0

        if (movie.reviews.isNotEmpty()) {
            average = movie.ratingAverage()
        }
        itemView.item_actors.text = movie.actors.map{it.name}.joinToString(", ")
        itemView.item_director.text = movie.director.name
        itemView.item_num_ratings.text = movie.reviews.size.toString()
        itemView.item_rating_bar.rating = average.toFloat()
        itemView.item_release.text = movie.release
        itemView.item_title.text = movie.title
        itemView.setOnClickListener() {
            clickListener(movie)
        }
    }
}