// Create a function that filters out negative numbers

function filterNegativeNumber(arr) {
    const result = [];

    for (let num of arr) {
        if (num >= 0) {
            result.push(num);
        }
    }
    return result;
}

console.log(filterNegativeNumber([2, -5, 10, -3, 0]));  
// Output: [2, 10, 0]
