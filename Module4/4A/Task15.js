/**
 * My Personal Library 3
 * Task
 * You now have more books in your library. You should manage them all in one place. Any idea how you can achieve that?... Arrays!
Create a books array. 

Each element of this array will be a book object. 

Each book object will have the following properties

title (string)

description (string)

numberOfPages (number)

authour (string)

reading (boolean)

       3. Use a for-loop to loop through the books array and log all books where the reading status is true to the console
 */

       
const myPersonalLibrary = [
    {
    title:'JavaScript Basics',
    description:'Introduction to Javascript basics',
    numberOfPages: 120,
    author: 'Ifeoma Onyemize',
    reading: true

 },

 {
    title:'Python Basics',
    description:'Introduction to Python basics',
    numberOfPages: 111,
    author: 'Adekemi Wummi',
    reading: false

 },

 {
    title:'React Basics',
    description:'Introduction to React basics',
    numberOfPages: 78,
    author: 'Jireh Tobe',
    reading: true

 },

 {
    title:'API',
    description:'Introduction to API basics',
    numberOfPages: 78,
    author: 'Ela Obinna',
    reading: false

 }

];

// Using for-loop to loop through the books array and log only the books that are currently being read

for (let i = 0; i < myPersonalLibrary.length; i++) {
    if (myPersonalLibrary[i].reading === true) {
        console.log(myPersonalLibrary[i]);
    }
}
