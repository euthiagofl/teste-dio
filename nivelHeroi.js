const prompt = require("prompt-sync")();

let nomeHeroi = prompt("Digite o nome do seu herói: ");
let xpHeroi = Number(prompt("Digite a quantidade de experiência (XP) do seu herói: "));

if (xpHeroi <= 1000) {
    console.log(`O Herói de nome ${nomeHeroi} está no nível de Ferro`);
} else if (xpHeroi <= 2000) {
    console.log(`O Herói de nome ${nomeHeroi} está no nível de Bronze`);
} else if (xpHeroi <= 5000) {
    console.log(`O Herói de nome ${nomeHeroi} está no nível de Prata`);
} else if (xpHeroi <= 7000) {
    console.log(`O Herói de nome ${nomeHeroi} está no nível de Ouro`);
} else if (xpHeroi <= 8000) {
    console.log(`O Herói de nome ${nomeHeroi} está no nível de Platina`);
} else if (xpHeroi <= 9000) {
    console.log(`O Herói de nome ${nomeHeroi} está no nível de Ascendente`);
} else if (xpHeroi <= 10000) {
    console.log(`O Herói de nome ${nomeHeroi} está no nível de Imortal`);
} else {
    console.log(`O Herói de nome ${nomeHeroi} está no nível de Radiante`);
}