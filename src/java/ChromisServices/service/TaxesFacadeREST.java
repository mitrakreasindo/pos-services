/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChromisServices.service;

import Chromis.Entities.Taxes;
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
@Path("chromis.entities.taxes")
public class TaxesFacadeREST extends AbstractFacade<Taxes>
{

  @PersistenceContext(unitName = "MKChromisServicesPU")
  private EntityManager em;

  public TaxesFacadeREST()
  {
    super(Taxes.class);
  }

  @Override
  protected EntityManager getEntityManager()
  {
    return em;
  }
  
}
