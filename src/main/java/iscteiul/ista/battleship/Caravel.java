package iscteiul.ista.battleship;

/**
 * Represents a Caravel (<i>Caravela</i>), one of the ships of the Discoveries
 * Battleship Game.
 * <p>
 * A Caravel occupies exactly {@value #SIZE} consecutive positions on the board.
 * Each player has three Caravels in their fleet.
 * </p>
 *
 * @see Ship
 * @see Compass
 * @see IPosition
 */
public class Caravel extends Ship {

    /** Number of board positions occupied by a Caravel. */
    private static final Integer SIZE = 2;

    /** Name of this type of ship, as used in the game. */
    private static final String NAME = "Caravela";

    /**
     * Creates a Caravel with its first position at {@code pos} and extending
     * in the direction given by {@code bearing}.
     * <ul>
     *   <li>{@code NORTH} or {@code SOUTH}: the ship occupies two consecutive
     *   rows, in the same column, starting at {@code pos}.</li>
     *   <li>{@code EAST} or {@code WEST}: the ship occupies two consecutive
     *   columns, in the same row, starting at {@code pos}.</li>
     * </ul>
     *
     * @param bearing the bearing where the Caravel heads to; must not be
     *                {@code null} and must be one of {@code NORTH},
     *                {@code SOUTH}, {@code EAST} or {@code WEST}
     * @param pos     initial position for placing the Caravel
     * @throws NullPointerException     if {@code bearing} is {@code null}
     * @throws IllegalArgumentException if {@code bearing} is not a valid
     *                                  bearing for this ship
     */
    public Caravel(Compass bearing, IPosition pos) throws NullPointerException, IllegalArgumentException {
        super(Caravel.NAME, bearing, pos);

        if (bearing == null)
            throw new NullPointerException("ERROR! invalid bearing for the caravel");

        switch (bearing) {
            case NORTH:
            case SOUTH:
                for (int r = 0; r < SIZE; r++)
                    getPositions().add(new Position(pos.getRow() + r, pos.getColumn()));
                break;
            case EAST:
            case WEST:
                for (int c = 0; c < SIZE; c++)
                    getPositions().add(new Position(pos.getRow(), pos.getColumn() + c));
                break;
            default:
                throw new IllegalArgumentException("ERROR! invalid bearing for the caravel");
        }

    }

    /**
     * Returns the size of the Caravel, that is, the number of board positions
     * it occupies.
     *
     * @return the size of the Caravel (always {@value #SIZE})
     * @see Ship#getSize()
     */
    @Override
    public Integer getSize() {
        return SIZE;
    }

}
