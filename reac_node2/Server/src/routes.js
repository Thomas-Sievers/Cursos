const express = require('express');
const routes = express.Router();

const annotationController = require('./controllers/annotationController');

//Rota annotations
routes.post('/annotations', annotationController.create);
routes.get('/annotations', annotationController.read);
routes.delete('/annotations/:id', annotationController.delete);

module.exports = routes;