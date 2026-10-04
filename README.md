# Battleship

Versão da Batalha Naval no tempo dos Descobrimentos, desenvolvida no âmbito da unidade curricular de Engenharia de Software (ISCTE, 2026/2027).

### Grupo: TP01_LETI-3

Nome | Licenciatura | N.º de aluno | Conta Github
--- | --- | --- | ---
Rui Alves | LTDIA | 130755 | LETI-130755
Tiago Cunha | LETI | 129808 | LETI-129808
Tomás Santos | LETI | 98458 | LETI-98458

## Sobre o jogo

A Batalha Naval é um jogo para dois jogadores em que cada um começa por construir duas grelhas quadriculadas iguais de 10×10 quadrados: uma representa "o seu mar", a outra "o mar do adversário". Cada jogador posiciona a sua frota na sua grelha, sem que o adversário a veja, e depois tenta afundar os navios do oponente.

Nesta versão, os navios têm nomes do tempo das Descobertas.

## Tipos de navios

Navio | Dimensão | Nº de navios
--- | --- | ---
Galeão | 5 | 1
Fragata | 4 | 1
Nau	| 3 |	2
Caravela | 2 | 3
Barca | 1 | 4

Cada jogador tem uma frota de 11 navios.

## Regras do jogo

### Posicionamento da frota
1. Cada jogador tem duas grelhas de 10×10: o *seu mar* e o *mar do adversário*.
2. Os navios são colocados na orientação *horizontal* ou *vertical* (nunca na diagonal).
3. Os navios *não podem tocar-se* entre si, mas *podem encostar à borda* da grelha.
4. O número e os tipos de navios são iguais para ambos os jogadores (ver tabela acima).
5. O adversário não vê a posição dos navios.

### Decorrer do jogo
1. Depois de posicionadas as frotas, os jogadores jogam *à vez*.
2. Em cada jogada, o jogador dispara *três tiros* sobre a frota adversária, indicando as coordenadas de cada um (*linha, coluna*).
3. O adversário responde ao resultado da rajada, indicando:
   - se acertou em *um ou mais navios* e de que *tipo*;
   - quais os tiros que foram *na água*.
4. Cada jogador regista na grelha do oponente os resultados dos seus tiros, identificando os navios *afundados*.
  
### Fim do jogo
Ganha o primeiro jogador que *afundar todos os navios* da frota adversária.

## 🔗 Para saber mais

- [Batalha naval (jogo)](https://pt.wikipedia.org/wiki/Batalha_naval_(jogo))
- [Galeão](https://pt.wikipedia.org/wiki/Gale%C3%A3o)
- [Fragata](https://pt.wikipedia.org/wiki/Fragata)
- [Nau](https://pt.wikipedia.org/wiki/Nau)
- [Caravela](https://pt.wikipedia.org/wiki/Caravela)
- [Barca](https://pt.wikipedia.org/wiki/Barca)

## 🛠️ Tecnologias

- Java
- Git e GitHub (Issues, Pull Requests, GitHub Actions)
- IntelliJ IDEA Ultimate
- Javadoc (documentação em docs/)
