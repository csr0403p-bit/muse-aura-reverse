package com.meta.maps.core;

import X.C06H;
import X.C7384Etj;
import com.meta.maps.NativeBase;

/* loaded from: classes6.dex */
public final class IOBuf extends NativeBase {
    public static final Companion Companion = new Companion();
    public final long ptr;
    public final long size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IOBuf(byte[] bArr) {
        super(makeFrom(bArr), Companion);
        C7384Etj.A0Y(bArr, 0);
        cacheThisInstance();
    }

    private final native void cacheThisInstance();

    public static final native void disposeNativeHandle(long j);

    public static final native long make(long j);

    public static final native long makeFrom(byte[] bArr);

    public final native long getPtr();

    public final native long getSize();

    public final native byte[] toData();

    public final class Companion implements NativeBase.Disposer {
        public Companion() {
        }

        public final long make(long j) {
            return IOBuf.make(j);
        }

        public final long makeFrom(byte[] bArr) {
            return IOBuf.makeFrom(bArr);
        }

        private final void disposeNativeHandle(long j) {
            IOBuf.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            IOBuf.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public IOBuf(long j, Object obj) {
        super(j, Companion);
    }

    public IOBuf(long j) {
        super(make(j), Companion);
        cacheThisInstance();
    }
}
