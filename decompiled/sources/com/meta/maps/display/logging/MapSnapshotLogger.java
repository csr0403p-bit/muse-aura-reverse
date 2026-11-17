package com.meta.maps.display.logging;

import X.C06H;
import com.meta.maps.NativeBase;
import com.meta.maps.core.Analytics;

/* loaded from: classes4.dex */
public final class MapSnapshotLogger extends NativeBase {
    public static final Companion Companion = new Companion();
    public String caller;
    public String surfaceId;
    public SurfaceType surfaceType;

    private final native void cacheThisInstance();

    public static final native long create();

    public static final native void disposeNativeHandle(long j);

    public final native String getCaller();

    public final native String getSurfaceId();

    public final native SurfaceType getSurfaceType();

    public final native void setAnalytics(Analytics analytics);

    public final native void setCaller(String str);

    public final native void setSurfaceId(String str);

    public final native void setSurfaceType(SurfaceType surfaceType);

    public final native void snapshotFinished(String str, String str2, boolean z, boolean z2, GeoDisplayErrorCategory geoDisplayErrorCategory, String str3, int i, int i2, int i3, double d, double d2);

    public final native String snapshotStarted();

    public final class Companion implements NativeBase.Disposer {
        public final long create() {
            return MapSnapshotLogger.create();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            MapSnapshotLogger.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            MapSnapshotLogger.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }

    public MapSnapshotLogger(long j, Object obj) {
        super(j, Companion);
    }

    public MapSnapshotLogger() {
        super(create(), Companion);
        cacheThisInstance();
    }
}
