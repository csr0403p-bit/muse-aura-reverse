package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class GEY implements Iterable<Byte>, Serializable {
    public static final GEX A00;
    public static final GEY A01 = new C9319GEa(AbstractC9349GFi.A05);
    public static final long serialVersionUID = 1;
    public int hash = 0;

    public final GEY A02(int i) {
        C9319GEa c9319GEa = (C9319GEa) this;
        int iA00 = A00(0, i, c9319GEa.A01());
        if (iA00 == 0) {
            return A01;
        }
        return new GEZ(c9319GEa.bytes, c9319GEa instanceof GEZ ? ((GEZ) c9319GEa).bytesOffset : 0, iA00);
    }

    public abstract boolean equals(Object o);

    static {
        A00 = (GE6.A00 == null || GE6.A01) ? new GEV() : new GEW();
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

    public final int A01() {
        C9319GEa c9319GEa = (C9319GEa) this;
        return c9319GEa instanceof GEZ ? ((GEZ) c9319GEa).bytesLength : c9319GEa.bytes.length;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int iA01 = A01();
            C9319GEa c9319GEa = (C9319GEa) this;
            byte[] bArr = c9319GEa.bytes;
            int i2 = c9319GEa instanceof GEZ ? ((GEZ) c9319GEa).bytesOffset : 0;
            i = iA01;
            Charset charset = AbstractC9349GFi.A04;
            for (int i3 = i2; i3 < i2 + iA01; i3++) {
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
        int iA01 = A01();
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", strA0x, Integer.valueOf(iA01), iA01 <= 50 ? HkW.A00(this) : FGI.A0M(HkW.A00(A02(47)), "..."));
    }
}
