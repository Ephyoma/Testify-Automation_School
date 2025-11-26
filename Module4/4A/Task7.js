// Step 1: Initialize the triangle sides
const side1 = 5
const side2 = 5
const side3 = 5 // Equilateral


/*
const side1 = 5
const side2 = 5
const side3 = 8 // Isosceles
*/

/*
const side1 = 3
const side2 = 5
const side3 = 7  // Scalene


*/

// Step 2: Determine the type of triangle
if (side1 === side2 && side2 === side3) {
    console.log("Equilateral triangle");
} 
else if (side1 === side2 || side1 === side3 || side2 === side3) {
    console.log("Isosceles triangle");
} 
else {
    console.log("Scalene triangle");
}
