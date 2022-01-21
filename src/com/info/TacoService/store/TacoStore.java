package com.info.TacoService.store;

import com.info.TacoService.Taco;

public abstract class TacoStore {
	
	public Taco orderTaco(String typeOfTaco) {
		
		Taco taco = createTaco(typeOfTaco);
		taco.prepare();
		taco.bake();
		taco.cut();
		taco.box();
		return taco;
		
	}

	protected abstract Taco createTaco(String typeOfTaco);

}
