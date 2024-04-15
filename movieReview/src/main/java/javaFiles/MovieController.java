package deve.arun.movie.movieReview.javaFiles;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/a1/movies")
public class MovieController 
{
	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public ResponseEntity<List<Movies>> getMovies()
	{
		return new ResponseEntity<List<Movies>>(movieService.findallMovies(), HttpStatus.OK);
	}
	
	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movies>> getSingleMovie(@PathVariable String imdbId)
	{
		return new ResponseEntity<Optional<Movies>>(movieService.findMovieByImdbId(imdbId), HttpStatus.OK);
	}
	

}
