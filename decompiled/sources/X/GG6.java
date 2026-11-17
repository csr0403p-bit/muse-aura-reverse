package X;

import androidx.glance.appwidget.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public final class GG6 extends CodedOutputStream {
    public int A00;
    public int A01;
    public final int A02;
    public final OutputStream A03;
    public final byte[] A04;

    public static void A00(GG6 gg6) throws IOException {
        gg6.A03.write(gg6.A04, 0, gg6.A00);
        gg6.A00 = 0;
    }

    public static void A01(GG6 gg6, int i) throws IOException {
        if (gg6.A02 - gg6.A00 < i) {
            A00(gg6);
        }
    }

    public final void A0G(int value) {
        byte[] bArr = this.A04;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        BV5.A1C(value, bArr, i);
        int i3 = i + 2;
        this.A00 = i3;
        BV5.A1C(value >> 8, bArr, i2);
        int i4 = i + 3;
        this.A00 = i4;
        BV5.A1C(value >> 16, bArr, i3);
        this.A00 = i + 4;
        BV5.A1C(value >> 24, bArr, i4);
        this.A01 += 4;
    }

    public final void A0H(int value) {
        byte[] bArr;
        int i;
        int i2;
        byte[] bArr2;
        long j;
        if (CodedOutputStream.A02) {
            long j2 = this.A00;
            while (true) {
                int i3 = value & (-128);
                bArr2 = this.A04;
                int i4 = this.A00;
                this.A00 = i4 + 1;
                j = i4;
                if (i3 == 0) {
                    break;
                }
                C9399GHo.A07(bArr2, (byte) ((value | 128) & 255), j);
                value >>>= 7;
            }
            C9399GHo.A07(bArr2, (byte) value, j);
            i2 = this.A01 + ((int) (this.A00 - j2));
        } else {
            while (true) {
                int i5 = value & (-128);
                bArr = this.A04;
                i = this.A00;
                this.A00 = i + 1;
                if (i5 == 0) {
                    break;
                }
                BV5.A1C(value | 128, bArr, i);
                this.A01++;
                value >>>= 7;
            }
            bArr[i] = (byte) value;
            i2 = this.A01 + 1;
        }
        this.A01 = i2;
    }

    public final void A0I(long value) {
        byte[] bArr = this.A04;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        bArr[i] = (byte) (value & 255);
        int i3 = i + 2;
        this.A00 = i3;
        bArr[i2] = (byte) ((value >> 8) & 255);
        int i4 = i + 3;
        this.A00 = i4;
        bArr[i3] = (byte) ((value >> 16) & 255);
        int i5 = i + 4;
        this.A00 = i5;
        bArr[i4] = (byte) (255 & (value >> 24));
        int i6 = i + 5;
        this.A00 = i6;
        AbstractC7609F5w.A15(value, bArr, 32, i5);
        int i7 = i + 6;
        this.A00 = i7;
        AbstractC7609F5w.A15(value, bArr, 40, i6);
        int i8 = i + 7;
        this.A00 = i8;
        AbstractC7609F5w.A15(value, bArr, 48, i7);
        this.A00 = i + 8;
        AbstractC7609F5w.A15(value, bArr, 56, i8);
        this.A01 += 8;
    }

    public final void A0J(long value) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        long j;
        int i4;
        if (CodedOutputStream.A02) {
            long j2 = this.A00;
            while (true) {
                long j3 = value & (-128);
                bArr2 = this.A04;
                int i5 = this.A00;
                this.A00 = i5 + 1;
                j = i5;
                i4 = (int) value;
                if (j3 == 0) {
                    break;
                }
                C9399GHo.A07(bArr2, (byte) ((i4 | 128) & 255), j);
                value >>>= 7;
            }
            C9399GHo.A07(bArr2, (byte) i4, j);
            i3 = this.A01 + ((int) (this.A00 - j2));
        } else {
            while (true) {
                long j4 = value & (-128);
                bArr = this.A04;
                i = this.A00;
                this.A00 = i + 1;
                i2 = (int) value;
                if (j4 == 0) {
                    break;
                }
                BV5.A1C(i2 | 128, bArr, i);
                this.A01++;
                value >>>= 7;
            }
            bArr[i] = (byte) i2;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public GG6(OutputStream out, int bufferSize) {
        if (bufferSize < 0) {
            throw C60O.A0i("bufferSize must be >= 0");
        }
        int iMax = Math.max(bufferSize, 20);
        this.A04 = new byte[iMax];
        this.A02 = iMax;
        if (out == null) {
            throw BV4.A0a("out");
        }
        this.A03 = out;
    }
}
