package X;

import com.android.billingclient.kb;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
public abstract class GEI {
    public final int A00(String str) throws kb {
        if (this instanceof HkA) {
            try {
                return AnonymousClass001.A0F(HkA.A00.invoke(str, StandardCharsets.UTF_8));
            } catch (ReflectiveOperationException e) {
                throw new IllegalStateException(e);
            }
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < '\u0080') {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < '\u0800') {
                i3 += ('\u007f' - cCharAt) >>> 31;
                i2++;
            } else {
                try {
                    GEI gei = GEK.A00;
                    while (i2 < length) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < '\u0800') {
                            i += ('\u007f' - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if ('\ud800' <= cCharAt2 && cCharAt2 <= '\udfff') {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new kb(FGI.A0T("Unpaired surrogate at index ", " of ", i2, length));
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                } catch (kb unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw BV5.A0R("UTF-8 length does not fit in int: ", i3 + LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(java.lang.String r9, byte[] r10, int r11, int r12) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.GEJ
            if (r0 == 0) goto L1d
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r9.getBytes(r0)
            int r1 = r2.length
            int r0 = r1 - r11
            if (r0 > r12) goto L15
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r10, r11, r1)
            int r11 = r11 + r1
            return r11
        L15:
            java.lang.String r1 = "Not enough space in output buffer to encode UTF-8 string"
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L1d:
            int r7 = r9.length()
            int r8 = r11 + r12
            r6 = 0
        L24:
            r5 = 128(0x80, float:1.794E-43)
            if (r6 >= r7) goto L38
            int r1 = r6 + r11
            if (r1 >= r8) goto L38
            char r0 = r9.charAt(r6)
            if (r0 >= r5) goto L38
            byte r0 = (byte) r0
            r10[r1] = r0
            int r6 = r6 + 1
            goto L24
        L38:
            int r4 = r11 + r6
            if (r6 != r7) goto L3f
            int r4 = r11 + r7
        L3e:
            return r4
        L3f:
            if (r6 >= r7) goto L3e
            char r3 = r9.charAt(r6)
            if (r3 >= r5) goto L52
            if (r4 >= r8) goto L56
            int r1 = r4 + 1
            byte r0 = (byte) r3
            r10[r4] = r0
            r4 = r1
        L4f:
            int r6 = r6 + 1
            goto L3f
        L52:
            r0 = 2048(0x800, float:2.87E-42)
            if (r3 >= r0) goto L69
        L56:
            int r0 = r8 + (-2)
            if (r4 > r0) goto L69
            int r1 = r4 + 1
            int r0 = r3 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            byte r0 = (byte) r0
            r10[r4] = r0
            int r4 = r4 + 2
        L65:
            X.AbstractC7608F5v.A1C(r3, r10, r1)
            goto L4f
        L69:
            r2 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r1) goto L73
            if (r2 >= r3) goto L7e
        L73:
            int r0 = r8 + (-3)
            if (r4 > r0) goto L7e
            int r1 = X.AbstractC7611F5y.A0G(r10, r4, r3)
            int r4 = r4 + 3
            goto L65
        L7e:
            int r0 = r8 + (-4)
            if (r4 > r0) goto L9b
            int r6 = r6 + 1
            if (r6 == r7) goto Lad
            char r1 = r9.charAt(r6)
            boolean r0 = java.lang.Character.isSurrogatePair(r3, r1)
            if (r0 == 0) goto Lad
            int r3 = java.lang.Character.toCodePoint(r3, r1)
            int r1 = X.AbstractC7611F5y.A0F(r10, r4, r3)
            int r4 = r4 + 4
            goto L65
        L9b:
            if (r1 > r3) goto Lc6
            if (r3 > r2) goto Lc6
            int r0 = r6 + 1
            if (r0 == r7) goto Lad
            char r0 = r9.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r3, r0)
            if (r0 != 0) goto Lc6
        Lad:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r9.getBytes(r0)
            int r1 = r2.length
            int r0 = r1 - r11
            if (r0 > r12) goto Lbe
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r10, r11, r1)
            int r11 = r11 + r1
            return r11
        Lbe:
            java.lang.String r1 = "Not enough space in output buffer to encode UTF-8 string"
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        Lc6:
            java.lang.String r1 = "Not enough space in output buffer to encode UTF-8 string"
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GEI.A01(java.lang.String, byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A02(byte[] r13, int r14, int r15) throws com.android.billingclient.v6 {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GEI.A02(byte[], int, int):java.lang.String");
    }
}
