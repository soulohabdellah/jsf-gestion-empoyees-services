/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaines;

import entities.Service;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Lachgar
 */
@ManagedBean
@SessionScoped
public class ServiceBean {

    private Service service;
    private List<Service> services;
    
    public ServiceBean() {
        service = new Service();
        services = new ArrayList<>();
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void onCreateAction(){
        services.add(service);
        service = new Service();
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
    

    
    
}
