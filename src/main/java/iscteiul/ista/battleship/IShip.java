package iscteiul.ista.battleship;

import java.util.List;

/**
 * Define o contrato para a representação de um navio no jogo da Batalha Naval dos Descobrimentos[cite: 2].
 * Disponibiliza operações para consultar dimensões, orientação, limites espaciais,
 * estado de flutuação e regras de proximidade ou impacto de disparos[cite: 2, 4].
 *
 */
public interface IShip {

    /**
     * Obtém o nome ou categoria do navio na versão da época dos Descobrimentos
     * (por exemplo: "Galeão", "Fragata", "Nau", "Caravela" ou "Barca")[cite: 2].
     *
     * @return a designação da categoria do navio[cite: 2].
     */
    String getCategory();

    /**
     * Devolve a dimensão do navio em número de posições ocupadas na grelha[cite: 2].
     *
     * @return o tamanho do navio (número de células que ocupa)[cite: 2].
     */
    Integer getSize();

    /**
     * Obtém a lista de todas as posições na grelha ocupadas pela estrutura deste navio[cite: 2].
     *
     * @return lista de instâncias de {@link IPosition} que compõem o navio.
     */
    List<IPosition> getPositions();

    /**
     * Obtém a posição de referência inicial (canto superior esquerdo) do navio na grelha.
     *
     * @return a coordenada inicial de referência {@link IPosition}.
     */
    IPosition getPosition();

    /**
     * Obtém a orientação do navio segundo os pontos cardeais (horizontal ou vertical)[cite: 2].
     *
     * @return a orientação atual através do enum {@link Compass}.
     */
    Compass getBearing();

    /**
     * Verifica se o navio ainda se encontra a flutuar (ou seja, se ainda tem partes não atingidas)[cite: 4].
     *
     * @return true se o navio ainda não tiver sido totalmente afundado, false caso contrário[cite: 4].
     */
    boolean stillFloating();

    /**
     * Obtém o índice da linha mais a norte (topo) ocupada pelo navio na grelha[cite: 2].
     *
     * @return o valor mínimo da linha ocupada.
     */
    int getTopMostPos();

    /**
     * Obtém o índice da linha mais a sul (fundo) ocupada pelo navio na grelha[cite: 2].
     *
     * @return o valor máximo da linha ocupada.
     */
    int getBottomMostPos();

    /**
     * Obtém o índice da coluna mais a oeste (esquerda) ocupada pelo navio na grelha[cite: 2].
     *
     * @return o valor mínimo da coluna ocupada.
     */
    int getLeftMostPos();

    /**
     * Obtém o índice da coluna mais a este (direita) ocupada pelo navio na grelha[cite: 2].
     *
     * @return o valor máximo da coluna ocupada.
     */
    int getRightMostPos();

    /**
     * Verifica se o navio ocupa a posição indicada pelas coordenadas fornecidas.
     *
     * @param pos a coordenada a verificar.
     * @return true se o navio ocupar essa coordenada, false caso contrário.
     */
    boolean occupies(IPosition pos);

    /**
     * Verifica se este navio está demasiado próximo de outro navio,
     * violando a regra de não ser permitido o contacto entre embarcações[cite: 2].
     *
     * @param other o outro navio a comparar.
     * @return true se houver contacto ou adjacência direta com o outro navio, false caso contrário[cite: 2].
     */
    boolean tooCloseTo(IShip other);

    /**
     * Verifica se uma determinada coordenada se encontra adjacente (ou sobreposta) a este navio[cite: 2].
     *
     * @param pos a coordenada a verificar.
     * @return true se a coordenada tocar ou sobrepuser o navio, false caso contrário[cite: 2].
     */
    boolean tooCloseTo(IPosition pos);

    /**
     * Aplica um disparo a este navio na posição indicada, registando o dano caso acerte[cite: 4].
     *
     * @param pos a coordenada alvo do disparo[cite: 4].
     */
    void shoot(IPosition pos);
}