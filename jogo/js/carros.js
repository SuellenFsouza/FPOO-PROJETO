//posições dos carros
let xViloes = [700,700,700,700,700,700]
let yViloes = [33, 100, 150, 200, 250, 300]
let velocidadeViloes = [2,3.2,2.6,3.3,4.2,5]
let larguraViloes=50;
let alturaViloes=50;

function movimentoMobs() {

    for (let i = 0; i < imagensViloes.length; i++) {

        xViloes[i] -= velocidadeViloes[i];
        
    }
}

function mostrarMobs() {

    for (let i = 0; i < imagensViloes.length; i++) {

        image(imagensViloes[i], xViloes[i], yViloes[i], larguraViloes, alturaViloes )

        if (xViloes[i] < -50) {
            xViloes[i] = 700
        }   
    }
}