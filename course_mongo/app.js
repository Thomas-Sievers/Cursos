const express = require('express')
const { connectToDb, getDb } = require ('./db')

// init app & middleware
const app = express();

//db connection
let db

connectToDb((err) =>{
    if(!err){
        app.listen(3000, ()=> {
            console.log("Listening on port 3000")
        })
        db = getDb();
    }
})



// routes
app.get('/books', (req, res) => {
    res.json({mssg: "Welcome to de api"})
})