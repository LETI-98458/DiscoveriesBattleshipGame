package iscteiul.ista.battleship;

/**
 * Define o contrato para representar e manipular uma coordenada ou célula
 * na grelha quadriculada do jogo da Batalha Naval[cite: 2].
 * Gere o estado de ocupação por navios e o estado de impacto por tiros.
 */
public interface IPosition {

    /**
     * Obtém o índice da linha correspondente a esta coordenada na grelha[cite: 2].
     *
     * @return o número da linha.
     */
    int getRow();

    /**
     * Obtém o índice da coluna correspondente a esta coordenada na grelha[cite: 2].
     *
     * @return o número da coluna.
     */
    int getColumn();

    /**
     * Compara esta posição com outro objeto para verificar igualdade de coordenadas.
     *
     * @param other o objeto a comparar com esta posição.
     * @return true se as coordenadas (linha e coluna) coincidirem, false caso contrário.
     */
    boolean equals(Object other);

    /**
     * Verifica se esta posição é imediatamente vizinha ou adjacente a outra,
     * impedindo nomeadamente a sobreposição ou toque ilegal entre navios[cite: 2].
     *
     * @param other a outra posição a testar.
     * @return true se for adjacente (incluindo diagonais ou lados), false caso contrário.
     */
    boolean isAdjacentTo(IPosition other);

    /**
     * Marca esta célula da grelha como ocupada por uma fração de um navio.
     */
    void occupy();

    /**
     * Regista a ocorrência de um disparo sobre esta posição da grelha.
     */
    void shoot();

    /**
     * Indica se a posição contém atualmente algum navio.
     *
     * @return true se a posição estiver ocupada por um navio, false se for água.
     */
    boolean isOccupied();

    /**
     * Indica se esta posição já foi alvo de um disparo efetuado.
     *
     * @return true se já foi atingida por um tiro, false caso contrário.
     */
    boolean isHit();
}
