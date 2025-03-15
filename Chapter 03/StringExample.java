public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        
        // Length
        System.out.println("Length: " + greeting.length());
        
        // Character at
        System.out.println("Character at index 1: " + greeting.charAt(1));
        
        // Substring
        System.out.println("Substring from index 7: " + greeting.substring(7));
        System.out.println("Substring from index 7 to 12: " + greeting.substring(7, 12));
        
        // Concatenation
        String extendedGreeting = greeting.concat(" How are you?");
        System.out.println("Concatenated String: " + extendedGreeting);
        
        // Contains
        System.out.println("Contains 'World': " + greeting.contains("World"));
        
        // Index of
        System.out.println("Index of 'W': " + greeting.indexOf('W'));
        
        // Replace
        System.out.println("Replace 'World' with 'Java': " + greeting.replace("World", "Java"));
        
        // Trim
        String withSpaces = "  Hello, World!  ";
        System.out.println("Trimmed String: '" + withSpaces.trim() + "'");
        
        // To Lower Case / To Upper Case
        System.out.println("Lower Case: " + greeting.toLowerCase());
        System.out.println("Upper Case: " + greeting.toUpperCase());
        
        // Split
        String[] parts = greeting.split(", ");
        System.out.println("Split parts: " + parts[0] + " and " + parts[1]);
    }
}
