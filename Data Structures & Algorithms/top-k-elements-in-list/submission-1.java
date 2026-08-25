class Solution {
    int[] unique;
    Map<Integer, Integer> freqs;

    void swap(int a, int b) {
        int temp = unique[a];
        unique[a] = unique[b];
        unique[b] = temp;
    }

    int lomutoPartition(int left, int right, int pivot_index) {
        int pivot_freq = freqs.get(unique[pivot_index]);
        swap(pivot_index, right);
        int store_index = left;

        for (int i = left; i < right; i++) {
            if (freqs.get(unique[i]) < pivot_freq) {
                swap(store_index, i);
                store_index++;
            }
        }

        swap(store_index, right);

        return store_index;
    }

    void quickSelect(int left, int right, int k_s) {
        if (left == right)
            return;

        Random random_n = new Random();
        int pivot_index = left + random_n.nextInt(right - left);

        pivot_index = lomutoPartition(left, right, pivot_index);

        if (pivot_index == k_s) {
            return;
        } else if (pivot_index > k_s) {
            quickSelect(left, pivot_index - 1, k_s);
        } else {
            quickSelect(pivot_index + 1, right, k_s);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        freqs = new HashMap<>();
        for (int num : nums) {
            freqs.merge(num, 1, Integer::sum);
        }

        int index = 0;
        int n = freqs.size();
        unique = new int[n];
        for (int key : freqs.keySet()) {
            unique[index++] = key;
        }

        quickSelect(0, n - 1, n - k);
        return Arrays.copyOfRange(unique, n - k, n);
    }
}