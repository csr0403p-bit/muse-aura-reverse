package X;

/* renamed from: X.EYw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6762EYw {
    static {
        byte[] bArr = EZ1.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0129 A[Catch: ArithmeticException -> 0x02b2, PHI: r17
  0x0129: PHI (r17v3 boolean) = (r17v2 boolean), (r17v5 boolean) binds: [B:86:0x0123, B:88:0x0127] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {ArithmeticException -> 0x02b2, blocks: (B:3:0x0008, B:9:0x001b, B:18:0x0036, B:21:0x0043, B:28:0x005f, B:30:0x0065, B:34:0x006d, B:40:0x008a, B:42:0x0095, B:45:0x009c, B:48:0x00a2, B:54:0x00ba, B:56:0x00c0, B:60:0x00c8, B:66:0x00e5, B:68:0x00f0, B:73:0x00fc, B:74:0x0102, B:76:0x0108, B:83:0x011b, B:97:0x0145, B:105:0x015e, B:110:0x0165, B:89:0x0129, B:91:0x012d, B:79:0x010d, B:81:0x0111, B:82:0x0115, B:16:0x0030, B:112:0x017e, B:189:0x02b1, B:114:0x0188, B:128:0x01b4, B:142:0x0208, B:143:0x020c, B:135:0x01c8, B:136:0x01cb, B:138:0x01cf, B:140:0x01fc, B:145:0x0211, B:148:0x0219, B:150:0x021f, B:154:0x022c, B:164:0x0247, B:168:0x024f, B:179:0x0275, B:183:0x0289, B:185:0x0294, B:178:0x0270, B:161:0x023e, B:153:0x0224, B:121:0x019d, B:188:0x02ab, B:187:0x02a4), top: B:193:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.math.BigDecimal A00(java.lang.CharSequence r31) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6762EYw.A00(java.lang.CharSequence):java.math.BigDecimal");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9 A[Catch: ArithmeticException -> 0x0244, TryCatch #0 {ArithmeticException -> 0x0244, blocks: (B:3:0x0002, B:8:0x001c, B:17:0x0034, B:19:0x003f, B:21:0x0045, B:24:0x004c, B:26:0x0050, B:29:0x0056, B:31:0x005c, B:33:0x0061, B:35:0x006a, B:38:0x0071, B:40:0x0075, B:42:0x007b, B:44:0x0080, B:46:0x0084, B:49:0x008a, B:51:0x0090, B:53:0x0095, B:55:0x009e, B:60:0x00aa, B:61:0x00b0, B:63:0x00b6, B:70:0x00c9, B:84:0x00ef, B:91:0x0101, B:97:0x010d, B:76:0x00d5, B:78:0x00d9, B:66:0x00bb, B:68:0x00bf, B:69:0x00c3, B:15:0x0030, B:173:0x023d, B:174:0x0243, B:100:0x0129, B:114:0x0158, B:116:0x0161, B:128:0x01a4, B:121:0x016e, B:122:0x0171, B:124:0x0175, B:126:0x0199, B:130:0x01a9, B:133:0x01b1, B:135:0x01b7, B:139:0x01c4, B:149:0x01db, B:153:0x01e3, B:164:0x0207, B:168:0x021b, B:170:0x0226, B:163:0x0204, B:146:0x01d4, B:138:0x01bc, B:107:0x013d, B:110:0x0143, B:172:0x0236), top: B:178:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.math.BigDecimal A01(char[] r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6762EYw.A01(char[], int, int):java.math.BigDecimal");
    }

    public static boolean A02(char[] cArr, int i) {
        long j = cArr[i] | (cArr[i + 1] << 16) | (cArr[i + 2] << 32) | (cArr[i + 3] << 48);
        long jA0N = BV8.A0N(cArr, i);
        return AnonymousClass002.A1M(((((j + 19703549022044230L) | (j - 13511005043687472L) | (jA0N + 19703549022044230L) | (jA0N - 13511005043687472L)) & (-35747867511423104L)) > 0L ? 1 : ((((j + 19703549022044230L) | (j - 13511005043687472L) | (jA0N + 19703549022044230L) | (jA0N - 13511005043687472L)) & (-35747867511423104L)) == 0L ? 0 : -1)));
    }

    public static boolean A03(char[] cArr, int i) {
        return (((((long) cArr[i]) | (((long) cArr[i + 1]) << 16)) | (((long) cArr[i + 2]) << 32)) | (((long) cArr[i + 3]) << 48)) == 13511005043687472L && BV8.A0N(cArr, i) == 13511005043687472L;
    }
}
