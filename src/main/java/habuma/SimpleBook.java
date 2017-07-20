package habuma;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="simple", types=Book.class)
public interface SimpleBook {

	String getIsbn();
	String getTitle();
	
}
