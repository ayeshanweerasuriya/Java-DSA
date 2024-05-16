
import java.util.*;

class Restaurant {
    private String name;
    private String cuisine;
    private double rating;
    private int numberOfReviews;

    public Restaurant(String name, String cuisine, double rating, int numberOfReviews) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        this.numberOfReviews = numberOfReviews;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public double getRating() {
        return rating;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public int calculatePopularityScore() {
        return (int) (rating * numberOfReviews);
    }
}

public class RestRecoMiniProject {

    // Merge sort function for sorting restaurants based on popularity score
    public static LinkedList<Restaurant> mergeSort(LinkedList<Restaurant> list) {
        if (list.size() <= 1) {
            return list;
        }

        int middle = list.size() / 2;
        LinkedList<Restaurant> leftList = new LinkedList<>(list.subList(0, middle));
        LinkedList<Restaurant> rightList = new LinkedList<>(list.subList(middle, list.size()));

        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);

        return merge(leftList, rightList);
    }

    // Function to merge two sorted linked lists
    public static LinkedList<Restaurant> merge(LinkedList<Restaurant> leftList, LinkedList<Restaurant> rightList) {
        LinkedList<Restaurant> mergedList = new LinkedList<>();

        while (!leftList.isEmpty() && !rightList.isEmpty()) {
            if (leftList.getFirst().calculatePopularityScore() > rightList.getFirst().calculatePopularityScore()) {
                mergedList.add(leftList.removeFirst());
            } else {
                mergedList.add(rightList.removeFirst());
            }
        }

        while (!leftList.isEmpty()) {
            mergedList.add(leftList.removeFirst());
        }

        while (!rightList.isEmpty()) {
            mergedList.add(rightList.removeFirst());
        }

        return mergedList;
    }

    // Function to perform personalized sorting
    public static Hashtable<String, LinkedList<Restaurant>> personalizedSort(
            Hashtable<String, LinkedList<Restaurant>> cuisineRestaurants, List<String> userPreferences) {
        for (String cuisine : userPreferences) {
            LinkedList<Restaurant> restaurants = cuisineRestaurants.get(cuisine);
            if (restaurants != null) {
                LinkedList<Restaurant> sortedRestaurants = mergeSort(restaurants);
                cuisineRestaurants.put(cuisine, sortedRestaurants);
            }
        }
        return cuisineRestaurants;
    }

    // Function to perform efficient search for top N recommendations
    public static LinkedList<Restaurant> efficientSearch(LinkedList<Restaurant> sortedList, int topN) {
        LinkedList<Restaurant> resultList = new LinkedList<>();
        if (sortedList.isEmpty() || topN <= 0) {
            return resultList;
        }

        int left = 0, right = sortedList.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (mid == topN - 1) {
                for (int i = mid; i < sortedList.size(); i++) {
                    resultList.add(sortedList.get(i));
                }
                break;
            } else if (mid > topN - 1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        // Sample dataset for user preferences
        List<String> userPreferences = Arrays.asList("Italian", "Chinese", "Mexican");

        // Sample dataset for user's dining history
        List<Restaurant> diningHistory = Arrays.asList(
                new Restaurant("Luigi's", "Italian", 4.5, 150),
                new Restaurant("Panda Express", "Chinese", 4.0, 200),
                new Restaurant("La Fiesta", "Mexican", 4.7, 120),
                new Restaurant("Olive Garden", "Italian", 4.1, 180),
                new Restaurant("Golden Dragon", "Chinese", 4.3, 160),
                new Restaurant("Taco Bell", "Mexican", 1.7, 1000));

        // Sample dataset for restaurant catalog
        List<Restaurant> restaurantCatalog = new ArrayList<>(diningHistory); // Assuming catalog is same as dining
                                                                             // history

        // User Dining Profiling
        Hashtable<String, LinkedList<Restaurant>> cuisineRestaurants = new Hashtable<>();
        for (String cuisine : userPreferences) {
            LinkedList<Restaurant> restaurants = new LinkedList<>();
            for (Restaurant restaurant : diningHistory) {
                if (restaurant.getCuisine().equals(cuisine)) {
                    restaurants.add(restaurant);
                }
            }
            cuisineRestaurants.put(cuisine, restaurants);
        }

        // Personalized Sorting
        Hashtable<String, LinkedList<Restaurant>> sortedCuisineRestaurants = personalizedSort(cuisineRestaurants,
                userPreferences);

        // Efficient Search for Recommendations
        LinkedList<Restaurant> topNRecommendations = new LinkedList<>();
        for (String cuisine : userPreferences) {
            LinkedList<Restaurant> sortedList = sortedCuisineRestaurants.get(cuisine);
            if (sortedList != null) {
                LinkedList<Restaurant> topCuisineRecommendations = efficientSearch(sortedList, 2); // Get top 2
                                                                                                   // recommendations
                                                                                                   // per cuisine
                topNRecommendations.addAll(topCuisineRecommendations);
            }
        }

        // Output the recommendations
        System.out.println("Top N Restaurant Recommendations:");
        for (Restaurant restaurant : topNRecommendations) {
            System.out.println(restaurant.getName() + " (" + restaurant.getCuisine() + ") - Rating: "
                    + restaurant.getRating() + ", Reviews: " + restaurant.getNumberOfReviews());
        }
    }
}
