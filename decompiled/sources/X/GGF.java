package X;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException;
import com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class GGF extends GHJ {
    public static final Logger A04 = BV5.A1B(GGF.class);
    public static final boolean A05 = C9402GHr.A03;
    public int A00;
    public GHX A01;
    public final int A02;
    public final byte[] A03;

    private final void A08(byte[] value, int offset, int length) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(value, offset, this.A03, this.A00, length);
            this.A00 += length;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e, this.A00, this.A02, length);
        }
    }

    public final void A00(byte value) throws CodedOutputStream$OutOfSpaceException {
        int i;
        int i2 = this.A00;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.A03[i2] = value;
            this.A00 = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new CodedOutputStream$OutOfSpaceException(e, i2, this.A02, 1);
        }
    }

    public final void A01(int value) {
        int i = this.A00;
        try {
            byte[] bArr = this.A03;
            bArr[i] = (byte) value;
            bArr[i + 1] = (byte) (value >> 8);
            bArr[i + 2] = (byte) (value >> 16);
            bArr[i + 3] = (byte) (value >> 24);
            this.A00 = i + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e, i, this.A02, 4);
        }
    }

    public final void A02(int value) {
        int i = this.A00;
        while (true) {
            int i2 = value & (-128);
            byte[] bArr = this.A03;
            int i3 = i + 1;
            byte b = (byte) value;
            if (i2 == 0) {
                bArr[i] = b;
                this.A00 = i3;
                return;
            } else {
                try {
                    bArr[i] = (byte) (value | 128);
                    value >>>= 7;
                    i = i3;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(e, i3, this.A02, 1);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(e, i3, this.A02, 1);
        }
    }

    public final void A03(final int fieldNumber, final int value) {
        A02(fieldNumber << 3);
        if (value >= 0) {
            A02(value);
        } else {
            A06(value);
        }
    }

    public final void A05(long value) {
        int i = this.A00;
        try {
            AbstractC7611F5y.A0c(value, this.A03, i);
            this.A00 = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e, i, this.A02, 8);
        }
    }

    public final void A06(long value) {
        byte[] bArr;
        int i;
        byte[] bArr2;
        long j;
        int i2 = this.A00;
        if (!A05 || this.A02 - i2 < 10) {
            while (true) {
                long j2 = value & (-128);
                bArr = this.A03;
                i = i2 + 1;
                if (j2 == 0) {
                    break;
                }
                try {
                    bArr[i2] = (byte) (((int) value) | 128);
                    value >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(e, i, this.A02, 1);
                }
                throw new CodedOutputStream$OutOfSpaceException(e, i, this.A02, 1);
            }
            bArr[i2] = (byte) value;
        } else {
            while (true) {
                long j3 = value & (-128);
                bArr2 = this.A03;
                i = i2 + 1;
                j = i2;
                if (j3 == 0) {
                    break;
                }
                C9402GHr.A07(bArr2, (byte) (((int) value) | 128), j);
                value >>>= 7;
                i2 = i;
            }
            C9402GHr.A07(bArr2, (byte) value, j);
        }
        this.A00 = i;
    }

    public GGF() {
    }

    public final void A04(final int fieldNumber, final String value) throws CodedOutputStream$OutOfSpaceException {
        int iA01;
        GHJ.A00(this, fieldNumber);
        int i = this.A00;
        try {
            int length = value.length();
            int iA05 = AbstractC7609F5w.A05(length * 3);
            int iA052 = AbstractC7609F5w.A05(length);
            if (iA052 == iA05) {
                int i2 = i + iA052;
                this.A00 = i2;
                iA01 = GEA.A00.A01(value, this.A03, i2, this.A02 - i2);
                this.A00 = i;
                A02((iA01 - i) - iA052);
            } else {
                A02(GEA.A00(value));
                byte[] bArr = this.A03;
                int i3 = this.A00;
                iA01 = GEA.A00.A01(value, bArr, i3, this.A02 - i3);
            }
            this.A00 = iA01;
        } catch (Utf8$UnpairedSurrogateException e) {
            this.A00 = i;
            A04.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = value.getBytes(AbstractC9352GFl.A04);
            try {
                int length2 = bytes.length;
                A02(length2);
                A08(bytes, 0, length2);
            } catch (IndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.", e3);
        }
    }

    public final void A07(final AbstractC9321GEc fieldNumber, final int value) throws CodedOutputStream$OutOfSpaceException {
        GHJ.A00(this, value);
        A02(fieldNumber.A02());
        C9324GEf c9324GEf = (C9324GEf) fieldNumber;
        A08(c9324GEf.bytes, c9324GEf instanceof C9325GEg ? ((C9325GEg) c9324GEf).bytesOffset : 0, c9324GEf.A02());
    }

    public GGF(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A03 = bArr;
            this.A00 = 0;
            this.A02 = i;
            return;
        }
        throw C60O.A0i(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", AbstractC7611F5y.A1C(length, 0, i)));
    }
}
