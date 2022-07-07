package br.com.mazeu.bookstore.model.entities;
@FunctionalInterface
public interface Promotional {

   boolean applyDiscount(double percentage);

   default boolean applyDiscount10(){
      return applyDiscount(0.1);
   }
}
