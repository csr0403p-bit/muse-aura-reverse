package X;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.Gmb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9964Gmb extends OutputStream implements InterfaceC10184Gqu {
    public static final byte[] A05 = new byte[0];
    public int A00;
    public byte[] A01;
    public int A02;
    public final HjR A03;
    public final LinkedList<byte[]> A04;

    public C9964Gmb() {
        this((HjR) null);
    }

    public final void A01() {
        this.A02 = 0;
        this.A00 = 0;
        LinkedList<byte[]> linkedList = this.A04;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.clear();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public static void A00(C9964Gmb c9964Gmb) {
        int i = c9964Gmb.A02;
        byte[] bArr = c9964Gmb.A01;
        int length = i + bArr.length;
        if (length < 0) {
            throw C3cG.A0Q("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        c9964Gmb.A02 = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        c9964Gmb.A04.add(bArr);
        c9964Gmb.A01 = new byte[iMax];
        c9964Gmb.A00 = 0;
    }

    public final void A02(int i) {
        if (this.A00 >= this.A01.length) {
            A00(this);
        }
        byte[] bArr = this.A01;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final void A03(int i) {
        int i2 = this.A00;
        int i3 = i2 + 2;
        byte[] bArr = this.A01;
        if (i3 >= bArr.length) {
            A02(i >> 16);
            A02(i >> 8);
            A02(i);
            return;
        }
        int i4 = i2 + 1;
        this.A00 = i4;
        bArr[i2] = (byte) (i >> 16);
        int i5 = i2 + 2;
        this.A00 = i5;
        bArr[i4] = (byte) (i >> 8);
        this.A00 = i2 + 3;
        bArr[i5] = (byte) i;
    }

    public final void A04(int i) {
        int i2 = this.A00;
        int i3 = i2 + 1;
        byte[] bArr = this.A01;
        if (i3 >= bArr.length) {
            A02(i >> 8);
            A02(i);
        } else {
            this.A00 = i3;
            bArr[i2] = (byte) (i >> 8);
            this.A00 = i2 + 2;
            bArr[i3] = (byte) i;
        }
    }

    public final byte[] A05() {
        int i = this.A02 + this.A00;
        if (i == 0) {
            return A05;
        }
        byte[] bArr = new byte[i];
        LinkedList<byte[]> linkedList = this.A04;
        Iterator<byte[]> it = linkedList.iterator();
        int iA0O = 0;
        while (it.hasNext()) {
            iA0O = AbstractC7610F5x.A0O(bArr, it, iA0O);
        }
        System.arraycopy(this.A01, 0, bArr, iA0O, this.A00);
        int i2 = iA0O + this.A00;
        if (i2 != i) {
            throw BV4.A0c(FGI.A0Y("Internal error: total len assumed to be ", ", copied ", " bytes", i, i2));
        }
        if (linkedList.isEmpty()) {
            return bArr;
        }
        A01();
        return bArr;
    }

    @Override // X.InterfaceC10184Gqu
    public final HjR A5N() {
        return this.A03;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public C9964Gmb(byte[] bArr, int i) {
        this.A04 = BV4.A0y();
        this.A03 = null;
        this.A01 = bArr;
        this.A00 = i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        while (true) {
            byte[] bArr2 = this.A01;
            int length = bArr2.length;
            int i3 = this.A00;
            int iMin = Math.min(length - i3, i2);
            if (iMin > 0) {
                System.arraycopy(bArr, i, bArr2, i3, iMin);
                i += iMin;
                this.A00 += iMin;
                i2 -= iMin;
            }
            if (i2 <= 0) {
                return;
            } else {
                A00(this);
            }
        }
    }

    public C9964Gmb(HjR hjR) {
        byte[] bArrA00;
        this.A04 = BV4.A0y();
        this.A03 = hjR;
        if (hjR == null) {
            bArrA00 = new byte[500];
        } else {
            bArrA00 = HjR.A00(hjR, 2);
        }
        this.A01 = bArrA00;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        A02(i);
    }

    public C9964Gmb(int i) {
        this.A04 = BV4.A0y();
        this.A03 = null;
        this.A01 = new byte[i];
    }
}
