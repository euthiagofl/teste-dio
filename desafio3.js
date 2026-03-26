class Heroi{
    constructor(nomeHeroi, idadeHeroi, tipoHeroi){
        this.nomeHeroi = nomeHeroi
        this.idadeHeroi = idadeHeroi
        this.tipoHeroi = tipoHeroi
    }
    atacar(){
        let ataque;

        switch(this.tipoHeroi){
            case "mago":
                ataque = "magia";
                break;

            case "guerreiro":
                ataque = "espada";
                break;

            case "monge":
                ataque = "artes marciais";
                break;

            case "ninja":
                ataque = "shuriken";
                break;

            default:
                ataque = "ataque desconhecido";
        }

        console.log(`O ${this.tipoHeroi} atacou usando ${ataque}`);
    }
}



   // Criando heróis
let heroi1 = new Heroi("Arthus", 30, "mago");
let heroi2 = new Heroi("Kratos", 40, "guerreiro");
let heroi3 = new Heroi("Lee", 25, "monge");
let heroi4 = new Heroi("Hanzo", 28, "ninja");

// Executando ataques
heroi1.atacar();
heroi2.atacar();
heroi3.atacar();
heroi4.atacar();