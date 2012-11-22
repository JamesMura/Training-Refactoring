package problem2;

public enum Direction {
    NORTH {
        @Override
        public Direction turnRight() {
            return EAST;
        }

        @Override
        public Direction turnLeft() {
            return WEST;
        }
    }, SOUTH {
        @Override
        public Direction turnRight() {
            return WEST;
        }

        @Override
        public Direction turnLeft() {
            return EAST;
        }
    }, EAST {
        @Override
        public Direction turnRight() {
            return SOUTH;
        }

        @Override
        public Direction turnLeft() {
            return NORTH;
        }
    }, WEST {
        @Override
        public Direction turnRight() {
            return NORTH;
        }

        @Override
        public Direction turnLeft() {
            return SOUTH;
        }
    };


    public abstract Direction turnRight();

    public abstract Direction turnLeft();
}
