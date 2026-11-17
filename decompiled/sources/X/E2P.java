package X;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class E2P extends DgA {
    public static final E5T A01 = new E5T() { // from class: X.E5K
        @Override // X.E5T
        public final boolean AAs(int i, int i2, int i3, int i4, int i5) {
            return false;
        }
    };
    public final E5T A00;

    public static int A00(byte[] bArr, int i, int i2) {
        int length;
        int i3 = i;
        while (true) {
            length = bArr.length;
            if (i3 >= length) {
                i3 = length;
                break;
            }
            if (bArr[i3] == 0) {
                break;
            }
            i3++;
        }
        if (i2 == 0 || i2 == 3) {
            return i3;
        }
        while (i3 < length - 1) {
            if ((i3 - i) % 2 != 0 || bArr[i3 + 1] != 0) {
                while (true) {
                    i3++;
                    if (i3 >= length) {
                        i3 = length;
                        break;
                    }
                    if (bArr[i3] == 0) {
                        break;
                    }
                }
            } else {
                return i3;
            }
        }
        return length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.common.collect.ImmutableList<java.lang.String> A02(byte[] r5, int r6, int r7) {
        /*
            int r0 = r5.length
            java.lang.String r4 = ""
            if (r7 >= r0) goto L2f
            com.google.common.collect.ImmutableList$Builder r3 = com.google.common.collect.ImmutableList.builder()
        L9:
            int r2 = A00(r5, r7, r6)
            if (r7 >= r2) goto L25
            int r1 = r2 - r7
            java.nio.charset.Charset r0 = A04(r6)
            java.lang.String r0 = X.BV4.A0n(r0, r5, r7, r1)
            r3.add(r0)
            if (r6 == 0) goto L22
            r0 = 3
            r7 = 2
            if (r6 != r0) goto L23
        L22:
            r7 = 1
        L23:
            int r7 = r7 + r2
            goto L9
        L25:
            com.google.common.collect.ImmutableList r1 = r3.build()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L33
        L2f:
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r4)
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2P.A02(byte[], int, int):com.google.common.collect.ImmutableList");
    }

    public static String A03(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr;
        String str;
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(i2);
        Integer numValueOf2 = Integer.valueOf(i3);
        Integer numValueOf3 = Integer.valueOf(i4);
        if (i == 2) {
            objArr = new Object[]{numValueOf, numValueOf2, numValueOf3};
            str = "%c%c%c";
        } else {
            objArr = new Object[]{numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i5)};
            str = "%c%c%c%c";
        }
        return String.format(locale, str, objArr);
    }

    public static Charset A04(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5402Dhv A06(byte[] r14, int r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2P.A06(byte[], int):X.Dhv");
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:0x0508, code lost:
    
        if (r2 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026f A[Catch: Exception | OutOfMemoryError -> 0x027d, all -> 0x0538, TryCatch #4 {Exception | OutOfMemoryError -> 0x027d, blocks: (B:60:0x0107, B:65:0x0126, B:66:0x0134, B:69:0x013e, B:77:0x0165, B:82:0x0184, B:84:0x0188, B:86:0x018c, B:88:0x0190, B:91:0x0196, B:93:0x019e, B:94:0x01a7, B:96:0x01b4, B:98:0x01b8, B:100:0x01bc, B:108:0x01db, B:110:0x01e4, B:112:0x01e8, B:114:0x01ec, B:116:0x01f6, B:117:0x01f8, B:118:0x01ff, B:127:0x0216, B:129:0x0229, B:131:0x022d, B:133:0x0231, B:136:0x0245, B:142:0x0257, B:145:0x0261, B:147:0x026a, B:151:0x0274, B:152:0x0276, B:150:0x026f), top: B:305:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x030f A[Catch: OutOfMemoryError -> 0x037a, Exception | OutOfMemoryError -> 0x04eb, all -> 0x0538, TryCatch #5 {all -> 0x0538, blocks: (B:60:0x0107, B:65:0x0126, B:66:0x0134, B:69:0x013e, B:77:0x0165, B:82:0x0184, B:84:0x0188, B:86:0x018c, B:88:0x0190, B:91:0x0196, B:93:0x019e, B:94:0x01a7, B:96:0x01b4, B:98:0x01b8, B:100:0x01bc, B:108:0x01db, B:110:0x01e4, B:112:0x01e8, B:114:0x01ec, B:116:0x01f6, B:117:0x01f8, B:118:0x01ff, B:127:0x0216, B:129:0x0229, B:131:0x022d, B:133:0x0231, B:136:0x0245, B:142:0x0257, B:145:0x0261, B:147:0x026a, B:151:0x0274, B:152:0x0276, B:150:0x026f, B:165:0x029d, B:167:0x02b1, B:180:0x02ee, B:185:0x030b, B:189:0x0314, B:190:0x0316, B:188:0x030f, B:173:0x02cf, B:175:0x02d3, B:177:0x02d7, B:179:0x02ea, B:200:0x0337, B:205:0x0362, B:208:0x036c, B:210:0x0374, B:218:0x038d, B:219:0x0392, B:221:0x0395, B:223:0x0399, B:225:0x039d, B:228:0x03be, B:231:0x03c8, B:232:0x03cd, B:234:0x03d1, B:236:0x03dd, B:237:0x03e1, B:247:0x0409, B:248:0x040e, B:250:0x0411, B:252:0x0415, B:254:0x0419, B:256:0x0437, B:258:0x0440, B:259:0x0445, B:261:0x0448, B:263:0x044c, B:265:0x0450, B:266:0x0460, B:267:0x0465, B:269:0x0469, B:271:0x0475, B:272:0x0479, B:282:0x04d7, B:278:0x0495, B:280:0x04bf, B:281:0x04ce), top: B:305:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04d7 A[Catch: Exception -> 0x04e7, OutOfMemoryError -> 0x04e9, all -> 0x0538, TRY_LEAVE, TryCatch #5 {all -> 0x0538, blocks: (B:60:0x0107, B:65:0x0126, B:66:0x0134, B:69:0x013e, B:77:0x0165, B:82:0x0184, B:84:0x0188, B:86:0x018c, B:88:0x0190, B:91:0x0196, B:93:0x019e, B:94:0x01a7, B:96:0x01b4, B:98:0x01b8, B:100:0x01bc, B:108:0x01db, B:110:0x01e4, B:112:0x01e8, B:114:0x01ec, B:116:0x01f6, B:117:0x01f8, B:118:0x01ff, B:127:0x0216, B:129:0x0229, B:131:0x022d, B:133:0x0231, B:136:0x0245, B:142:0x0257, B:145:0x0261, B:147:0x026a, B:151:0x0274, B:152:0x0276, B:150:0x026f, B:165:0x029d, B:167:0x02b1, B:180:0x02ee, B:185:0x030b, B:189:0x0314, B:190:0x0316, B:188:0x030f, B:173:0x02cf, B:175:0x02d3, B:177:0x02d7, B:179:0x02ea, B:200:0x0337, B:205:0x0362, B:208:0x036c, B:210:0x0374, B:218:0x038d, B:219:0x0392, B:221:0x0395, B:223:0x0399, B:225:0x039d, B:228:0x03be, B:231:0x03c8, B:232:0x03cd, B:234:0x03d1, B:236:0x03dd, B:237:0x03e1, B:247:0x0409, B:248:0x040e, B:250:0x0411, B:252:0x0415, B:254:0x0419, B:256:0x0437, B:258:0x0440, B:259:0x0445, B:261:0x0448, B:263:0x044c, B:265:0x0450, B:266:0x0460, B:267:0x0465, B:269:0x0469, B:271:0x0475, B:272:0x0479, B:282:0x04d7, B:278:0x0495, B:280:0x04bf, B:281:0x04ce), top: B:305:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0188 A[Catch: Exception | OutOfMemoryError -> 0x027d, all -> 0x0538, TryCatch #4 {Exception | OutOfMemoryError -> 0x027d, blocks: (B:60:0x0107, B:65:0x0126, B:66:0x0134, B:69:0x013e, B:77:0x0165, B:82:0x0184, B:84:0x0188, B:86:0x018c, B:88:0x0190, B:91:0x0196, B:93:0x019e, B:94:0x01a7, B:96:0x01b4, B:98:0x01b8, B:100:0x01bc, B:108:0x01db, B:110:0x01e4, B:112:0x01e8, B:114:0x01ec, B:116:0x01f6, B:117:0x01f8, B:118:0x01ff, B:127:0x0216, B:129:0x0229, B:131:0x022d, B:133:0x0231, B:136:0x0245, B:142:0x0257, B:145:0x0261, B:147:0x026a, B:151:0x0274, B:152:0x0276, B:150:0x026f), top: B:305:0x00fb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC6411E4n A01(X.E1P r28, X.E5T r29, int r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2P.A01(X.E1P, X.E5T, int, int, boolean):X.E4n");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A05(E1P e1p, int i, int i2, boolean z) {
        int iA0B;
        long jA0B;
        int iA0D;
        int iA1L;
        int i3;
        int i4 = e1p.A01;
        while (e1p.A04() >= i2) {
            try {
                if (i >= 3) {
                    iA0B = e1p.A05();
                    jA0B = e1p.A0H();
                    iA0D = e1p.A0D();
                } else {
                    iA0B = e1p.A0B();
                    jA0B = e1p.A0B();
                    iA0D = 0;
                }
                if (iA0B == 0 && jA0B == 0 && iA0D == 0) {
                    break;
                }
                if (i == 4) {
                    if (!z) {
                        if ((8421504 & jA0B) != 0) {
                            return false;
                        }
                        jA0B = (((jA0B >> 24) & 255) << 21) | (jA0B & 255) | (((jA0B >> 8) & 255) << 7) | (((jA0B >> 16) & 255) << 14);
                    }
                    i3 = iA0D & 1;
                    iA1L = AnonymousClass002.A1L(iA0D & 64);
                } else if (i == 3) {
                    i3 = iA0D & 128;
                    iA1L = AnonymousClass002.A1L(iA0D & 32);
                } else {
                    iA1L = 0;
                    if (jA0B >= iA1L || e1p.A04() < jA0B) {
                        return false;
                    }
                    e1p.A0S((int) jA0B);
                }
                if (i3 != 0) {
                    iA1L += 4;
                }
                if (jA0B >= iA1L) {
                }
                return false;
            } finally {
                e1p.A0R(i4);
            }
        }
        return true;
    }

    public E2P(E5T e5t) {
        this.A00 = e5t;
    }

    public E2P() {
        this(null);
    }
}
