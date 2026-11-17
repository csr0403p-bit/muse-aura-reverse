package X;

import java.math.BigInteger;
import java.util.Map;

/* renamed from: X.EYt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6759EYt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[LOOP:1: B:26:0x008d->B:28:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2 A[EDGE_INSN: B:45:0x00a2->B:29:0x00a2 BREAK  A[LOOP:1: B:26:0x008d->B:28:0x0095], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.math.BigInteger A00(java.lang.CharSequence r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6759EYt.A00(java.lang.CharSequence, int, int):java.math.BigInteger");
    }

    public static BigInteger A01(CharSequence charSequence, Map map, int i, int i2) {
        int i3 = i2 - i;
        if (i3 <= 400) {
            return A00(charSequence, i, i2);
        }
        BigInteger bigInteger = EXL.A00;
        int i4 = i2 - (((i3 + 31) >>> 5) << 4);
        return A01(charSequence, map, i4, i2).add(EZI.A05(A01(charSequence, map, i, i4), (BigInteger) BV5.A0f(map, i2 - i4)));
    }
}
