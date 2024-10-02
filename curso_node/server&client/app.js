const express = require('express');
const morgan = require('morgan');
const mongoose = require('mongoose');

const blogRoutes = require('./routes/blogRoutes');


//express app
const app = express();

//connect with mongodb
const dbURI = 'mongodb+srv://Zaptas:Zaptas22t22t@nodetuts.1dnjc.mongodb.net/NodeTuts?retryWrites=true&w=majority&appName=NodeTuts'

mongoose.connect(dbURI)
    .then((result) => app.listen(3000))
    .catch((err) => console.log(err));

//register view engine
app.set('view engine', 'ejs');

//middleware & static files
app.use(express.static('public'))
app.use(express.urlencoded({ extended : true }))
app.use(morgan('dev'));

//routes
app.get('/', (req, res) => {
    res.redirect('/blogs')
});

app.get('/about', (req, res) => {
    //res.send('<p>About page</p>');
    res.render('about', { title: 'About'})
});

//redirects
app.get('/about-us', (req, res) => {
    res.redirect('/about');
});

//blogs routes
app.use('/blogs', blogRoutes)

//404 page // sempre última rota
app.use((req, res) => {
    res.status(404).render('404', { title: '404'});
})