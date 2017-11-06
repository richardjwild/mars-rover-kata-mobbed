package com.marsmission;

public class MarsVector {
    public final Coordinate coordinate;
    public final Bearing bearing;

    public MarsVector(Coordinate coordinate, Bearing bearing) {
        this.coordinate = coordinate;
        this.bearing = bearing;
    }

    @Override public String toString() {
        return "MarsVector{" +
            "coordinate=" + coordinate +
            ", bearing=" + bearing +
            '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarsVector that = (MarsVector) o;

        if (coordinate != null ? !coordinate.equals(that.coordinate) : that.coordinate != null) return false;
        return bearing == that.bearing;
    }

    @Override public int hashCode() {
        int result = coordinate != null ? coordinate.hashCode() : 0;
        result = 31 * result + (bearing != null ? bearing.hashCode() : 0);
        return result;
    }
}
