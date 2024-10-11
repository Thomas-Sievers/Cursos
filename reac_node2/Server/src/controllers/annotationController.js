const annotations = require('../models/annotationData');

module.exports = {

    async read(req, res){
        const annotationList = await annotations.find();

        return res.json(annotationList);
    },

    async create (req, res){
        const {title, notes, priority } = req.body;

        if(!notes || !title){
            return res.status(400).json({ error: "Necessário um título/anotação!"})
        }

        const annotationCreated = await annotations.create({
            title,
            notes,
            priority,
        })
        return res.json(annotationCreated);
    },

    async delete(req, res){
        const { id } = req.params;
        
        try {
            const annotationDeleted = await annotations.findOneAndDelete({ _id: id });

            if (annotationDeleted) {
                return res.json(annotationDeleted);
            }

            return res.status(404).json({ error: "Não foi encontrado o registro para deletar" });
        } catch (err) {
            // Captura qualquer erro que possa ocorrer
            return res.status(500).json({ error: "Erro no servidor ao tentar deletar", details: err.message });
        }
    }
}