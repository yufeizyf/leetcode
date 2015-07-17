Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)  
  
  Three Steps:  
  >Step1: make output[i] = nums[i] * nums[i-1] * ... * nums[0] (0 < i < N) and set output[0] = 1.  N is length of nums  
  >Step2: make nums[i] = nums[i] * nums[i+1] * ... * nums[N-1] (0 <= i < N-1) and set nums[N] = 1  
  >Step3: output[i] = output[i] * nums[i]
