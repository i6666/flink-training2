package org.apache.flink.training.exercises.common.datatypes;


import org.apache.flink.training.exercises.common.utils.GeoUtils;

public class EnrichedRide extends TaxiRide {
    public int startCell;
    public int endCell;


    public EnrichedRide(TaxiRide ride) {
        this.rideId = ride.rideId;
        this.isStart = ride.isStart;
        this.startCell = GeoUtils.mapToGridCell(ride.startLon, ride.startLat);
        this.endCell = GeoUtils.mapToGridCell(ride.endLon, ride.endLat);
    }
    @Override
    public String toString() {
        return "EnrichedRide{" +
                super.toString() +
                ", startCell=" + startCell +
                ", endCell=" + endCell +
                '}';
    }
}
