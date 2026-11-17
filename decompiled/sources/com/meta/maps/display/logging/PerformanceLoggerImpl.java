package com.meta.maps.display.logging;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public final class PerformanceLoggerImpl extends NativeBase implements PerformanceLogger {
    public static final Companion Companion = new Companion();

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.display.logging.PerformanceLogger
    public native void endAllInstancesOfMarker(int i, short s);

    @Override // com.meta.maps.display.logging.PerformanceLogger
    public native boolean isMarkerOn(int i, int i2);

    @Override // com.meta.maps.display.logging.PerformanceLogger
    public native void markerAnnotate(int i, String str, String str2, int i2);

    @Override // com.meta.maps.display.logging.PerformanceLogger
    public native void markerEnd(int i, short s, int i2);

    @Override // com.meta.maps.display.logging.PerformanceLogger
    public native void markerPoint(int i, String str, int i2, int i3);

    @Override // com.meta.maps.display.logging.PerformanceLogger
    public native void markerStart(int i, int i2);

    public PerformanceLoggerImpl(long j, Object obj) {
        super(j, Companion);
    }

    public final class Companion implements NativeBase.Disposer {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            PerformanceLoggerImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            PerformanceLoggerImpl.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }
}
