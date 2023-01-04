package service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("ahoy")
public class AhoyService {
    @GET
    public String getAhoy(){
        return "Ahoy Sailor!";
    }
}
