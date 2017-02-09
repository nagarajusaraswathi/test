package ssss;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import java.sql.*;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getIt() {
        User user=new User();
        user.setFirst_name("ssss");
        Cookie cookie=new Cookie( "cccc","788");
        cookie.getDomain();
        try {
          //  Class.forName("com.mysql.jdbc.Driver");
           // Connection con = DriverManager.getConnection(
                 //   "jdbc:mysql://localhost:3306/chat", "root", "truckway");
        }catch (Exception e){
            e.printStackTrace();
            //return "excepti
        }
        return Response.ok().entity(user).cookie(new NewCookie("cookieResponse", "cookieValueInReturn")).build();
    }

}


