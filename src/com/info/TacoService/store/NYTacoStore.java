package com.info.TacoService.store;

import com.info.TacoService.BiriaTaco;
import com.info.TacoService.CarnitasTaco;
import com.info.TacoService.Taco;

public class NYTacoStore extends TacoStore{

	@Override
	protected Taco createTaco(String typeOfTaco) {
		// TODO Auto-generated method stub
		if(typeOfTaco.equals("Carnitas")) {
			return new CarnitasTaco();
		}
		else if (typeOfTaco.equals("Biria")) {
			return new BiriaTaco();
		}
		else {
			return null;
		}
		
	}

}
