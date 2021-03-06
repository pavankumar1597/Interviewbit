class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        //      **   iterating the elements from the rare end will **

        //         HashMap<Integer, Integer> map = new HashMap<>();

        //         for (int i = nums2.length - 1; i >= 0; i--) {
        //             while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
        //                 stack.pop();
        //             }

        //             if (stack.isEmpty()) {
        //                 map.put(nums2[i], -1);
        //                 stack.push(nums2[i]);
        //             } else {
        //                 map.put(nums2[i], stack.peek());
        //                 stack.push(nums2[i]);
        //             }
        //         }

        //         int[] arr = new int[nums1.length];

        //         for (int i = 0; i < arr.length; i++) {
        //             arr[i] = map.get(nums1[i]);
        //         }

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        int[] arr = new int[nums1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.getOrDefault(nums1[i], -1);
        }

        return arr;
    }
}
