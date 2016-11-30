public abstract class Tile {
    public enum color {
        WHITE, BLACK;
    }

    public Tile(int tileCoordinate, color spalva, Piece pieceOnTile){
        this.tileCoordinate = tileCoordinate;
        this.spalva = spalva;
        this.pieceOnTile = pieceOnTile;
    }

    protected final int tileCoordinate;
    protected final color spalva;
    protected Piece pieceOnTile;

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
    public class OccupiedTIle extends Tile {
        public OccupiedTIle(int tileCoordinate, color spalva, Piece pieceOnTile) {
            super(tileCoordinate, spalva, pieceOnTile);
        }

        public Piece getPiece() {
            return pieceOnTile;
        }
    }
}
