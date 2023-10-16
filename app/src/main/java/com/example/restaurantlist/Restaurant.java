package com.example.restaurantlist;

public class Restaurant {
    private String restaurantName = "";
    private String restaurantAddress = "";
    private String restaurantTel = "";
    private String restaurantType = "";

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public void setRestaurantTel(String restaurantTel) {
        this.restaurantTel = restaurantTel;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }

    @Override
    public String toString(){
        return (getRestaurantName());
    }
}
