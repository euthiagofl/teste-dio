const prompt = require("prompt-sync")();

let vitoria = Number(prompt("Digite a quantidade de vitórias do seu herói: "));
let derrota = Number(prompt("Digite a quantidade de derrotas do seu herói: "));

let saldoTotal = saldoVitorias(vitoria, derrota);

switch (true) {
    case (saldoTotal < 0):
          console.log(`O Herói tem saldo negativo (${saldoTotal}). Continue jogando!`);
    break;
    
    case (saldoTotal <= 10):
    console.log(` Herói tem um saldo de ${saldoTotal} e está no nível de Ferro.`);
    break;

    case (saldoTotal <= 20):
    console.log(`O Herói tem um saldo de ${saldoTotal} e está no nível de Bronze.`);
    break;

    case (saldoTotal <= 50):
    console.log(`O Herói tem um saldo de ${saldoTotal} e está no nível de Prata.`);
    break;

    case (saldoTotal <= 80):
    console.log(`O Herói tem um saldo de ${saldoTotal} e está no nível de Ouro.`);
    break;

    case (saldoTotal <= 90):
    console.log(`O Herói tem um saldo de ${saldoTotal} e está no nível de Diamante.`);
    break;

    case (saldoTotal <= 100):
    console.log(`O Herói tem um saldo de ${saldoTotal} e está no nível de Lendário.`);
    break;
  default:
     console.log(`O Herói tem um saldo de ${saldoTotal} e está no nível de Imortal.`);
}

function saldoVitorias(vit, der){
    return vit-der;
}