//Problem Description

/*
Given a monthly salary s in dollars, a list of debts, and a list of interests for these debts, your task is to pay all the debts while spending the least possible amount of money. However, you have a strict restriction: you can spend no more than 10% of your salary on covering debts.

There is also a rule on how the required payment can change according to your previous payments: if at the end of the month, you do not fully pay your ith debt, its amount increases by (interests[i] / 100) * debts[i] dollars. In other words, if at the end of the month for some i where debts[i] > 0, then debts[i] becomes equal to

debts[i] + debts[i] * (interests[i] / 100)
You can pay for the debts in any order. Return the minimum possible amount of money required to cover all the debts.

Example

For s = 50, debts = [2, 2, 5], and interests = [200, 100, 150], the output should be solution(s, debts, interests) = 22.

Each month you are allowed to spend $5 to cover the debts ($50 * 10% = $5).

Here's a way to pay all the debts over a period of 5 months, spending the minimal amount of $22 for it:

During the 1st month, spend $2 to cover debts[0] and $3 to partially cover debts[2]. After that the debts array will look like [0, 2, 2]. After recalculations it will look like [0, 2 + 2 * (100 / 100), 2 + (2 * 150 / 100)] = [0, 4, 5].
During the 2nd month, spend $5 to cover debts[2]. After that the debts array will look like [0, 4, 0]. After recalculations it will look like [0, 4 + 4 * (100 / 100), 0] = [0, 8, 0].
During the 3rd month, spend $5 to partially cover debts[1]. After that the debts array will look like [0, 3, 0]. After recalculations it will look like [0, 3 + 3 * (100 / 100), 0] = [0, 6, 0].
During the 4th month, spend $5 one more time to partially cover debts[1] again. After that the debts array will look like [0, 1, 0]. After recalculations the debts array will look like [0, 1 + 1 * (100 / 100), 0] = [0, 2, 0].
During the 5th month, spend $2 to cover the remaining part of debts[1].
So over the course of 5 months, you will have paid $5 + $5 + $5 + $5 + $2 = $22 to cover all the debts.

For s = 40, debts = [2, 2, 5], and interests = [75, 25, 25], the output should be solution(s, debts, interests) = 10.8125.

Each month you are allowed to spend $4 to cover debts ($40 * 10% = $5).

Here's a way to pay all the debts over a period of 3 months, spending the minimal amount of $10.8125 for it:

During the 1st mont, spend $2 to cover debts[0] and $2 to cover debts[1]. After that the debts array will look like [0, 0, 5]. After recalculations it will look like [0, 0, 5 + 5 * (25 / 100)] = [0, 0, 6.25].
During the 2nd month, spend $4 to partially cover debts[2]. After that the debts array will look like [0, 0, 2.25]. After recalculations it will look like [0, 0, 2.25 + 2.25 * (25 / 100)] = [0, 0, 2.8125].
During the 3rd month you spend $2.8125 to cover the remaining part of debts[2].
So over the 3 months, you will have paid $4 + $4 + $2.8125 = $10.8125 to cover all the debts.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer s

An integer representing your monthly salary.

Guaranteed constraints:
10 ≤ s ≤ 5000.

[input] array.integer debts

An array of the debt amounts you have.

Guaranteed constraints:
1 ≤ debts.length ≤ 100,
1 ≤ debts[i] ≤ 100.

[input] array.integer interests

An array of interest values.

Guaranteed constraints:
1 ≤ interests.length ≤ 100,
 interests.length = debts.length,
1 ≤ interests[i] ≤ 1000.

[output] float

The minimal amount of money can be spent to cover all the debts. Your answer will be considered correct if absolute or relative error won't exceed 10-5

*/

//Solution
//It didn't pass two hidden tests, I can't find a case where my algorithm fails
//If you are seeing this code to study and can find one test case that my algorithm fails
//Please let me know! 
//You can find my email contact on my profile. Thank You!
double solution(int s, int[] debts, int[] interests) {
    double amountPerMonth = s / 10;
    int highestDebtPos = 0;
    double sumDebts = 0;
    double availableMonthAmount = amountPerMonth;
    double exceedingValue = 0;
    double valuePaid = 0;
    double highestDebt = Integer.MIN_VALUE;
    double[] newDebts = new double[debts.length];
    
    for(int i = 0; i < debts.length; i++){
        newDebts[i] = debts[i];    
        sumDebts = sumDebts + newDebts[i];
    }
    
    while(sumDebts > 0) {
        sumDebts = 0;
        exceedingValue = 0;
        for(int i = 0; i < newDebts.length; i++){
            sumDebts = sumDebts + newDebts[i];
            if(interests[i] > highestDebt && newDebts[i] > 0.0){
                highestDebt = interests[i];
                highestDebtPos = i;
            } 
        }
        
        newDebts[highestDebtPos] = newDebts[highestDebtPos] - availableMonthAmount;
        if(newDebts[highestDebtPos] < 0){
            exceedingValue = newDebts[highestDebtPos];
            newDebts[highestDebtPos] = 0;
        }
        valuePaid = valuePaid + availableMonthAmount + exceedingValue;
        availableMonthAmount = (-1) * exceedingValue;
        
        if(availableMonthAmount == 0) {

            for(int i = 0; i < newDebts.length; i++){
        newDebts[i] = newDebts[i] + (newDebts[i] * ((double) interests[i] / 100 ));  
            
            }
            availableMonthAmount = amountPerMonth;
        }
        System.out.println("----------------");
        highestDebt = Integer.MIN_VALUE;       
    }
    
    return valuePaid;
}

