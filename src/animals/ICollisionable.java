package animals;

public interface ICollisionable {
    int[] getPosition();
    int[] getSize();
    int MAX = 3;

    default boolean hasCollisioned(ICollisionable otherObject) {
        {
            int[] otherObjectPosition = otherObject.getPosition();
            int[] thisObjectPosition = this.getPosition();
            int[] otherObjectSize = otherObject.getSize();
            int[] thisObjectSize = this.getSize();

            boolean collisionX = otherObjectPosition[0] + otherObjectSize[0] > thisObjectPosition[0] 
                && otherObjectPosition[0] < thisObjectPosition[0] + thisObjectSize[0] ;
            // y
            boolean collisionY = otherObjectPosition[1] + otherObjectSize[1] > thisObjectPosition[1] 
                && otherObjectPosition[1] < thisObjectPosition[1] + thisObjectSize[1] ;
            return collisionX && collisionY;
        }
    }
}
