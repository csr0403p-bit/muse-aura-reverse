package X;

import com.facebook.tigon.TigonXplatService;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.DBm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4884DBm extends InputStream {
    public int A00;
    public long A01;
    public Throwable A02;
    public final TigonXplatService A03;
    public final ArrayList<ByteBuffer> A04;
    public final Condition A05;
    public final ReentrantLock A06;
    public volatile boolean A07;
    public volatile boolean A08;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ReentrantLock reentrantLock = this.A06;
            reentrantLock.lock();
            ArrayList<ByteBuffer> arrayList = this.A04;
            Iterator<ByteBuffer> it = arrayList.iterator();
            while (it.hasNext()) {
                this.A03.releaseBodyBuffer(it.next());
            }
            arrayList.clear();
            Throwable th = this.A02;
            if (th != null) {
                throw new IOException(th);
            }
            this.A07 = true;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            this.A07 = true;
            this.A06.unlock();
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    private void A00() {
        ArrayList<ByteBuffer> arrayList = this.A04;
        if (!(!arrayList.isEmpty())) {
            throw BV4.A0T();
        }
        if (arrayList.get(0).hasRemaining()) {
            return;
        }
        this.A03.releaseBodyBuffer(arrayList.remove(0));
    }

    public final void A01() {
        try {
            ReentrantLock reentrantLock = this.A06;
            reentrantLock.lock();
            this.A08 = true;
            Throwable th = this.A02;
            this.A02 = th != null ? th : null;
            this.A05.signalAll();
            reentrantLock.unlock();
        } catch (Throwable th2) {
            this.A06.unlock();
            throw th2;
        }
    }

    public final void A02(Throwable th) {
        try {
            ReentrantLock reentrantLock = this.A06;
            reentrantLock.lock();
            this.A08 = true;
            Throwable th2 = this.A02;
            if (th2 != null) {
                th = th2;
            }
            this.A02 = th;
            this.A05.signalAll();
            reentrantLock.unlock();
        } catch (Throwable th3) {
            this.A06.unlock();
            throw th3;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            ReentrantLock reentrantLock = this.A06;
            reentrantLock.lock();
            Iterator<ByteBuffer> it = this.A04.iterator();
            int iRemaining = 0;
            while (it.hasNext()) {
                iRemaining += it.next().remaining();
            }
            reentrantLock.unlock();
            return iRemaining;
        } catch (Throwable th) {
            this.A06.unlock();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        Throwable th;
        ByteBuffer byteBuffer;
        try {
            ReentrantLock reentrantLock = this.A06;
            reentrantLock.lock();
            if (j <= 0) {
                reentrantLock.unlock();
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                ArrayList<ByteBuffer> arrayList = this.A04;
                if (arrayList.isEmpty() || (byteBuffer = (ByteBuffer) BV6.A0m(arrayList)) == null) {
                    break;
                }
                int iA01 = BV4.A01(byteBuffer.remaining(), j2);
                BV7.A1L(byteBuffer, iA01);
                j2 -= iA01;
                A00();
            }
            if (j == j2 && (th = this.A02) != null) {
                throw new IOException(th);
            }
            long j3 = j - j2;
            reentrantLock.unlock();
            return j3;
        } catch (Throwable th2) {
            this.A06.unlock();
            throw th2;
        }
    }

    public C4884DBm(TigonXplatService tigonXplatService) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A06 = reentrantLock;
        this.A05 = reentrantLock.newCondition();
        this.A04 = C3cG.A0h();
        this.A08 = false;
        this.A02 = null;
        this.A07 = false;
        this.A03 = tigonXplatService;
    }

    public final void finalize() {
        A01();
        ArrayList<ByteBuffer> arrayList = this.A04;
        Iterator<ByteBuffer> it = arrayList.iterator();
        while (it.hasNext()) {
            this.A03.releaseBodyBuffer(it.next());
        }
        arrayList.clear();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer;
        try {
            ReentrantLock reentrantLock = this.A06;
            reentrantLock.lock();
            while (!this.A08 && this.A04.isEmpty()) {
                this.A05.awaitUninterruptibly();
            }
            if (this.A08 && this.A04.isEmpty()) {
                Throwable th = this.A02;
                if (th == null) {
                    reentrantLock.unlock();
                    return -1;
                }
                throw new IOException(th);
            }
            int i3 = 0;
            if (i2 > 0) {
                int i4 = i2;
                do {
                    ArrayList<ByteBuffer> arrayList = this.A04;
                    if (arrayList.isEmpty() || (byteBuffer = arrayList.get(0)) == null) {
                        break;
                    }
                    int iMin = Math.min(byteBuffer.remaining(), i4);
                    byteBuffer.get(bArr, i, iMin);
                    i4 -= iMin;
                    i += iMin;
                    A00();
                } while (i4 > 0);
                i3 = i2 - i4;
            }
            reentrantLock.unlock();
            return i3;
        } catch (Throwable th2) {
            this.A06.unlock();
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            ReentrantLock reentrantLock = this.A06;
            reentrantLock.lock();
            while (!this.A08 && this.A04.isEmpty()) {
                this.A05.awaitUninterruptibly();
            }
            if (this.A08 && this.A04.isEmpty()) {
                Throwable th = this.A02;
                if (th == null) {
                    reentrantLock.unlock();
                    return -1;
                }
                throw new IOException(th);
            }
            ArrayList<ByteBuffer> arrayList = this.A04;
            if (!arrayList.isEmpty()) {
                ByteBuffer byteBuffer = (ByteBuffer) BV6.A0m(arrayList);
                if (byteBuffer.hasRemaining()) {
                    byte b = byteBuffer.get();
                    A00();
                    reentrantLock.unlock();
                    return b;
                }
                throw BV4.A0T();
            }
            throw BV4.A0T();
        } catch (Throwable th2) {
            this.A06.unlock();
            throw th2;
        }
    }
}
