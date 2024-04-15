package deve.arun.movie.movieReview.javaFiles;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="reviews")
@Data   // this is for default getters and setters
@AllArgsConstructor
@NoArgsConstructor
public class Reviews 
{
	@Id
	private ObjectId id;
	private String body;
	
	public Reviews(String body) 
	{
		this.body = body;
	}
	
//	public ObjectId getId()
//	{
//		return id;
//	}
	

}