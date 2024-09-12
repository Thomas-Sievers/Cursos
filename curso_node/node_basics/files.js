const fs = require('fs') // fs = fileSystem

//reading files
fs.readFile('./Docs/Blog1.txt' , (err, data) =>{
    if(err){
        console.log(err);
    }
    console.log(data.toString());
});

console.log('Last Line')

//writing files
fs.writeFile('./Docs/Blog1.txt', 'Hello world', () => {
    console.log('File was written');
})

fs.writeFile('./Docs/Blog2.txt', 'Hello again', () => {
    console.log('File was written');
})

//directories
if(!fs.existsSync('./assets')){
    fs.mkdir('./assets', (err) => {
        if(err){
            console.log(err);
        }
        console.log('Folder Created')
    })
} else {
    fs.rmdir('./assets', (err) => {
        if(err){
            console.log(err)
        }
        console.log('Folder Deleted')
    })
}

//deleting files
if(fs.existsSync('./Docs/deleteme.txt')){
    fs.unlink('./docs/deleteme.txt', (err) =>{
        if (err){
            console.log(err)
        }
        console.log('file deleted')
    })
}