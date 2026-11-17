package X;

import android.os.SharedMemory;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class CVq implements Closeable, EC0 {
    public SharedMemory A00;
    public ByteBuffer A01;
    public final long A02 = System.identityHashCode(this);

    @Override // java.io.Closeable, java.lang.AutoCloseable, X.EC0
    public final synchronized void close() {
        if (!isClosed()) {
            SharedMemory sharedMemory = this.A00;
            if (sharedMemory != null) {
                sharedMemory.close();
            }
            ByteBuffer byteBuffer = this.A01;
            if (byteBuffer != null) {
                SharedMemory.unmap(byteBuffer);
            }
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // X.EC0
    public final void copy(int i, EC0 ec0, int i2, int i3) {
        C7384Etj.A0Y(ec0, 1);
        long uniqueId = ec0.getUniqueId();
        long j = this.A02;
        if (uniqueId == j) {
            Log.w("AshmemMemoryChunk", FGI.A0h("Copying from AshmemMemoryChunk ", Long.toHexString(j), " to AshmemMemoryChunk ", Long.toHexString(uniqueId), " which are the same "));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x000a  */
    @Override // X.EC0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isClosed() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.nio.ByteBuffer r0 = r2.A01     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto La
            android.os.SharedMemory r1 = r2.A00     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            if (r1 != 0) goto Lb
        La:
            r0 = 1
        Lb:
            monitor-exit(r2)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CVq.isClosed():boolean");
    }

    @Override // X.EC0
    public final synchronized byte read(int i) {
        ByteBuffer byteBuffer;
        if (isClosed()) {
            throw BV4.A0S();
        }
        if (i >= 0 && i < getSize()) {
            byteBuffer = this.A01;
            if (byteBuffer == null) {
                throw BV4.A0U();
            }
        }
        throw BV4.A0O();
        return byteBuffer.get(i);
    }

    @Override // X.EC0
    public final synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int iA03;
        C7384Etj.A0Y(bArr, 1);
        if (this.A01 == null) {
            throw BV4.A0U();
        }
        iA03 = BV8.A03(getSize(), i, i3);
        AbstractC3588CVo.A00(i, bArr.length, i2, iA03, getSize());
        ByteBuffer byteBuffer = this.A01;
        C7384Etj.A0X(byteBuffer);
        byteBuffer.position(i);
        ByteBuffer byteBuffer2 = this.A01;
        C7384Etj.A0X(byteBuffer2);
        byteBuffer2.put(bArr, i2, iA03);
        return iA03;
    }

    private final void A00(int i, EC0 ec0, int i2, int i3) {
        if (!(ec0 instanceof CVq)) {
            throw C60O.A0i("Cannot copy two incompatible MemoryChunks");
        }
        if (isClosed()) {
            throw C3cG.A0Q("Check failed.");
        }
        CVq cVq = (CVq) ec0;
        if (cVq.isClosed()) {
            throw C3cG.A0Q("Check failed.");
        }
        if (this.A01 == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        if (cVq.A01 == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        AbstractC3588CVo.A00(i, cVq.getSize(), i2, i3, getSize());
        ByteBuffer byteBuffer = this.A01;
        C7384Etj.A0X(byteBuffer);
        byteBuffer.position(i);
        ByteBuffer byteBuffer2 = cVq.A01;
        C7384Etj.A0X(byteBuffer2);
        byteBuffer2.position(i2);
        byte[] bArr = new byte[i3];
        ByteBuffer byteBuffer3 = this.A01;
        C7384Etj.A0X(byteBuffer3);
        byteBuffer3.get(bArr, 0, i3);
        ByteBuffer byteBuffer4 = cVq.A01;
        C7384Etj.A0X(byteBuffer4);
        byteBuffer4.put(bArr, 0, i3);
    }

    @Override // X.EC0
    public final ByteBuffer getByteBuffer() {
        return this.A01;
    }

    @Override // X.EC0
    public final long getNativePtr() {
        throw C8j3.A18("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // X.EC0
    public final int getSize() {
        SharedMemory sharedMemory = this.A00;
        if (sharedMemory != null) {
            return sharedMemory.getSize();
        }
        throw BV4.A0U();
    }

    @Override // X.EC0
    public final long getUniqueId() {
        return this.A02;
    }

    @Override // X.EC0
    public final synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int iA03;
        C7384Etj.A0Y(bArr, 1);
        if (this.A01 != null) {
            iA03 = BV8.A03(getSize(), i, i3);
            AbstractC3588CVo.A00(i, bArr.length, i2, iA03, getSize());
            ByteBuffer byteBuffer = this.A01;
            C7384Etj.A0X(byteBuffer);
            byteBuffer.position(i);
            ByteBuffer byteBuffer2 = this.A01;
            C7384Etj.A0X(byteBuffer2);
            byteBuffer2.get(bArr, i2, iA03);
        } else {
            throw BV4.A0U();
        }
        return iA03;
    }
}
