package com.meta.maps.display;

import X.C06H;
import X.C7384Etj;
import com.meta.maps.NativeBase;

/* loaded from: classes6.dex */
public final class RemoteRenderSession extends NativeBase {
    public static final Companion Companion = new Companion();

    private final native void cacheThisInstance();

    public static final native long create(long j, long j2, String str);

    public static final native void disposeNativeHandle(long j);

    public final native void setShowUserPuck(boolean z);

    public final native void setStyleUrl(String str);

    public final native void start();

    public final native void stop();

    public final native void updateCamera(double d, double d2, float f, float f2, float f3);

    public final class Companion implements NativeBase.Disposer {
        public Companion() {
        }

        public final long create(long j, long j2, String str) {
            return RemoteRenderSession.create(j, j2, str);
        }

        private final void disposeNativeHandle(long j) {
            RemoteRenderSession.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            RemoteRenderSession.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public RemoteRenderSession(long j, Object obj) {
        super(j, Companion);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteRenderSession(long j, long j2, String str) {
        super(create(j, j2, str), Companion);
        C7384Etj.A0Y(str, 2);
        cacheThisInstance();
    }
}
