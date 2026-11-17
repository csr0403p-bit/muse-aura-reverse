package com.meta.maps.core;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes6.dex */
public final class EarthWorld extends NativeBase {
    public static final Companion Companion = new Companion();
    public static final double RADIUS = 6371009.0d;
    public static final String name = null;

    public final class Companion implements NativeBase.Disposer {
        public static /* synthetic */ void getName$annotations() {
        }

        public Companion() {
        }

        public final GeoCoordinates ecefToGeo(Vec3d vec3d) {
            return EarthWorld.ecefToGeo(vec3d);
        }

        public final Vec3d geoToEcef(GeoCoordinates geoCoordinates) {
            return EarthWorld.geoToEcef(geoCoordinates);
        }

        public final WVec3d geoToEcefW(GeoCoordinates geoCoordinates) {
            return EarthWorld.geoToEcefW(geoCoordinates);
        }

        public final String getName() {
            return EarthWorld.getName();
        }

        private final void disposeNativeHandle(long j) {
            EarthWorld.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            EarthWorld.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static final native void disposeNativeHandle(long j);

    public static final native GeoCoordinates ecefToGeo(Vec3d vec3d);

    public static final native Vec3d geoToEcef(GeoCoordinates geoCoordinates);

    public static final native WVec3d geoToEcefW(GeoCoordinates geoCoordinates);

    public static final native String getName();

    public EarthWorld(long j, Object obj) {
        super(j, Companion);
    }
}
