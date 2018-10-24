package com.musicApp.rest;

import javax.servlet.http.HttpServlet;
import javax.servlet.*;
import org.springframework.web.context.support.SpringBeanAutowiringSupport; 
import org.springframework.stereotype.Controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;
import java.util.Collection;
import java.util.ArrayList;


import com.musicApp.dao.*;
import com.musicApp.model.*;

@Controller
@Path("/albums")
public class AlbumController extends HttpServlet  {

	
	//@Autowired
	private AlbumService albumService = new AlbumService();

	 public void init(ServletConfig config) {
		 try{
			super.init(config);
			SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
			  config.getServletContext());
		  }catch(ServletException e){
		  }
	 }
		  

	
	@GET
	@Path("/hello/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		String output = albumService.getMsg(msg);

		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/demoalbum/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Album getAlbum() {

		Album demoAlbum = new Album(42, "Summer of 69");

        Track track = new Track();
        track.setId(1);
        track.setTitle("Wind of Change");
        track.setAlbumId(42);

        ArrayList<Track> tracksList = new ArrayList<Track>();
        tracksList.add(track);

        demoAlbum.setTracks(tracksList);

		return demoAlbum;
	}

	@GET
	@Produces("text/plain")
	public String getAllAlbums() {
		return albumService.getAllAlbums();
	}

}