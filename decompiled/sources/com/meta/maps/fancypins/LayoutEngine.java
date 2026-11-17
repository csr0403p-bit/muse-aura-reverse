package com.meta.maps.fancypins;

import X.C06H;
import com.meta.maps.NativeBase;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class LayoutEngine extends NativeBase {
    public static final Companion Companion = new Companion();

    private final native void cacheThisInstance();

    public static final native long create();

    public static final native void disposeNativeHandle(long j);

    public final native void registerBlueprint(byte[] bArr);

    public final native List<PinLayout> solveLayouts(List<FancyPinFrameState> list);

    public final native void updateMeasurements(List<PinMeasurement> list);

    public final native void updatePins(Map<String, String> map);

    public final class Companion implements NativeBase.Disposer {
        public Companion() {
        }

        public final long create() {
            return LayoutEngine.create();
        }

        private final void disposeNativeHandle(long j) {
            LayoutEngine.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            LayoutEngine.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public LayoutEngine() {
        super(create(), Companion);
        cacheThisInstance();
    }

    public LayoutEngine(long j, Object obj) {
        super(j, Companion);
    }
}
