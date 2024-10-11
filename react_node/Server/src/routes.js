const express = require('express');
const routes = express.Router();

const annotationController = require('./controllers/annotationController');
const priorityController = require('./controllers/priorityController');
const contentController = require('./controllers/contentController');

//Rota annotations
routes.post('/annotations', annotationController.create);
routes.get('/annotations', annotationController.read);
routes.delete('/annotations/:id', annotationController.delete);

//Rota priority
routes.get('/priorities', priorityController.read);
routes.post('/priorities/:id', priorityController.update);

//Rota content
routes.post('/content/:id', contentController.update);

module.exports = routes;