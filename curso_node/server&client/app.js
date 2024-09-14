const express = require('express')
const morgan = require('morgan')

//express app
const app = express();

//connect with mongodb
const dbURI = 'mongodb+srv://Zaptas:Zaptas22t22t@nodetuts.1dnjc.mongodb.net/?retryWrites=true&w=majority&appName=NodeTuts'

//register view engine
app.set('view engine', 'ejs');


//listen for request
app.listen(3000)

//middleware & static files
app.use(express.static('public'))
app.use(morgan('dev'));

app.get('/', (req, res) => {
    const blogs = [
        {title : 'Yoshi finds eggs', snippet : 'Lorem ipsum dolor sit amet consectetur'},
        {title : 'Mario finds stars', snippet : 'Lorem ipsum dolor sit amet consectetur'},
        {title : 'How to defeat Bowser', snippet : 'Lorem ipsum dolor sit amet consectetur'},
    ];
    res.render('index', { title : 'Home', blogs : blogs });
});

app.get('/about', (req, res) => {
    //res.send('<p>About page</p>');
    res.render('about', { title: 'About'})
});

app.get('/blogs/create', (req, res) => {
    res.render('create', { title: 'create a new blog'})
})

//redirects
app.get('/about-us', (req, res) => {
    res.redirect('/about');
});

//404 page // sempre última rota
app.use((req, res) => {
    res.status(404).render('404', { title: '404'});
})