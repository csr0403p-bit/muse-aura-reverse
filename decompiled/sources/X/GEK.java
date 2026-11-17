package X;

/* loaded from: classes6.dex */
public abstract class GEK {
    public static final GEI A00;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    static {
        /*
            java.lang.Class<?> r0 = X.GEG.A00
            if (r0 == 0) goto L10
            boolean r0 = X.GEG.A01
            if (r0 != 0) goto L10
        L8:
            X.GEH r0 = new X.GEH
            r0.<init>()
        Ld:
            X.GEK.A00 = r0
            return
        L10:
            java.lang.reflect.Method r0 = X.HkA.A00
            java.lang.String r1 = "PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING"
            if (r0 == 0) goto L23
            java.lang.String r0 = java.lang.System.getenv(r1)     // Catch: java.lang.SecurityException -> L1d
            if (r0 == 0) goto L1d
            goto L23
        L1d:
            X.HkA r0 = new X.HkA
            r0.<init>()
            goto Ld
        L23:
            java.lang.String r0 = java.lang.System.getenv(r1)     // Catch: java.lang.SecurityException -> L2a
            if (r0 == 0) goto L2a
            goto L8
        L2a:
            X.GEJ r0 = new X.GEJ
            r0.<init>()
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GEK.<clinit>():void");
    }

    public static boolean A00(byte[] bArr, int i, int i2) {
        byte b;
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i < i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 < 0) {
                    if (b2 >= -32) {
                        if (b2 < -16) {
                            if (i3 < i2 - 1) {
                                int i4 = i + 2;
                                byte b3 = bArr[i3];
                                if (b3 <= -65) {
                                    if (b2 == -32) {
                                        if (b3 < -96) {
                                        }
                                        i += 3;
                                        b = bArr[i4];
                                    } else {
                                        if (b2 == -19 && b3 >= -96) {
                                        }
                                        i += 3;
                                        b = bArr[i4];
                                    }
                                }
                            }
                        } else if (i3 < i2 - 2) {
                            int i5 = i + 2;
                            byte b4 = bArr[i3];
                            if (b4 <= -65) {
                                if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                                    i3 = i + 3;
                                    if (bArr[i5] <= -65) {
                                        i += 4;
                                        b = bArr[i3];
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    if (i3 >= i2 || b2 < -62) {
                        return false;
                    }
                    i += 2;
                    b = bArr[i3];
                    if (b > -65) {
                        return false;
                    }
                } else {
                    i = i3;
                }
            }
        }
        return true;
    }
}
