// Last updated: 2/13/2026, 11:32:33 AM
class Solution {
    public double average(int[] salary) {
        int totalSum = 0;
        int minSalary = salary[0];
        int maxSalary = salary[0];
        for (int s : salary) {
            totalSum += s;
            if (s < minSalary) {
                minSalary = s;
            }
            if (s > maxSalary) {
                maxSalary = s;
            }
        }
        totalSum -= (minSalary + maxSalary);
        return (double) totalSum / (salary.length - 2);
    }
}
   
