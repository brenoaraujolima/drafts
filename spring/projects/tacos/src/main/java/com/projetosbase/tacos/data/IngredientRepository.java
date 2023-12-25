package com.projetosbase.tacos.data;

import com.projetosbase.tacos.model.Ingredient;

public interface IngredientRepository {
	Iterable<Ingredient> findAll();
	Ingredient findOne(String id);
	Ingredient save(Ingredient ingredient);
}
