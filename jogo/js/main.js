
//na função setup definimos as configurações de largura e altura do background
function setup() {

    createCanvas(700, 400)
}

//na função de desenho definimos o que será exibido
function draw() {
    //o image permite manipular o objeto no eixo X(de lado para o outro) e Y(de cima para baixo) como tambem W(largura) e H(altura)
    background(imagemDaEstrada);
    incluirPontos();
    mostrarMascote();
    mostrarMobs();
    movimentoMobs();
    movimentoMascote();
    verificaColisao();
}

