package com.info.client;

import com.info.TacoService.Taco;
import com.info.TacoService.store.NYTacoStore;
import com.info.TacoService.store.TacoStore;
import com.info.singleton.DeliveryService;

public class TacoOrder {

	public static void main(String[] args) {
		
		TacoStore nyTacoStore = new NYTacoStore();
		System.out.println("****Order Biria Taco****");
		System.out.println();
		Taco biriaTaco = nyTacoStore.orderTaco("Biria");
		System.out.println();
		System.out.println("****Order Carnitas cake****");
        Taco carnitas = nyTacoStore.orderTaco("Carnitas");
		// Deliver the cake using the singleton pattern
		System.out.println("****Deliver the Taco****");
		DeliveryService deliveryService = DeliveryService.getInstance();
		deliveryService.deliverTaco();

	}

}
