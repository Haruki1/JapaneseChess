public abstract class Tile {
    public enum color {
        WHITE, BLACK;
    }

    protected final int tileCoordinate;
    protected final color spalva;
    protected Piece pieceOnTile;

    public Tile(int tileCoordinate, color spalva, Piece pieceOnTile){
        this.tileCoordinate = tileCoordinate;
        this.spalva = spalva;
        this.pieceOnTile = pieceOnTile;
    }

    public abstract Piece getPiece();

    public class EmptyTile extends Tile {
        public EmptyTile(int tileCoordinate, color spalva) {
            this.tileCoordinate = tileCoordinate;
            this.spalva = spalva;
            pieceOnTile = null;
        }

        public Piece getPiece(){
            return null;
        }
    }
    public class OccupiedTile extends Tile {
        public OccupiedTIle(int tileCoordinate, color spalva, Piece pieceOnTile) {
            super(tileCoordinate, spalva, pieceOnTile);
        }

        public Piece getPiece() {
            return pieceOnTile;
        }
    }
}
