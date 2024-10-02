const express = require("express")
const app = express();
require('/dbConfig.js')

app.use(express.json());

app.get('/', (req, res) => {
    return res.json({
        nome: "Thomas",
        profissao: "Programador"
    })
})

app.listen(3333)
