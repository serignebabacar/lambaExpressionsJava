package com.pluralsight.streamslambdas.perso;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.pluralsight.streamslambdas.ExampleData;
import com.pluralsight.streamslambdas.Product;

public class LambdasExample01 {

	private static Optional<Product> findProduct(List<Product> products, Predicate<Product> predicate) {

		for (Product product : products) {
			if (predicate.test(product))
				return Optional.of(product);
		}

		return Optional.empty();
	}

	public static void main(String[] args) {

		List<Product> products = ExampleData.getProducts();
		Predicate<Product> predicate = p -> p.getName().equals("Dishcloth");
		System.out.println(findProduct(products, predicate));
	}

}