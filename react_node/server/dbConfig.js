const mongoose = require('mongoose');

const dbConfig = 'mongodb+srv://admin:admin@koliadatabase.1dnjc.mongodb.net/annotations?retryWrites=true&w=majority&appName=KoliaDataBase'

const connection = mongoose.connect(dbConfig, {
    useNewUrlParser: true,
    useUnifiedTopology: true
});

module.exports = connection;