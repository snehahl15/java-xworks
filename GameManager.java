public class GameManager {
    // 1. Create the only allowed instance inside the class
    private static GameManager instance = new GameManager();
    
    int score = 0;

    // 2. PRIVATE CONSTRUCTOR: Prevents anyone else from using 'new GameManager()'
    private GameManager() {
        System.out.println("Game Manager Initialised.");
    }

    // 3. Provide a public way to get the single instance
    public static GameManager getInstance() {
        return instance;
    }
}
