package X;

import java.util.UUID;

/* renamed from: X.Dhn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5396Dhn implements InterfaceC5392Dhj {
    public static final boolean A02;
    public final UUID A00;
    public final byte[] A01;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    static {
        /*
            java.lang.String r1 = "Amazon"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "AFTM"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "AFTB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
        L1c:
            r0 = 1
        L1d:
            X.C5396Dhn.A02 = r0
            return
        L20:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5396Dhn.<clinit>():void");
    }

    public C5396Dhn(UUID uuid, byte[] bArr) {
        this.A00 = uuid;
        this.A01 = bArr;
    }
}
