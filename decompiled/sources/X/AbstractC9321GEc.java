package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.GEc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9321GEc implements Iterable<Byte>, Serializable {
    public static final AbstractC9321GEc A00 = new C9324GEf(AbstractC9352GFl.A05);
    public static final GEU A01;
    public static final long serialVersionUID = 1;
    public int hash = 0;

    public final AbstractC9321GEc A03(int i) {
        C9324GEf c9324GEf = (C9324GEf) this;
        int iA00 = A00(0, i, c9324GEf.A02());
        if (iA00 == 0) {
            return A00;
        }
        return new C9325GEg(c9324GEf.bytes, c9324GEf instanceof C9325GEg ? ((C9325GEg) c9324GEf).bytesOffset : 0, iA00);
    }

    public abstract boolean equals(Object o);

    static {
        A01 = (GEB.A00 == null || GEB.A01) ? new GES() : new GET();
    }

    public static int A00(int startIndex, int endIndex, int size) {
        int i = endIndex - startIndex;
        if ((startIndex | endIndex | i | (size - endIndex)) >= 0) {
            return i;
        }
        if (startIndex < 0) {
            throw FGI.A05(startIndex);
        }
        if (endIndex < startIndex) {
            throw C8j3.A0y("Beginning index larger than ending index: ", ", ", startIndex, endIndex);
        }
        throw C8j3.A0y("End index: ", " >= ", endIndex, size);
    }

    public static C9324GEf A01(byte[] bytes, int offset, int size) {
        A00(offset, offset + size, bytes.length);
        return new C9324GEf(A01.A7O(bytes, offset, size));
    }

    public final int A02() {
        C9324GEf c9324GEf = (C9324GEf) this;
        return c9324GEf instanceof C9325GEg ? ((C9325GEg) c9324GEf).bytesLength : c9324GEf.bytes.length;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int iA02 = A02();
            C9324GEf c9324GEf = (C9324GEf) this;
            byte[] bArr = c9324GEf.bytes;
            int i2 = c9324GEf instanceof C9325GEg ? ((C9325GEg) c9324GEf).bytesOffset : 0;
            i = iA02;
            Charset charset = AbstractC9352GFl.A04;
            for (int i3 = i2; i3 < i2 + iA02; i3++) {
                i = (i * 31) + bArr[i3];
            }
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new I11(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String strA0x = BV7.A0x(this);
        int iA02 = A02();
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", strA0x, Integer.valueOf(iA02), iA02 <= 50 ? HkX.A00(this) : FGI.A0M(HkX.A00(A03(47)), "..."));
    }

    public final byte[] A04() {
        int iA02 = A02();
        if (iA02 == 0) {
            return AbstractC9352GFl.A05;
        }
        byte[] bArr = new byte[iA02];
        C9324GEf c9324GEf = (C9324GEf) this;
        if (!(c9324GEf instanceof C9325GEg)) {
            System.arraycopy(c9324GEf.bytes, 0, bArr, 0, iA02);
            return bArr;
        }
        C9325GEg c9325GEg = (C9325GEg) c9324GEf;
        System.arraycopy(c9325GEg.bytes, c9325GEg.bytesOffset, bArr, 0, iA02);
        return bArr;
    }
}
