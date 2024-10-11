const annotations = require('../models/annotationData');

module.exports = {

    async read(req, res){
        const priority = req.query;

        const priorityNotes = await annotations.find(priority);

        return res.json(priorityNotes);
    },

    async update(req, res){
        const { id } = req.params;

        const annotation = await annotations.findOne({ _id: id });

        if(annotation.priority == true){
            annotation.priority = false;
        }
        else{
            annotation.priority = true;
        }

        await annotation.save();

        return res.json({ annotation })
    }

};