package com.projetosbase.tacos.data;

import com.projetosbase.tacos.model.Order;

public interface OrderRepository {
	Order save(Order order);
}