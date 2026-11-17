package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public final class GestureInteractionHandlerImpl extends NativeBase implements GestureInteractionHandler {
    public static final Companion Companion = new Companion();

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.display.GestureInteractionHandler
    public native boolean handleGesture(GestureInteraction gestureInteraction);

    public GestureInteractionHandlerImpl(long j, Object obj) {
        super(j, Companion);
    }

    public final class Companion implements NativeBase.Disposer {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            GestureInteractionHandlerImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            GestureInteractionHandlerImpl.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }
}
