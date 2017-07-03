/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chromis.Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Asun
 */
public class StockCurrent implements Serializable
{
  @Column(name = "location")
  private String location;
  @NotNull
  @Column(name = "product")
  private String product;
  @Column(name = "attributesetinstance_id")
  private String attributesetinstance_id;
  @NotNull
  @Column(name = "units")
  private double units;
  @Column(name = "siteguid")
  private String siteguid;
  @Column(name = "sflag")
  private boolean sflag;

  public String getLocation()
  {
    return location;
  }

  public void setLocation(String location)
  {
    this.location = location;
  }

  public String getProduct()
  {
    return product;
  }

  public void setProduct(String product)
  {
    this.product = product;
  }

  public String getAttributesetinstance_id()
  {
    return attributesetinstance_id;
  }

  public void setAttributesetinstance_id(String attributesetinstance_id)
  {
    this.attributesetinstance_id = attributesetinstance_id;
  }

  public double getUnits()
  {
    return units;
  }

  public void setUnits(double units)
  {
    this.units = units;
  }

  public String getSiteguid()
  {
    return siteguid;
  }

  public void setSiteguid(String siteguid)
  {
    this.siteguid = siteguid;
  }

  public boolean isSflag()
  {
    return sflag;
  }

  public void setSflag(boolean sflag)
  {
    this.sflag = sflag;
  }
  
}
