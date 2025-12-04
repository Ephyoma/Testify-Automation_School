/*
My Personal Library 2
Add a toggleReadingStatus method to your books objects. 

The method should update the value of the reading property of the book object.

Remember to log the reading property to the console to confirm the current status.
*/


const myPersonalLibrary = {
    title:'JavaScript Object Basics',
    description:'Learning JavaScript object properties and methods',
    numberOfPages: 120,
    author: 'Ifeoma Onyemize',
    reading: true,
    toggleReadingStatus: function(){
        if(myPersonalLibrary.reading===false) {
            myPersonalLibrary.reading = true
        } else {
            myPersonalLibrary.reading = false
        }
    }

 }

 myPersonalLibrary.toggleReadingStatus()

 console.log(myPersonalLibrary.reading)