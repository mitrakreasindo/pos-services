/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChromisServices.service;

import Chromis.Entities.Viewsalesitems;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Asun
 */
@Stateless
@Path("chromis.entities.viewsalesitems")
public class ViewsalesitemsFacadeREST extends AbstractFacade<Viewsalesitems>
{

  @PersistenceContext(unitName = "MKChromisServicesPU")
  private EntityManager em;

  public ViewsalesitemsFacadeREST()
  {
    super(Viewsalesitems.class);
  }

//  @POST
//  @Override
//  @Consumes(
//  {
//    MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON
//  })
//  public void create(Viewsalesitems entity)
//  {
//    super.create(entity);
//  }
//
//  @PUT
//  @Path("{id}")
//  @Consumes(
//  {
//    MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON
//  })
//  public void edit(@PathParam("id") String id, Viewsalesitems entity)
//  {
//    super.edit(entity);
//  }
//
//  @DELETE
//  @Path("{id}")
//  public void remove(@PathParam("id") String id)
//  {
//    super.remove(super.find(id));
//  }
//
//  @GET
//  @Path("{id}")
//  @Produces(
//  {
//    MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON
//  })
//  public Viewsalesitems find(@PathParam("id") String id)
//  {
//    return super.find(id);
//  }
//
//  @GET
//  @Override
//  @Produces(
//  {
//    MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON
//  })
//  public List<Viewsalesitems> findAll()
//  {
//    return super.findAll();
//  }
//
//  @GET
//  @Path("{from}/{to}")
//  @Produces(
//  {
//    MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON
//  })
//  public List<Viewsalesitems> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to)
//  {
//    return super.findRange(new int[]{from, to});
//  }
//
//  @GET
//  @Path("count")
//  @Produces(MediaType.TEXT_PLAIN)
//  public String countREST()
//  {
//    return String.valueOf(super.count());
//  }

  @Override
  protected EntityManager getEntityManager()
  {
    return em;
  }
  
}