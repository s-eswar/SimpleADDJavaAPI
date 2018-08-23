package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/add")
public class SampleApi {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML(@QueryParam("x") int x,@QueryParam("y") int y) throws IllegalArgumentException {
		
		if(x==(int)x && y==(int)y) {
		int resource = (x+y);
		return "<html>" + "<body><h1>"	+ 
				Integer.toString(resource) + "</h1><body>" + "</html>";
		}
		else {
			throw new IllegalArgumentException();
		}
	}
}
