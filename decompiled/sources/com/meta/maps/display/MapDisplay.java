package com.meta.maps.display;

import X.C06H;
import X.C7384Etj;
import com.meta.maps.NativeBase;

/* loaded from: classes6.dex */
public final class MapDisplay extends NativeBase {
    public static final Companion Companion = new Companion();

    private final native void cacheThisInstance();

    public static final native long create(long j, long j2, float f, String str);

    public static final native void disposeNativeHandle(long j);

    public final native MapsPluginContainer getPluginContainer();

    public final native void loadStyle(String str);

    public final native boolean saveImage(String str);

    public final native void setCamera(double d, double d2, double d3, double d4, double d5);

    public final native boolean waitForMapLoad();

    public final class Companion implements NativeBase.Disposer {
        public final long create(long j, long j2, float f, String str) {
            return MapDisplay.create(j, j2, f, str);
        }

        public Companion() {
        }

        private final void disposeNativeHandle(long j) {
            MapDisplay.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            MapDisplay.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public MapDisplay(long j, Object obj) {
        super(j, Companion);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapDisplay(long j, long j2, float f, String str) {
        super(create(j, j2, f, str), Companion);
        C7384Etj.A0Y(str, 3);
        cacheThisInstance();
    }
}
