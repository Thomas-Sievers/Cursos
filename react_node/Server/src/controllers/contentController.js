const annotations = require('../models/annotationData');

module.exports = {

    async update(req, res){
        const { id } = req.params;
        const { notes } = req.body;

        const annotation = await annotations.findOne({ _id : id});

        if(notes){
            annotation.notes = notes;

            await annotation.save();
        }

        return res.json(annotation);

    }

};