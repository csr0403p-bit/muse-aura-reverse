package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public class MaplibrePlugin extends NativeBase {
    public static final Companion Companion = new Companion();
    public final long ptr;

    public static final native void disposeNativeHandle(long j);

    public final native long getPtr();

    public MaplibrePlugin(long j, Object obj) {
        super(j, Companion);
    }

    public final class Companion implements NativeBase.Disposer {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            MaplibrePlugin.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            MaplibrePlugin.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }
}
