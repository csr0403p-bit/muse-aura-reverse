package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class DIP implements DID {
    public static final Integer A06 = C79.A00;
    public IntBuffer A01;
    public C4960DIi A02;
    public DIV A03;
    public final F18 A05;
    public final ReentrantLock A04 = new ReentrantLock();
    public int A00 = 1;

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a5, code lost:
    
        throw X.BV5.A0g("Unsupported type: ", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.DIS[] A02(X.DIT r23, java.io.RandomAccessFile r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DIP.A02(X.DIT, java.io.RandomAccessFile, long, long):X.DIS[]");
    }

    @Override // X.DIA
    public final void AaO(int i, int i2, String str, long j) {
    }

    private final int A00(int i, int i2) {
        int i3;
        C4960DIi c4960DIi = this.A02;
        int i4 = -1;
        if (c4960DIi != null) {
            int i5 = 0;
            while (true) {
                int iA01 = ((c4960DIi.A00 * i5) + C4960DIi.A01(c4960DIi, i, i2, i5)) * 3;
                IntBuffer intBuffer = c4960DIi.A01;
                intBuffer.position(iA01);
                int i6 = intBuffer.get();
                int i7 = intBuffer.get();
                if (i != i6 || i2 != i7) {
                    i5++;
                    if (i5 >= 2) {
                        break;
                    }
                } else {
                    int i8 = intBuffer.get();
                    if (i8 != 0 && (i3 = (1879048192 & i8) >>> 28) < 5) {
                        i4 = i8 & 268435455;
                        boolean zA1L = AnonymousClass002.A1L(i8 & Integer.MIN_VALUE);
                        C4960DIi c4960DIi2 = this.A02;
                        C7384Etj.A0X(c4960DIi2);
                        int i9 = ((i3 + 1) << 28) | i4;
                        if (zA1L) {
                            i9 |= Integer.MIN_VALUE;
                        }
                        c4960DIi2.A03(i, i2, i9);
                    }
                }
            }
        }
        return i4;
    }

    private final void A01(RandomAccessFile randomAccessFile, long j) {
        DI8.A01("qpl.cr.ResilientMarkersStorage2.createFile.file");
        ReentrantLock reentrantLock = this.A04;
        reentrantLock.lock();
        int i = ((int) j) + 16;
        int i2 = 2400 + i;
        try {
            randomAccessFile.seek(j);
            randomAccessFile.writeInt(3);
            randomAccessFile.writeInt(i2);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(-1);
            FileChannel channel = randomAccessFile.getChannel();
            FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
            this.A01 = channel.map(mapMode, j, 16L).asIntBuffer();
            this.A02 = new C4960DIi(randomAccessFile.getChannel().map(mapMode, i, 2400L));
            this.A03 = new DIV(randomAccessFile.getChannel().map(mapMode, i2, 1048L));
        } catch (IOException unused) {
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
        reentrantLock.unlock();
        DI8.A00();
    }

    @Override // X.DID
    public final long AL6() {
        return 3464L;
    }

    @Override // X.DID
    public final Integer AL7() {
        return A06;
    }

    @Override // X.DID
    public final int AL8() {
        return 2;
    }

    @Override // X.DIA
    public final void AaK(int i, int i2, String str, int i3) {
        DIV div;
        ReentrantLock reentrantLock = this.A04;
        reentrantLock.lock();
        try {
            int iA00 = A00(i, i2);
            if (iA00 != -1 && (div = this.A03) != null) {
                ByteBuffer byteBuffer = DIV.A04;
                byteBuffer.position(0);
                byteBuffer.putInt(i3);
                DIV.A00(div, str, byteBuffer.array(), iA00, 1);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.DIA
    public final void AaL(int i, int i2, String str, String str2) {
        DIV div;
        ReentrantLock reentrantLock = this.A04;
        reentrantLock.lock();
        try {
            int iA00 = A00(i, i2);
            if (iA00 != -1 && (div = this.A03) != null) {
                if (str2 == null) {
                    str2 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
                }
                DIV.A00(div, str, str2.getBytes(), iA00, 0);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.DIA
    public final void AaN(int i, int i2) {
        ReentrantLock reentrantLock = this.A04;
        reentrantLock.lock();
        try {
            C4960DIi c4960DIi = this.A02;
            if (c4960DIi != null) {
                c4960DIi.A02(i, i2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.DIA
    public final void AaP(int i, int i2, boolean z) {
        ReentrantLock reentrantLock = this.A04;
        reentrantLock.lock();
        try {
            C4960DIi c4960DIi = this.A02;
            if (c4960DIi != null) {
                int i3 = this.A00 + 1;
                this.A00 = i3;
                if ((1879048192 & i3) != 0) {
                    this.A00 = 1;
                    i3 = 1;
                }
                if (z) {
                    i3 |= Integer.MIN_VALUE;
                }
                c4960DIi.A03(i, i2, i3);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.DIA
    public final void AaQ() {
        ReentrantLock reentrantLock = this.A04;
        reentrantLock.lock();
        try {
            C4960DIi c4960DIi = this.A02;
            if (c4960DIi != null) {
                IntBuffer intBuffer = c4960DIi.A01;
                intBuffer.position(0);
                int i = 0;
                do {
                    int i2 = 0;
                    while (true) {
                        int i3 = c4960DIi.A00;
                        if (i2 >= i3) {
                            break;
                        }
                        int i4 = intBuffer.get();
                        intBuffer.get();
                        int i5 = intBuffer.get();
                        if (i4 != 0 && i5 != 0 && (i5 & Integer.MIN_VALUE) != 0) {
                            int iPosition = intBuffer.position();
                            intBuffer.position(((i * i3) + i2) * 3);
                            intBuffer.put(C4960DIi.A02);
                            intBuffer.position(iPosition);
                        }
                        i2++;
                    }
                    i++;
                } while (i < 2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.DIA
    public final void AaR(int i, int i2, boolean z) {
        int iA02;
        ReentrantLock reentrantLock = this.A04;
        reentrantLock.lock();
        try {
            C4960DIi c4960DIi = this.A02;
            if (c4960DIi != null && (iA02 = c4960DIi.A02(i, i2)) != 0) {
                int i3 = iA02 & 268435455;
                int i4 = (iA02 & 1879048192) >>> 28;
                C4960DIi c4960DIi2 = this.A02;
                C7384Etj.A0X(c4960DIi2);
                int i5 = i3 | (i4 << 28);
                if (z) {
                    i5 |= Integer.MIN_VALUE;
                }
                c4960DIi2.A03(i, i2, i5);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public DIP(F18 f18) {
        this.A05 = f18;
    }

    @Override // X.DID
    public final void ANg(File file, String str) {
        AnonymousClass003.A0u(file, str);
        String strA0U = FGI.A0U(file.getAbsolutePath(), "/qpl_v2_", str);
        DI8.A01("qpl.cr.ResilientMarkersStorage2.createFile.filename");
        ReentrantLock reentrantLock = this.A04;
        reentrantLock.lock();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(strA0U, "rw");
            try {
                A01(randomAccessFile, 0L);
                randomAccessFile.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
        reentrantLock.unlock();
        DI8.A00();
    }

    @Override // X.DIA
    public final void AeJ(DHu dHu) {
    }

    @Override // X.DID
    public final void ANh(RandomAccessFile randomAccessFile, long j) {
        A01(randomAccessFile, j);
    }

    @Override // X.DIA
    public final void AaM(int i, int i2) {
        AaN(i, i2);
    }
}
