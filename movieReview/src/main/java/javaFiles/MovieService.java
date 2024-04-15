package deve.arun.movie.movieReview.javaFiles;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import deve.arun.movie.movieReview.javaFiles.MovieRepository;

@Service
public class MovieService 
{
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movies> findallMovies()
	{
		return movieRepository.findAll();
	}
	
	public Optional<Movies> findMovieByImdbId(String imdbId)
	{
		return movieRepository.findMovieByImdbId(imdbId);
	}

}
