//Sort an array of numbers in descending order


const nums = [5, 12, 9, 3, 20, 10, 1, 24];

nums.sort(function(a, b) {
    return b - a;   // Descending
});

console.log(nums);
