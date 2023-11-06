package com.example.pizzarecipes;

public class PizzaRecipeItem {

    private int imageResource;
    private String title;
    private String desription;
    private String recipe;

    public PizzaRecipeItem(int imageResource, String title, String desription, String recipe) {
        this.imageResource = imageResource;
        this.title = title;
        this.desription = desription;
        this.recipe = recipe;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDesription() {
        return desription;
    }
    public String getRecipe(){
        return recipe;
    }
}