package deve.arun.movie.movieReview.javaFiles;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="movies")
@Data   // this is for default getters and setters
@AllArgsConstructor
@NoArgsConstructor
public class Movies 
{
	@Id
	private ObjectId id;
	
	private String imdbId;
	private String title;
	private String releaseDate;
	private String trailerLink;
	private String poster;
	private List<String> genres;
	private List<String> backdrops;
	
	@DocumentReference
	private List<Reviews> reviewIds;
	

}