package com.company;

public class Product {
    private final String name;
    private final String fat;
    private final String sodium;
    private final int servings;
    public static class Builder{

        //Required parameters
        private final int servings;
        //Optional Parameters
        private  String name = "JACK";
        private  String fat = "Dim";
        private  String sodium = "Sodda";

        public Builder(int servings) {
            this.servings = servings;
        }
        public Builder name(String val){
            name = val; return this;
        }

        public Builder fat(String fat) {
            this.fat = fat; return this;
        }

        public Builder sodium(String sodium) {
            this.sodium = sodium;return this;
        }
        public Product build(){
            return new Product(this);
        }

    }

    public Product(Builder builder) {
        servings = builder.servings;
        fat = builder.fat;
        sodium = builder.sodium;
        name = builder.name;
    }

    public String getName() {
        return name;
    }

    public String getFat() {
        return fat;
    }

    public String getSodium() {
        return sodium;
    }

    public int getServings() {
        return servings;
    }
}
