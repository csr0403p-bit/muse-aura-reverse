package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.GEb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9320GEb implements Iterable<Byte>, Serializable {
    public static final AbstractC9320GEb A00 = new C9322GEd(AbstractC9351GFk.A05);
    public static final GER A01;
    public static final long serialVersionUID = 1;
    public int hash = 0;

    public final AbstractC9320GEb A03(int i) {
        C9322GEd c9322GEd = (C9322GEd) this;
        int iA00 = A00(0, i, c9322GEd.A02());
        if (iA00 == 0) {
            return A00;
        }
        return new C9323GEe(c9322GEd.bytes, c9322GEd instanceof C9323GEe ? ((C9323GEe) c9322GEd).bytesOffset : 0, iA00);
    }

    public final void A04(byte[] bArr, int i) {
        C9322GEd c9322GEd = (C9322GEd) this;
        if (!(c9322GEd instanceof C9323GEe)) {
            System.arraycopy(c9322GEd.bytes, 0, bArr, 0, i);
        } else {
            C9323GEe c9323GEe = (C9323GEe) c9322GEd;
            System.arraycopy(c9323GEe.bytes, c9323GEe.bytesOffset, bArr, 0, i);
        }
    }

    public abstract boolean equals(Object o);

    static {
        A01 = (GEF.A00 == null || GEF.A01) ? new GEP() : new GEQ();
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

    public static C9322GEd A01(byte[] bytes, int offset, int size) {
        A00(offset, offset + size, bytes.length);
        return new C9322GEd(A01.A7O(bytes, offset, size));
    }

    public final int A02() {
        C9322GEd c9322GEd = (C9322GEd) this;
        return c9322GEd instanceof C9323GEe ? ((C9323GEe) c9322GEd).bytesLength : c9322GEd.bytes.length;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int iA02 = A02();
            C9322GEd c9322GEd = (C9322GEd) this;
            byte[] bArr = c9322GEd.bytes;
            int i2 = c9322GEd instanceof C9323GEe ? ((C9323GEe) c9322GEd).bytesOffset : 0;
            i = iA02;
            Charset charset = AbstractC9351GFk.A04;
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
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", strA0x, Integer.valueOf(iA02), iA02 <= 50 ? HkV.A00(this) : FGI.A0M(HkV.A00(A03(47)), "..."));
    }
}
