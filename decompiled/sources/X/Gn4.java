package X;

/* loaded from: classes6.dex */
public final class Gn4 {
    public static final char[] A02 = AbstractC10006Gne.A01(true);
    public static final byte[] A01 = AbstractC10006Gne.A00(true);
    public static final Gn4 A00 = new Gn4();

    public static int A00(int i, int i2) {
        if (i2 < 56320 || i2 > 57343) {
            throw FGI.A01("Broken surrogate pair: first char 0x", Integer.toHexString(i), ", second 0x", Integer.toHexString(i2), "; illegal combination");
        }
        return ((i << 10) + i2) - 56613888;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r6 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        return java.util.Arrays.copyOfRange(r5, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        r6.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        return r6.A05();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] A01(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gn4.A01(java.lang.String):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] A02(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gn4.A02(java.lang.String):byte[]");
    }
}
