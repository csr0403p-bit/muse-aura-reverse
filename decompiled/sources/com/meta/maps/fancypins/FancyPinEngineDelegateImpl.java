package com.meta.maps.fancypins;

import X.C06H;
import com.meta.maps.NativeBase;
import java.util.List;

/* loaded from: classes6.dex */
public final class FancyPinEngineDelegateImpl extends NativeBase implements FancyPinEngineDelegate {
    public static final Companion Companion = new Companion();

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.fancypins.FancyPinEngineDelegate
    public native void onEngineFrameRendered();

    @Override // com.meta.maps.fancypins.FancyPinEngineDelegate
    public native void onVariantTableUpdated(List<String> list);

    public final class Companion implements NativeBase.Disposer {
        public Companion() {
        }

        private final void disposeNativeHandle(long j) {
            FancyPinEngineDelegateImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            FancyPinEngineDelegateImpl.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public FancyPinEngineDelegateImpl(long j, Object obj) {
        super(j, Companion);
    }
}
