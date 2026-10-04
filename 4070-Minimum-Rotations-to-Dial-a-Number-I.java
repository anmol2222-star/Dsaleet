class Solution {
    public int minRotations(String s) {
        int current = 0;
        int rotations = 0;

        for (int i = 0; i < s.length(); i++) {
            int next = s.charAt(i) - '0';

            int distance = Math.abs(current - next);

            rotations += Math.min(distance, 10 - distance);

            current = next;
        }

        return rotations;
    }
}