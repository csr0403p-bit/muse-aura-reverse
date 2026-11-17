package androidx.glance.appwidget.protobuf;

import X.AbstractC7609F5w;
import X.AbstractC9320GEb;
import X.AbstractC9351GFk;
import X.BV5;
import X.BV8;
import X.C9322GEd;
import X.C9323GEe;
import X.C9372GGi;
import X.C9399GHo;
import X.FGI;
import X.GEE;
import X.GG5;
import X.GG6;
import X.GHH;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class CodedOutputStream extends GHH {
    public static final Logger A01 = BV5.A1B(CodedOutputStream.class);
    public static final boolean A02 = C9399GHo.A03;
    public C9372GGi A00;

    public class OutOfSpaceException extends IOException {
        public static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private final void A0F(byte[] value, int offset, int length) throws IOException {
        if (!(this instanceof GG6)) {
            GG5 gg5 = (GG5) this;
            try {
                System.arraycopy(value, offset, gg5.A02, gg5.A00, length);
                gg5.A00 += length;
                return;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(FGI.A0M("CodedOutputStream was writing to a flat byte array and ran out of space.: ", String.format("Pos: %d, limit: %d, len: %d", BV8.A1b(Integer.valueOf(gg5.A00), gg5.A01, length))), e);
            }
        }
        GG6 gg6 = (GG6) this;
        int i = gg6.A02;
        int i2 = gg6.A00;
        int i3 = i - i2;
        byte[] bArr = gg6.A04;
        if (i3 >= length) {
            System.arraycopy(value, offset, bArr, i2, length);
            gg6.A00 += length;
        } else {
            System.arraycopy(value, offset, bArr, i2, i3);
            int i4 = offset + i3;
            length -= i3;
            gg6.A00 = i;
            gg6.A01 += i3;
            GG6.A00(gg6);
            if (length <= i) {
                System.arraycopy(value, i4, bArr, 0, length);
                gg6.A00 = length;
            } else {
                gg6.A03.write(value, i4, length);
            }
        }
        gg6.A01 += length;
    }

    public final void A02(byte value) throws IOException {
        if (!(this instanceof GG6)) {
            GG5 gg5 = (GG5) this;
            try {
                byte[] bArr = gg5.A02;
                int i = gg5.A00;
                gg5.A00 = i + 1;
                bArr[i] = value;
                return;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(FGI.A0D(Integer.valueOf(gg5.A00), gg5.A01), e);
            }
        }
        GG6 gg6 = (GG6) this;
        if (gg6.A00 == gg6.A02) {
            GG6.A00(gg6);
        }
        byte[] bArr2 = gg6.A04;
        int i2 = gg6.A00;
        gg6.A00 = i2 + 1;
        bArr2[i2] = value;
        gg6.A01++;
    }

    public final void A03(int value) throws IOException {
        if (this instanceof GG6) {
            GG6 gg6 = (GG6) this;
            GG6.A01(gg6, 4);
            gg6.A0G(value);
            return;
        }
        GG5 gg5 = (GG5) this;
        try {
            byte[] bArr = gg5.A02;
            int i = gg5.A00;
            int i2 = i + 1;
            gg5.A00 = i2;
            BV5.A1C(value, bArr, i);
            int i3 = i + 2;
            gg5.A00 = i3;
            BV5.A1C(value >> 8, bArr, i2);
            int i4 = i + 3;
            gg5.A00 = i4;
            BV5.A1C(value >> 16, bArr, i3);
            gg5.A00 = i + 4;
            BV5.A1C(value >> 24, bArr, i4);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(FGI.A0D(Integer.valueOf(gg5.A00), gg5.A01), e);
        }
    }

    public final void A04(int value) {
        if (this instanceof GG6) {
            GG6 gg6 = (GG6) this;
            GG6.A01(gg6, 5);
            gg6.A0H(value);
            return;
        }
        GG5 gg5 = (GG5) this;
        while (true) {
            int i = value & (-128);
            byte[] bArr = gg5.A02;
            if (i == 0) {
                int i2 = gg5.A00;
                gg5.A00 = i2 + 1;
                bArr[i2] = (byte) value;
                return;
            } else {
                try {
                    int i3 = gg5.A00;
                    gg5.A00 = i3 + 1;
                    BV5.A1C(value | 128, bArr, i3);
                    value >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(FGI.A0D(Integer.valueOf(gg5.A00), gg5.A01), e);
                }
            }
            throw new OutOfSpaceException(FGI.A0D(Integer.valueOf(gg5.A00), gg5.A01), e);
        }
    }

    public final void A05(int fieldNumber, int value) throws IOException {
        if (!(this instanceof GG6)) {
            A04((fieldNumber << 3) | 5);
            A03(value);
        } else {
            GG6 gg6 = (GG6) this;
            GG6.A01(gg6, 14);
            gg6.A0H((fieldNumber << 3) | 5);
            gg6.A0G(value);
        }
    }

    public final void A06(int fieldNumber, int value) throws IOException {
        if (!(this instanceof GG6)) {
            A04(fieldNumber << 3);
            if (value >= 0) {
                A04(value);
                return;
            } else {
                A0D(value);
                return;
            }
        }
        GG6 gg6 = (GG6) this;
        GG6.A01(gg6, 20);
        gg6.A0H(fieldNumber << 3);
        if (value >= 0) {
            gg6.A0H(value);
        } else {
            gg6.A0J(value);
        }
    }

    public final void A07(int fieldNumber, int value) throws IOException {
        if (!(this instanceof GG6)) {
            A04(fieldNumber << 3);
            A04(value);
        } else {
            GG6 gg6 = (GG6) this;
            GG6.A01(gg6, 20);
            gg6.A0H(fieldNumber << 3);
            gg6.A0H(value);
        }
    }

    public final void A08(int fieldNumber, long value) throws IOException {
        if (!(this instanceof GG6)) {
            A04((fieldNumber << 3) | 1);
            A0C(value);
        } else {
            GG6 gg6 = (GG6) this;
            GG6.A01(gg6, 18);
            gg6.A0H((fieldNumber << 3) | 1);
            gg6.A0I(value);
        }
    }

    public final void A09(int fieldNumber, long value) throws IOException {
        if (!(this instanceof GG6)) {
            A04(fieldNumber << 3);
            A0D(value);
        } else {
            GG6 gg6 = (GG6) this;
            GG6.A01(gg6, 20);
            gg6.A0H(fieldNumber << 3);
            gg6.A0J(value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.GG5, androidx.glance.appwidget.protobuf.CodedOutputStream] */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.glance.appwidget.protobuf.CodedOutputStream] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.GG6, androidx.glance.appwidget.protobuf.CodedOutputStream] */
    public final void A0A(int fieldNumber, String value) throws IOException {
        ?? r6;
        int iA01;
        int iA00;
        int iA012;
        if (this instanceof GG6) {
            r6 = (GG6) this;
            GHH.A02(r6, fieldNumber);
            try {
                int length = value.length();
                int i = length * 3;
                int iA05 = AbstractC7609F5w.A05(i);
                int i2 = iA05 + i;
                int i3 = r6.A02;
                if (i2 > i3) {
                    byte[] bArr = new byte[i];
                    int iA013 = GEE.A00.A01(value, bArr, 0, i);
                    r6.A04(iA013);
                    r6.A0F(bArr, 0, iA013);
                    return;
                }
                if (i2 > i3 - r6.A00) {
                    GG6.A00(r6);
                }
                int iA052 = AbstractC7609F5w.A05(length);
                int i4 = r6.A00;
                try {
                    try {
                        if (iA052 == iA05) {
                            int i5 = i4 + iA052;
                            r6.A00 = i5;
                            iA012 = GEE.A00.A01(value, r6.A04, i5, i3 - i5);
                            r6.A00 = i4;
                            iA00 = (iA012 - i4) - iA052;
                            r6.A0H(iA00);
                        } else {
                            iA00 = GEE.A00(value);
                            r6.A0H(iA00);
                            iA012 = GEE.A00.A01(value, r6.A04, r6.A00, iA00);
                        }
                        r6.A00 = iA012;
                        r6.A01 += iA00;
                        return;
                    } catch (Utf8$UnpairedSurrogateException e) {
                        r6.A01 -= r6.A00 - i4;
                        r6.A00 = i4;
                        throw e;
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
                }
            } catch (Utf8$UnpairedSurrogateException e3) {
                e = e3;
            }
        } else {
            r6 = (GG5) this;
            GHH.A02(r6, fieldNumber);
            int i6 = r6.A00;
            try {
                int length2 = value.length();
                int iA053 = AbstractC7609F5w.A05(length2 * 3);
                int iA054 = AbstractC7609F5w.A05(length2);
                if (iA054 == iA053) {
                    int i7 = i6 + iA054;
                    r6.A00 = i7;
                    iA01 = GEE.A00.A01(value, r6.A02, i7, r6.A01 - i7);
                    r6.A00 = i6;
                    r6.A04((iA01 - i6) - iA054);
                } else {
                    r6.A04(GEE.A00(value));
                    byte[] bArr2 = r6.A02;
                    int i8 = r6.A00;
                    iA01 = GEE.A00.A01(value, bArr2, i8, r6.A01 - i8);
                }
                r6.A00 = iA01;
                return;
            } catch (Utf8$UnpairedSurrogateException e4) {
                e = e4;
                r6.A00 = i6;
            } catch (IndexOutOfBoundsException e5) {
                throw new OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.", e5);
            }
        }
        A01.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
        byte[] bytes = value.getBytes(AbstractC9351GFk.A04);
        try {
            int length3 = bytes.length;
            r6.A04(length3);
            r6.A0F(bytes, 0, length3);
        } catch (IndexOutOfBoundsException e6) {
            throw new OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.", e6);
        }
    }

    public final void A0B(int i, boolean z) throws IOException {
        if (!(this instanceof GG6)) {
            A04(i << 3);
            A02(z ? (byte) 1 : (byte) 0);
            return;
        }
        GG6 gg6 = (GG6) this;
        GG6.A01(gg6, 11);
        gg6.A0H(i << 3);
        byte b = z ? (byte) 1 : (byte) 0;
        byte[] bArr = gg6.A04;
        int i2 = gg6.A00;
        gg6.A00 = i2 + 1;
        bArr[i2] = b;
        gg6.A01++;
    }

    public final void A0C(long value) throws IOException {
        if (this instanceof GG6) {
            GG6 gg6 = (GG6) this;
            GG6.A01(gg6, 8);
            gg6.A0I(value);
            return;
        }
        GG5 gg5 = (GG5) this;
        try {
            byte[] bArr = gg5.A02;
            int i = gg5.A00;
            int i2 = i + 1;
            gg5.A00 = i2;
            BV5.A1C((int) value, bArr, i);
            int i3 = i + 2;
            gg5.A00 = i3;
            AbstractC7609F5w.A15(value, bArr, 8, i2);
            int i4 = i + 3;
            gg5.A00 = i4;
            AbstractC7609F5w.A15(value, bArr, 16, i3);
            int i5 = i + 4;
            gg5.A00 = i5;
            AbstractC7609F5w.A15(value, bArr, 24, i4);
            int i6 = i + 5;
            gg5.A00 = i6;
            AbstractC7609F5w.A15(value, bArr, 32, i5);
            int i7 = i + 6;
            gg5.A00 = i7;
            AbstractC7609F5w.A15(value, bArr, 40, i6);
            int i8 = i + 7;
            gg5.A00 = i8;
            AbstractC7609F5w.A15(value, bArr, 48, i7);
            gg5.A00 = i + 8;
            AbstractC7609F5w.A15(value, bArr, 56, i8);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(FGI.A0D(Integer.valueOf(gg5.A00), gg5.A01), e);
        }
    }

    public final void A0D(long value) throws IOException {
        if (this instanceof GG6) {
            GG6 gg6 = (GG6) this;
            GG6.A01(gg6, 10);
            gg6.A0J(value);
            return;
        }
        GG5 gg5 = (GG5) this;
        if (!A02 || gg5.A01 - gg5.A00 < 10) {
            while (true) {
                long j = value & (-128);
                byte[] bArr = gg5.A02;
                if (j == 0) {
                    int i = gg5.A00;
                    gg5.A00 = i + 1;
                    bArr[i] = (byte) value;
                    return;
                } else {
                    try {
                        int i2 = gg5.A00;
                        gg5.A00 = i2 + 1;
                        BV5.A1C(((int) value) | 128, bArr, i2);
                        value >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(FGI.A0D(Integer.valueOf(gg5.A00), gg5.A01), e);
                    }
                }
                throw new OutOfSpaceException(FGI.A0D(Integer.valueOf(gg5.A00), gg5.A01), e);
            }
        }
        while (true) {
            long j2 = value & (-128);
            byte[] bArr2 = gg5.A02;
            int i3 = gg5.A00;
            gg5.A00 = i3 + 1;
            long j3 = i3;
            int i4 = (int) value;
            if (j2 == 0) {
                C9399GHo.A07(bArr2, (byte) i4, j3);
                return;
            } else {
                C9399GHo.A07(bArr2, (byte) ((i4 | 128) & 255), j3);
                value >>>= 7;
            }
        }
    }

    public final void A0E(AbstractC9320GEb fieldNumber, int value) throws IOException {
        GHH.A02(this, value);
        A04(fieldNumber.A02());
        C9322GEd c9322GEd = (C9322GEd) fieldNumber;
        A0F(c9322GEd.bytes, c9322GEd instanceof C9323GEe ? ((C9323GEe) c9322GEd).bytesOffset : 0, c9322GEd.A02());
    }
}
