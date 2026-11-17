package com.facebook.imagepipeline.memory;

import X.AbstractC3588CVo;
import X.BV4;
import X.BV7;
import X.BV8;
import X.C3463COl;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.CVs;
import X.EC0;
import X.FGI;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class NativeMemoryChunk implements Closeable, EC0 {
    public static final CVs Companion = new CVs();
    public boolean _isClosed;
    public final long mNativePtr;
    public final int mSize;

    public static final native long nativeAllocate(int i);

    public static final native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    public static final native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    public static final native void nativeFree(long j);

    public static final native void nativeMemcpy(long j, long j2, int i);

    public static final native byte nativeReadByte(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable, X.EC0
    public synchronized void close() {
        if (!this._isClosed) {
            this._isClosed = true;
            nativeFree(this.mNativePtr);
        }
    }

    @Override // X.EC0
    public void copy(int i, EC0 ec0, int i2, int i3) {
        C7384Etj.A0Y(ec0, 1);
        long uniqueId = ec0.getUniqueId();
        long j = this.mNativePtr;
        if (uniqueId == j) {
            Log.w("NativeMemoryChunk", FGI.A0j("Copying from NativeMemoryChunk ", BV7.A0x(this), " to NativeMemoryChunk ", BV7.A0x(ec0), " which share the same address ", Long.toHexString(j)));
            throw BV4.A0O();
        }
        if (uniqueId < j) {
            synchronized (ec0) {
                synchronized (this) {
                    doCopy(i, ec0, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (ec0) {
                    doCopy(i, ec0, i2, i3);
                }
            }
        }
    }

    @Override // X.EC0
    public synchronized boolean isClosed() {
        return this._isClosed;
    }

    @Override // X.EC0
    public synchronized byte read(int i) {
        if (isClosed()) {
            throw BV4.A0S();
        }
        if (i < 0) {
            throw BV4.A0O();
        }
        if (i >= this.mSize) {
            throw BV4.A0O();
        }
        return nativeReadByte(this.mNativePtr + i);
    }

    @Override // X.EC0
    public synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int iA03;
        C7384Etj.A0Y(bArr, 1);
        if (isClosed()) {
            throw BV4.A0S();
        }
        int i4 = this.mSize;
        iA03 = BV8.A03(i4, i, i3);
        AbstractC3588CVo.A00(i, bArr.length, i2, iA03, i4);
        nativeCopyFromByteArray(this.mNativePtr + i, bArr, i2, iA03);
        return iA03;
    }

    static {
        C3463COl.loadLibrary("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        if (i <= 0) {
            throw BV4.A0O();
        }
        this.mNativePtr = nativeAllocate(i);
        this.mSize = i;
        this._isClosed = false;
    }

    private final void doCopy(int i, EC0 ec0, int i2, int i3) {
        if (!(ec0 instanceof NativeMemoryChunk)) {
            throw C60O.A0i("Cannot copy two incompatible MemoryChunks");
        }
        if (isClosed()) {
            throw C3cG.A0Q("Check failed.");
        }
        NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) ec0;
        if (nativeMemoryChunk.isClosed()) {
            throw C3cG.A0Q("Check failed.");
        }
        AbstractC3588CVo.A00(i, nativeMemoryChunk.mSize, i2, i3, this.mSize);
        nativeMemcpy(nativeMemoryChunk.mNativePtr + i2, this.mNativePtr + i, i3);
    }

    @Override // X.EC0
    public ByteBuffer getByteBuffer() {
        return null;
    }

    @Override // X.EC0
    public long getNativePtr() {
        return this.mNativePtr;
    }

    @Override // X.EC0
    public int getSize() {
        return this.mSize;
    }

    @Override // X.EC0
    public long getUniqueId() {
        return this.mNativePtr;
    }

    public void finalize() {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", FGI.A0U("finalize: Chunk ", BV7.A0x(this), " still active. "));
        close();
    }

    public NativeMemoryChunk() {
        this.mNativePtr = 0L;
        this.mSize = 0;
        this._isClosed = true;
    }

    @Override // X.EC0
    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int iA03;
        C7384Etj.A0Y(bArr, 1);
        if (!isClosed()) {
            int i4 = this.mSize;
            iA03 = BV8.A03(i4, i, i3);
            AbstractC3588CVo.A00(i, bArr.length, i2, iA03, i4);
            nativeCopyToByteArray(this.mNativePtr + i, bArr, i2, iA03);
        } else {
            throw BV4.A0S();
        }
        return iA03;
    }
}
