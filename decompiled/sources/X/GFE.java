package X;

import androidx.health.platform.client.proto.CodedOutputStream$OutOfSpaceException;
import androidx.health.platform.client.proto.Utf8$UnpairedSurrogateException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class GFE extends AbstractC9345GFe {
    public static final Logger A04 = BV5.A1B(GFE.class);
    public static final boolean A05 = C9401GHq.A03;
    public int A00;
    public GFD A01;
    public final int A02;
    public final byte[] A03;

    public static final void A00(GFE gfe, byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, gfe.A03, gfe.A00, i2);
            gfe.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(FGI.A0M("CodedOutputStream was writing to a flat byte array and ran out of space.: ", String.format("Pos: %d, limit: %d, len: %d", BV8.A1b(Integer.valueOf(gfe.A00), gfe.A02, i2))), e);
        }
    }

    public final void A01(byte value) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            this.A00 = i + 1;
            bArr[i] = value;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(FGI.A0D(Integer.valueOf(this.A00), this.A02), e);
        }
    }

    public final void A02(int value) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.A03;
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
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(FGI.A0D(Integer.valueOf(this.A00), this.A02), e);
        }
    }

    public final void A03(int value) throws CodedOutputStream$OutOfSpaceException {
        if (value >= 0) {
            A04(value);
        } else {
            A06(value);
        }
    }

    public final void A04(int value) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i = value & (-128);
            byte[] bArr = this.A03;
            if (i == 0) {
                int i2 = this.A00;
                this.A00 = i2 + 1;
                bArr[i2] = (byte) value;
                return;
            } else {
                try {
                    int i3 = this.A00;
                    this.A00 = i3 + 1;
                    BV5.A1C(value | 128, bArr, i3);
                    value >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(FGI.A0D(Integer.valueOf(this.A00), this.A02), e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(FGI.A0D(Integer.valueOf(this.A00), this.A02), e);
        }
    }

    public final void A05(long value) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            int i2 = i + 1;
            this.A00 = i2;
            BV5.A1C((int) value, bArr, i);
            int i3 = i + 2;
            this.A00 = i3;
            AbstractC7609F5w.A15(value, bArr, 8, i2);
            int i4 = i + 3;
            this.A00 = i4;
            AbstractC7609F5w.A15(value, bArr, 16, i3);
            int i5 = i + 4;
            this.A00 = i5;
            AbstractC7609F5w.A15(value, bArr, 24, i4);
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
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(FGI.A0D(Integer.valueOf(this.A00), this.A02), e);
        }
    }

    public final void A06(long value) throws CodedOutputStream$OutOfSpaceException {
        if (!A05 || this.A02 - this.A00 < 10) {
            while (true) {
                long j = value & (-128);
                byte[] bArr = this.A03;
                if (j == 0) {
                    int i = this.A00;
                    this.A00 = i + 1;
                    bArr[i] = (byte) value;
                    return;
                } else {
                    try {
                        int i2 = this.A00;
                        this.A00 = i2 + 1;
                        BV5.A1C(((int) value) | 128, bArr, i2);
                        value >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new CodedOutputStream$OutOfSpaceException(FGI.A0D(Integer.valueOf(this.A00), this.A02), e);
                    }
                }
                throw new CodedOutputStream$OutOfSpaceException(FGI.A0D(Integer.valueOf(this.A00), this.A02), e);
            }
        }
        while (true) {
            long j2 = value & (-128);
            byte[] bArr2 = this.A03;
            int i3 = this.A00;
            this.A00 = i3 + 1;
            long j3 = i3;
            int i4 = (int) value;
            if (j2 == 0) {
                C9401GHq.A05(bArr2, (byte) i4, j3);
                return;
            } else {
                C9401GHq.A05(bArr2, (byte) ((i4 | 128) & 255), j3);
                value >>>= 7;
            }
        }
    }

    public final void A08(String value) throws CodedOutputStream$OutOfSpaceException {
        int iA01;
        int i = this.A00;
        try {
            int length = value.length();
            int iA05 = AbstractC7609F5w.A05(length * 3);
            int iA052 = AbstractC7609F5w.A05(length);
            if (iA052 == iA05) {
                int i2 = i + iA052;
                this.A00 = i2;
                iA01 = GE5.A00.A01(value, this.A03, i2, this.A02 - i2);
                this.A00 = i;
                A04((iA01 - i) - iA052);
            } else {
                A04(GE5.A00(value));
                byte[] bArr = this.A03;
                int i3 = this.A00;
                iA01 = GE5.A00.A01(value, bArr, i3, this.A02 - i3);
            }
            this.A00 = iA01;
        } catch (Utf8$UnpairedSurrogateException e) {
            this.A00 = i;
            A04.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = value.getBytes(AbstractC9349GFi.A04);
            try {
                int length2 = bytes.length;
                A04(length2);
                A00(this, bytes, 0, length2);
            } catch (IndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.", e3);
        }
    }

    public GFE() {
    }

    public final void A07(final GEY value) throws CodedOutputStream$OutOfSpaceException {
        A04(value.A01());
        C9319GEa c9319GEa = (C9319GEa) value;
        A00(this, c9319GEa.bytes, c9319GEa instanceof GEZ ? ((GEZ) c9319GEa).bytesOffset : 0, c9319GEa.A01());
    }

    public GFE(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A03 = bArr;
            this.A00 = 0;
            this.A02 = i;
            return;
        }
        throw BV5.A0T("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", AbstractC7611F5y.A1C(length, 0, i));
    }
}
