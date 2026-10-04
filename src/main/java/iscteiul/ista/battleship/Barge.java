/**
 *
 */
public class Barge extends Ship {

    /**
     * Dimensão da barca (número de posições ocupadas na grelha).
     */
    private static final Integer SIZE = 1;

    /**
     * Nome do navio na versão da época dos Descobrimentos.
     */
    private static final String NAME = "Barca";

    /**
     * Constrói uma nova instância de Barca com a orientação e a posição inicial especificadas.
     *
     * @param bearing a orientação da barca (ponto cardeal)
     * @param pos     a coordenada inicial (canto superior esquerdo) da barca na grelha
     */
    public Barge(Compass bearing, IPosition pos) {
        super(Barge.NAME, bearing, pos);
        getPositions().add(new Position(pos.getRow(), pos.getColumn()));
    }

    /**
     * Obtém o tamanho da barca.
     *
     * @return o número de posições ocupadas por este navio (sempre 1)
     */
    @Override
    public Integer getSize() {
        return SIZE;
    }

}
