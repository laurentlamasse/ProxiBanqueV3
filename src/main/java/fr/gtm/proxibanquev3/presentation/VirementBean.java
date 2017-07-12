package fr.gtm.proxibanquev3.presentation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.exception.VirementException;
import fr.gtm.proxibanquev3.domaine.Virement;
/*import com.gtm.proxibanquev3.service.VirementService;

@Named
@SessionScoped
public class VirementBean implements Serializable{
   
	@Inject 
	Virement virement;
	
	@Inject
	VirementService service;

	@PostConstruct
	public void init() {
		virement=new Virement();
	}
	
	
	public void virer() throws VirementException {
		service.effectuerVirement(virement);
	    }


	public Virement getVirement() {
		return virement;
	}


	public void setVirement(Virement virement) {
		this.virement = virement;
	}

}*/
