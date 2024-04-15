package deve.arun.movie.movieReview.javaFiles;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/a1/reviews")
//@CrossOrigin(origins = "*")
public class ReviewController 
{
	@Autowired
	private ReviewService reviewService;
	
	@PostMapping
	public ResponseEntity<Reviews> createReview(@RequestBody Map<String, String> payload)
	{
		return new ResponseEntity<Reviews>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")),HttpStatus.CREATED);
	}

}
