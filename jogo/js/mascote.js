//posição do mascote
let yMascote = 360;
let xMascote = 70;
let meusPontos = 0;
//false pq ainda não te função, quando encontra e tiver colisao se tornara true
let colisao= false;

//colisao do carro perde ponto
function verificaColisao() {
    
    for (let i = 0; i < imagensViloes.length; i++) {
        colisao = collideRectCircle(xViloes[i],yViloes[i],larguraViloes,alturaViloes,xMascote,yMascote,10);

        if (colisao) {
            yMascote = 360;
            if (meusPontos > 0) {
                meusPontos-= 1;
            } 
        }
    }
    //usamos o print para ver se a colisao esta funcionando
    print('colisao acontecendo', colisao);
}

//quando passar da estrada ganha pontos
function incluirPontos() {
    
    text(meusPontos,20,25 )
    fill(color(255, 0, 0))
    textSize(21)

    if (yMascote < 0) {
        yMascote = 360
        meusPontos ++
        
    }

}

function movimentoMascote() {

    if (keyIsDown(UP_ARROW)) {
        
        yMascote -=5;
    }

    if (keyIsDown(DOWN_ARROW)){
        
        yMascote +=5;
    }

    if (keyIsDown(LEFT_ARROW)) {
        
        xMascote -=5;
    }

    if (keyIsDown(RIGHT_ARROW)) {
        
        xMascote +=5;
    }
}

function mostrarMascote() {

    image(imagemDoMascote, xMascote, yMascote, 50, 50);
    
}