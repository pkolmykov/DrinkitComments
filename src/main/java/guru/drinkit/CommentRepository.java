package guru.drinkit;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author pkolmykov
 */
@RepositoryRestResource
public interface CommentRepository extends MongoRepository<Comment, String>{
}
