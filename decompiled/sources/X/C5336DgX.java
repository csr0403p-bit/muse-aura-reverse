package X;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: X.DgX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5336DgX implements E2K {
    public static final C5336DgX $redex_init_class = null;
    public int A00;
    public int A01;
    public long A02;
    public final C1L A04;
    public final long A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[4096];

    private final boolean A03(int i, boolean z) throws EOFException, InterruptedIOException {
        A01(i);
        int i2 = this.A00;
        int i3 = this.A01;
        int iA00 = i2 - i3;
        while (iA00 < i) {
            iA00 = A00(this.A03, i3, i, iA00, z);
            if (iA00 == -1) {
                return false;
            }
            i3 = this.A01;
            this.A00 = i3 + iA00;
        }
        this.A01 = i3 + i;
        return true;
    }

    @Override // X.E2K
    public final void A47(int i) throws EOFException, InterruptedIOException {
        A03(i, false);
    }

    @Override // X.E2K
    public final int AXh(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int iMin;
        A01(i2);
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = A00(this.A03, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.A00 += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.A03, this.A01, bArr, i, iMin);
        this.A01 += iMin;
        return iMin;
    }

    @Override // X.E2K
    public final void AXi(byte[] bArr, int i, int i2) {
        AXj(bArr, i, i2, false);
    }

    @Override // X.E2K
    public final boolean AZM(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.A00;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.A03, 0, bArr, i, iMin);
            A02(iMin);
        }
        while (iMin < i2) {
            if (iMin == -1) {
                return false;
            }
            iMin = A00(bArr, i, i2, iMin, z);
        }
        if (iMin == -1) {
            return false;
        }
        this.A02 += iMin;
        return true;
    }

    @Override // X.E2K
    public final void AbN() {
        this.A01 = 0;
    }

    @Override // X.E2K
    public final int Afj(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.A00, i);
        A02(iMin);
        if (iMin == 0) {
            iMin = A00(this.A06, 0, Math.min(i, 4096), 0, true);
        }
        if (iMin != -1) {
            this.A02 += iMin;
        }
        return iMin;
    }

    @Override // X.E2K
    public final void Afm(int i) throws EOFException, InterruptedIOException {
        Afn(i, false);
    }

    @Override // X.E2K
    public final boolean Afn(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.A00, i);
        A02(iMin);
        while (iMin < i) {
            if (iMin == -1) {
                return false;
            }
            iMin = A00(this.A06, -iMin, Math.min(i, 4096 + iMin), iMin, z);
        }
        if (iMin == -1) {
            return false;
        }
        this.A02 += iMin;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @Override // X.E2K, X.C1L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r11, int r12, int r13) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r10 = this;
            r6 = r10
            int r0 = r10.A00
            r10 = 0
            r7 = r11
            r8 = r12
            r9 = r13
            if (r0 == 0) goto L17
            int r1 = java.lang.Math.min(r0, r13)
            byte[] r0 = r6.A03
            java.lang.System.arraycopy(r0, r10, r11, r12, r1)
            r6.A02(r1)
            if (r1 != 0) goto L1c
        L17:
            r11 = 1
            int r1 = r6.A00(r7, r8, r9, r10, r11)
        L1c:
            r0 = -1
            if (r1 == r0) goto L25
            long r4 = r6.A02
            long r2 = (long) r1
            long r4 = r4 + r2
            r6.A02 = r4
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5336DgX.read(byte[], int, int):int");
    }

    @Override // X.E2K
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        AZM(bArr, i, i2, false);
    }

    static {
        C2369BVx.A00("media3.extractor");
    }

    private void A01(int i) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        int length = bArr.length;
        if (i2 > length) {
            this.A03 = Arrays.copyOf(bArr, BV5.A02(length * 2, i2 + 524288, 65536 + i2));
        }
    }

    private void A02(int i) {
        int i2 = this.A00 - i;
        this.A00 = i2;
        this.A01 = 0;
        byte[] bArr = this.A03;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.A03 = bArr2;
    }

    @Override // X.E2K
    public final long AIf() {
        return this.A02 + this.A01;
    }

    @Override // X.E2K
    public final long AIu() {
        return this.A02;
    }

    @Override // X.E2K
    public final long getLength() {
        return this.A05;
    }

    public C5336DgX(C1L c1l, long j, long j2) {
        this.A04 = c1l;
        this.A02 = j;
        this.A05 = j2;
    }

    private int A00(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.A04.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // X.E2K
    public final boolean AXj(byte[] bArr, int i, int i2, boolean z) {
        if (!A03(i2, z)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        return true;
    }
}
