package X;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class DCx {
    public static final byte[] A01 = A01("RIFF");
    public static final byte[] A00 = A01("WEBP");
    public static final byte[] A04 = A01("VP8 ");
    public static final byte[] A02 = A01("VP8L");
    public static final byte[] A03 = A01("VP8X");

    public static final boolean A00(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 != null && bArr != null) {
            int length = bArr2.length;
            if (length + i <= bArr.length) {
                Iterable aDq = new ADq(0, length - 1);
                if (!(aDq instanceof Collection) || !((Collection) aDq).isEmpty()) {
                    Iterator<Integer> it = aDq.iterator();
                    while (it.hasNext()) {
                        int iA00 = ((BNt) it).A00();
                        if (bArr[iA00 + i] != bArr2[iA00]) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final byte[] A01(String str) {
        try {
            return str.getBytes(C7384Etj.A0M("ASCII"));
        } catch (UnsupportedEncodingException e) {
            throw BV4.A0d("ASCII not found!", e);
        }
    }
}
