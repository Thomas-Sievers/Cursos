const os = require('os') // os = operationSystem
const { people, ages } = require('./people')

console.log(people, ages);
console.log(os.platform(), os.homedir());

