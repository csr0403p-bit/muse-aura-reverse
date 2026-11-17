package X;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.CVp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3589CVp implements Closeable, EC0 {
    public ByteBuffer A00;
    public final int A01;
    public final long A02 = System.identityHashCode(this);

    @Override // java.io.Closeable, java.lang.AutoCloseable, X.EC0
    public final synchronized void close() {
        this.A00 = null;
    }

    @Override // X.EC0
    public final void copy(int i, EC0 ec0, int i2, int i3) {
        C7384Etj.A0Y(ec0, 1);
        long uniqueId = ec0.getUniqueId();
        long j = this.A02;
        if (uniqueId == j) {
            Log.w("BufferMemoryChunk", FGI.A0h("Copying from BufferMemoryChunk ", Long.toHexString(j), " to BufferMemoryChunk ", Long.toHexString(uniqueId), " which are the same "));
            throw BV4.A0O();
        }
        if (uniqueId < j) {
            synchronized (ec0) {
                synchronized (this) {
                    A00(i, ec0, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (ec0) {
                    A00(i, ec0, i2, i3);
                }
            }
        }
    }

    @Override // X.EC0
    public final synchronized ByteBuffer getByteBuffer() {
        return this.A00;
    }

    @Override // X.EC0
    public final synchronized boolean isClosed() {
        return AnonymousClass002.A1Y(getByteBuffer());
    }

    @Override // X.EC0
    public final synchronized byte read(int i) {
        ByteBuffer byteBuffer;
        if (isClosed()) {
            throw BV4.A0S();
        }
        if (i < 0) {
            throw BV4.A0O();
        }
        if (i >= this.A01) {
            throw BV4.A0O();
        }
        if (getByteBuffer() == null) {
            throw BV4.A0U();
        }
        byteBuffer = getByteBuffer();
        C7384Etj.A0X(byteBuffer);
        return byteBuffer.get(i);
    }

    @Override // X.EC0
    public final synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int iA03;
        C7384Etj.A0Y(bArr, 1);
        if (isClosed()) {
            throw BV4.A0S();
        }
        if (getByteBuffer() == null) {
            throw BV4.A0U();
        }
        int i4 = this.A01;
        iA03 = BV8.A03(i4, i, i3);
        AbstractC3588CVo.A00(i, bArr.length, i2, iA03, i4);
        ByteBuffer byteBuffer = getByteBuffer();
        C7384Etj.A0X(byteBuffer);
        byteBuffer.position(i);
        ByteBuffer byteBuffer2 = getByteBuffer();
        C7384Etj.A0X(byteBuffer2);
        byteBuffer2.put(bArr, i2, iA03);
        return iA03;
    }

    private final void A00(int i, EC0 ec0, int i2, int i3) {
        if (!(ec0 instanceof C3589CVp)) {
            throw C60O.A0i("Cannot copy two incompatible MemoryChunks");
        }
        if (isClosed()) {
            throw C3cG.A0Q("Check failed.");
        }
        C3589CVp c3589CVp = (C3589CVp) ec0;
        if (c3589CVp.isClosed()) {
            throw C3cG.A0Q("Check failed.");
        }
        if (getByteBuffer() == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        AbstractC3588CVo.A00(i, c3589CVp.A01, i2, i3, this.A01);
        ByteBuffer byteBuffer = getByteBuffer();
        C7384Etj.A0X(byteBuffer);
        byteBuffer.position(i);
        ByteBuffer byteBuffer2 = c3589CVp.getByteBuffer();
        if (byteBuffer2 == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        byteBuffer2.position(i2);
        byte[] bArr = new byte[i3];
        ByteBuffer byteBuffer3 = getByteBuffer();
        C7384Etj.A0X(byteBuffer3);
        byteBuffer3.get(bArr, 0, i3);
        byteBuffer2.put(bArr, 0, i3);
    }

    @Override // X.EC0
    public final long getNativePtr() {
        throw C8j3.A18("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // X.EC0
    public final int getSize() {
        return this.A01;
    }

    @Override // X.EC0
    public final long getUniqueId() {
        return this.A02;
    }

    public C3589CVp(int i) {
        this.A01 = i;
        this.A00 = ByteBuffer.allocateDirect(i);
    }

    @Override // X.EC0
    public final synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int iA03;
        C7384Etj.A0Y(bArr, 1);
        if (!isClosed()) {
            if (getByteBuffer() != null) {
                int i4 = this.A01;
                iA03 = BV8.A03(i4, i, i3);
                AbstractC3588CVo.A00(i, bArr.length, i2, iA03, i4);
                ByteBuffer byteBuffer = getByteBuffer();
                C7384Etj.A0X(byteBuffer);
                byteBuffer.position(i);
                ByteBuffer byteBuffer2 = getByteBuffer();
                C7384Etj.A0X(byteBuffer2);
                byteBuffer2.get(bArr, i2, iA03);
            } else {
                throw BV4.A0U();
            }
        } else {
            throw BV4.A0S();
        }
        return iA03;
    }
}
