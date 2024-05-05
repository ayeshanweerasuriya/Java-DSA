import java.util.Hashtable;
import java.util.LinkedList;

public class Example {

    public static void main(String[] args) {
        // Create a hash table to store restaurants by cuisine type
        Hashtable<String, LinkedList<String>> cuisineRestaurants = new Hashtable<>();

        // Sample dataset of restaurants
        LinkedList<String> restaurants = new LinkedList<>();
        restaurants.add("Italian Restaurant A");
        restaurants.add("Italian Restaurant B");
        restaurants.add("Italian Restaurant C");
        restaurants.add("Japanese Restaurant A");
        restaurants.add("Japanese Restaurant B");
        restaurants.add("Mexican Restaurant A");
        restaurants.add("Mexican Restaurant B");
        restaurants.add("Mexican Restaurant C");

        // Iterate through each restaurant and categorize them by cuisine type
        for (String restaurant : restaurants) {
            String cuisine = getCuisine(restaurant); // Assume a method to extract cuisine type
            LinkedList<String> cuisineList = cuisineRestaurants.getOrDefault(cuisine, new LinkedList<>());
            cuisineList.add(restaurant);
            cuisineRestaurants.put(cuisine, cuisineList);
        }

        // Sort restaurants within each cuisine category
        for (String cuisine : cuisineRestaurants.keySet()) {
            LinkedList<String> restaurantList = cuisineRestaurants.get(cuisine);
            mergeSort(restaurantList);
        }

        // Print the sorted dataset
        for (String cuisine : cuisineRestaurants.keySet()) {
            System.out.println("Cuisine: " + cuisine);
            System.out.println("Sorted Restaurants: " + cuisineRestaurants.get(cuisine));
            System.out.println();
        }
    }

    private static void mergeSort(LinkedList<String> list) {
        if (list.size() <= 1) return; // base case

        LinkedList<String> leftList = new LinkedList<>();
        LinkedList<String> rightList = new LinkedList<>();

        int middle = list.size() / 2;
        for (int i = 0; i < middle; i++) {
            leftList.add(list.removeFirst());
        }
        while (!list.isEmpty()) {
            rightList.add(list.removeFirst());
        }

        mergeSort(leftList);
        mergeSort(rightList);
        merge(leftList, rightList, list);
    }

    private static void merge(LinkedList<String> leftList, LinkedList<String> rightList, LinkedList<String> list) {
        while (!leftList.isEmpty() && !rightList.isEmpty()) {
            if (leftList.getFirst().compareTo(rightList.getFirst()) < 0) {
                list.add(leftList.removeFirst());
            } else {
                list.add(rightList.removeFirst());
            }
        }
        list.addAll(leftList);
        list.addAll(rightList);
    }

    // Method to extract cuisine type from restaurant name
    private static String getCuisine(String restaurant) {
        // This is a simplified example, you might have a more sophisticated way to extract cuisine
        if (restaurant.contains("Italian")) {
            return "Italian";
        } else if (restaurant.contains("Japanese")) {
            return "Japanese";
        } else if (restaurant.contains("Mexican")) {
            return "Mexican";
        } else {
            return "Other";
        }
    }
}
