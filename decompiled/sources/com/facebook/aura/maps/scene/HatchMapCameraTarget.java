package com.facebook.aura.maps.scene;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.maps.model.HatchMapCoordinate;
import com.meta.maps.core.GeoCoordinatesBoundingBox;
import com.meta.maps.display.SDKInsets;

/* loaded from: classes4.dex */
public interface HatchMapCameraTarget {

    public final class Bounds extends C06G implements HatchMapCameraTarget {
        public static final int $stable = 8;
        public final GeoCoordinatesBoundingBox bounds;
        public final SDKInsets padding;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Bounds) {
                    Bounds bounds = (Bounds) obj;
                    if (!C7384Etj.areEqual(this.bounds, bounds.bounds) || !C7384Etj.areEqual(this.padding, bounds.padding)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Bounds copy$default(Bounds bounds, GeoCoordinatesBoundingBox geoCoordinatesBoundingBox, SDKInsets sDKInsets, int i, Object obj) {
            if ((i & 1) != 0) {
                geoCoordinatesBoundingBox = bounds.bounds;
            }
            if ((i & 2) != 0) {
                sDKInsets = bounds.padding;
            }
            AnonymousClass003.A0u(geoCoordinatesBoundingBox, sDKInsets);
            return new Bounds(geoCoordinatesBoundingBox, sDKInsets);
        }

        public final GeoCoordinatesBoundingBox component1() {
            return this.bounds;
        }

        public final SDKInsets component2() {
            return this.padding;
        }

        public final GeoCoordinatesBoundingBox getBounds() {
            return this.bounds;
        }

        public final SDKInsets getPadding() {
            return this.padding;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.padding, AnonymousClass005.A0E(this.bounds));
        }

        public Bounds(GeoCoordinatesBoundingBox geoCoordinatesBoundingBox, SDKInsets sDKInsets) {
            AnonymousClass003.A0u(geoCoordinatesBoundingBox, sDKInsets);
            this.bounds = geoCoordinatesBoundingBox;
            this.padding = sDKInsets;
        }

        public final Bounds copy(GeoCoordinatesBoundingBox geoCoordinatesBoundingBox, SDKInsets sDKInsets) {
            AnonymousClass003.A0u(geoCoordinatesBoundingBox, sDKInsets);
            return new Bounds(geoCoordinatesBoundingBox, sDKInsets);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Point extends C06G implements HatchMapCameraTarget {
        public static final int $stable = 0;
        public final HatchMapCoordinate coordinate;
        public final double zoom;

        public Point(HatchMapCoordinate hatchMapCoordinate, double d) {
            C7384Etj.A0Y(hatchMapCoordinate, 0);
            this.coordinate = hatchMapCoordinate;
            this.zoom = d;
        }

        public final Point copy(HatchMapCoordinate hatchMapCoordinate, double d) {
            C7384Etj.A0Y(hatchMapCoordinate, 0);
            return new Point(hatchMapCoordinate, d);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Point) {
                    Point point = (Point) obj;
                    if (!C7384Etj.areEqual(this.coordinate, point.coordinate) || Double.compare(this.zoom, point.zoom) != 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Point copy$default(Point point, HatchMapCoordinate hatchMapCoordinate, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchMapCoordinate = point.coordinate;
            }
            if ((i & 2) != 0) {
                d = point.zoom;
            }
            C7384Etj.A0Y(hatchMapCoordinate, 0);
            return new Point(hatchMapCoordinate, d);
        }

        public final HatchMapCoordinate component1() {
            return this.coordinate;
        }

        public final double component2() {
            return this.zoom;
        }

        public final HatchMapCoordinate getCoordinate() {
            return this.coordinate;
        }

        public final double getZoom() {
            return this.zoom;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.coordinate) + AnonymousClass002.A0A(Double.doubleToLongBits(this.zoom));
        }

        public String toString() {
            return super.toString();
        }
    }
}
