public class GameManagerRunner {
    public static void main(String[] args) {
        System.out.println("--- Starting Game ---");

        // 1. Try to use 'new' (Uncommenting this line will cause a compilation error!)
         GameManager badAttempt = new GameManager(); 

        // 2. Get the allowed instance for the Player
        GameManager playerView = GameManager.getInstance();
        System.out.println("Player fetched the manager.");

        // 3. Player scores some points
        playerView.score += 50;
        System.out.println("Player added 50 points. Current Score: " + playerView.score);

        System.out.println("\n--- Enemy Defeated ---");

        // 4. Get the instance from a completely different part of the game (e.g., Enemy class)
        GameManager enemyView = GameManager.getInstance();
        System.out.println("Enemy system fetched the manager.");

        // 5. Check if the enemy sees the player's points
        System.out.println("Score visible to enemy system: " + enemyView.score);

        // 6. Enemy adds bonus points
        enemyView.score += 20;
        System.out.println("Enemy system added 20 points. New Score: " + enemyView.score);

        System.out.println("\n--- Final Verification ---");
        
        // 7. Verify that both variables point to the exact same object in memory
        if (playerView == enemyView) {
            System.out.println("SUCCESS: Both views point to the EXACT SAME object instance!");
            System.out.println("Final Game Score: " + playerView.score);
        }
    }
}
