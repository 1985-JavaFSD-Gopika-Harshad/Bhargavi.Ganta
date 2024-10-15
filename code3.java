import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentMapExample {

    public static void main(String[] args) {
       
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);


        for (int i = 1; i <= 5; i++) {
            final int key = i;
            executor.submit(() -> {
                map.put(key, "Value" + key);
                System.out.println("Added: " + key + " -> Value" + key);
            });
        }

        
        for (int i = 1; i <= 5; i++) {
            final int key = i;
            executor.submit(() -> {
                String value = map.get(key);
                System.out.println("Retrieved: " + key + " -> " + value);
            });
        }

                for (int i = 1; i <= 5; i++) {
            final int key = i;
            executor.submit(() -> {
                String removedValue = map.remove(key);
                System.out.println("Removed: " + key + " -> " + removedValue);
            });
        }


        executor.shutdown();
    }
}
