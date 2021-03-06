/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChromisServices.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Asun
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
    resources.add(ChromisServices.service.AttributesetFacadeREST.class);
    resources.add(ChromisServices.service.AttributesetinstanceFacadeREST.class);
    resources.add(ChromisServices.service.CategoriesFacadeREST.class);
    resources.add(ChromisServices.service.ClosedcashFacadeREST.class);
    resources.add(ChromisServices.service.CustomersFacadeREST.class);
    resources.add(ChromisServices.service.LocationsFacadeREST.class);
    resources.add(ChromisServices.service.MerchantCategoriesFacadeREST.class);
    resources.add(ChromisServices.service.MerchantPeopleFacadeREST.class);
    resources.add(ChromisServices.service.MerchantsFacadeREST.class);
    resources.add(ChromisServices.service.PaymentsFacadeREST.class);
    resources.add(ChromisServices.service.PeopleFacadeREST.class);
    resources.add(ChromisServices.service.ProductsFacadeREST.class);
    resources.add(ChromisServices.service.PromotionsFacadeREST.class);
    resources.add(ChromisServices.service.ReceiptsFacadeREST.class);
    resources.add(ChromisServices.service.RolesFacadeREST.class);
    resources.add(ChromisServices.service.SalesFacadeREST.class);
    resources.add(ChromisServices.service.SalesItemsFacadeREST.class);
    resources.add(ChromisServices.service.StockCurrentFacadeREST.class);
    resources.add(ChromisServices.service.StockdiaryFacadeREST.class);
    resources.add(ChromisServices.service.TaxcategoriesFacadeREST.class);
    resources.add(ChromisServices.service.TaxcustcategoriesFacadeREST.class);
    resources.add(ChromisServices.service.TaxesFacadeREST.class);
    resources.add(ChromisServices.service.TaxlinesFacadeREST.class);
    }
    
}
