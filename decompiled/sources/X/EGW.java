package X;

/* loaded from: classes5.dex */
public final class EGW {
    public static final String[] A02;
    public static final EGW A00 = new EGW();
    public static final C6788EZx A01 = C6788EZx.A02("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] A04 = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] A03 = new String[64];

    static {
        int i;
        int i2 = 0;
        String[] strArr = new String[256];
        int i3 = 0;
        do {
            String binaryString = Integer.toBinaryString(i3);
            C7384Etj.A0U(binaryString);
            String strA05 = AbstractC6843Eav.A05("%8s", binaryString);
            C7384Etj.A0Y(strA05, 0);
            strArr[i3] = strA05.replace(' ', '0');
            i3++;
        } while (i3 < 256);
        A02 = strArr;
        String[] strArr2 = A03;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = AnonymousClass006.A0y("|PADDED", strArr2[i4], C60O.A0w());
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i5 = 0;
        do {
            int i6 = iArr2[i5];
            i5++;
            int i7 = iArr[0];
            int i8 = i7 | i6;
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append((Object) strArr2[i7]);
            sbA0w.append('|');
            strArr2[i8] = C8j3.A14(strArr2[i6], sbA0w);
            StringBuilder sbA0w2 = C60O.A0w();
            sbA0w2.append((Object) strArr2[i7]);
            sbA0w2.append('|');
            sbA0w2.append((Object) strArr2[i6]);
            strArr2[i8 | 8] = AnonymousClass001.A0v("|PADDED", sbA0w2);
        } while (i5 < 3);
        do {
            i = i2 + 1;
            if (strArr2[i2] == null) {
                strArr2[i2] = A02[i2];
            }
            i2 = i;
        } while (i < 64);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00(int r5, int r6, int r7, int r8, boolean r9) {
        /*
            r4 = this;
            java.lang.String[] r1 = X.EGW.A04
            r0 = 10
            if (r7 >= r0) goto L6f
            r2 = r1[r7]
        L8:
            if (r8 != 0) goto L26
            java.lang.String r4 = ""
        Lc:
            if (r9 == 0) goto L23
            java.lang.String r3 = "<<"
        L10:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1, r0, r2, r4}
            java.lang.String r0 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r0 = X.AbstractC6843Eav.A05(r0, r1)
            return r0
        L23:
            java.lang.String r3 = ">>"
            goto L10
        L26:
            r0 = 2
            if (r7 == r0) goto L6a
            r0 = 3
            if (r7 == r0) goto L6a
            r0 = 4
            if (r7 == r0) goto L64
            r0 = 6
            if (r7 == r0) goto L64
            r0 = 7
            if (r7 == r0) goto L6a
            r0 = 8
            if (r7 == r0) goto L6a
            java.lang.String[] r1 = X.EGW.A03
            r0 = 64
            if (r8 >= r0) goto L5f
            r4 = r1[r8]
            X.C7384Etj.A0X(r4)
        L44:
            r0 = 5
            if (r7 != r0) goto L54
            r0 = r8 & 4
            if (r0 == 0) goto Lc
            java.lang.String r1 = "HEADERS"
            java.lang.String r0 = "PUSH_PROMISE"
        L4f:
            java.lang.String r4 = X.AbstractC2159Azp.A0z(r4, r1, r0)
            goto Lc
        L54:
            if (r7 != 0) goto Lc
            r0 = r8 & 32
            if (r0 == 0) goto Lc
            java.lang.String r1 = "PRIORITY"
            java.lang.String r0 = "COMPRESSED"
            goto L4f
        L5f:
            java.lang.String[] r0 = X.EGW.A02
            r4 = r0[r8]
            goto L44
        L64:
            r0 = 1
            if (r8 != r0) goto L6a
            java.lang.String r4 = "ACK"
            goto Lc
        L6a:
            java.lang.String[] r0 = X.EGW.A02
            r4 = r0[r8]
            goto Lc
        L6f:
            java.lang.Object[] r1 = X.BV5.A1Y(r7)
            java.lang.String r0 = "0x%02x"
            java.lang.String r2 = X.AbstractC6843Eav.A05(r0, r1)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EGW.A00(int, int, int, int, boolean):java.lang.String");
    }
}
