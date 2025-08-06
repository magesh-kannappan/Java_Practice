package a41_Max_Block_Finder;

public class Max_Block_Finder {

	public static void main(String[] args) {

		// maxBlock("hoopla") → 2
		// maxBlock("abbCCCddBBBxx") → 3
		// maxBlock("") → 0

		String input = "";

		if (input.isEmpty()) {
			System.out.println("Max block length: 0");
			return;
		}

		int maxBlock = 1; // Minimum block size is 1
		int currentBlock = 1; // Count for current repeated characters

		for (int i = 1; i < input.length(); i++) {
			// If current char is same as previous, increase current block size
			if (input.charAt(i) == input.charAt(i - 1)) {
				currentBlock++;
				// Update maxBlock if needed
				if (currentBlock > maxBlock) {
					maxBlock = currentBlock;
				}
			} else {
				// Reset current block size to 1 for new character
				currentBlock = 1;
			}
		}

		System.out.println("Max block length: " + maxBlock);
	}

}
