package X;

import com.facebook.mobileconfig.factory.MobileConfigUnsafeContext;

/* loaded from: classes5.dex */
public final class DSE {
    public DS5 A00;
    public final InterfaceC5058DRj A01;
    public final MobileConfigUnsafeContext A02;
    public final MobileConfigUnsafeContext A03;
    public final DS4 A04;

    public static MobileConfigUnsafeContext A00(DSE dse, long j) {
        int i = (int) ((j >>> 54) & 63);
        if (i == 1) {
            return dse.A03;
        }
        if (i == 2 || i == 3 || i != 4) {
            return dse.A02;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DSE(X.InterfaceC5058DRj r2, com.facebook.mobileconfig.factory.MobileConfigUnsafeContext r3, com.facebook.mobileconfig.factory.MobileConfigUnsafeContext r4) {
        /*
            r1 = this;
            r1.<init>()
            r1.A01 = r2
            r1.A02 = r3
            r1.A03 = r4
            X.DS5 r0 = r2.getOrCreateOverridesTable()
            r1.A00 = r0
            boolean r0 = r4 instanceof X.DSU
            if (r0 == 0) goto L22
            X.DSU r4 = (X.DSU) r4
            boolean r0 = r4 instanceof X.DRZ
            if (r0 == 0) goto L22
            X.DRZ r4 = (X.DRZ) r4
            if (r4 == 0) goto L22
            X.DS4 r0 = r4.A08
        L1f:
            r1.A04 = r0
            return
        L22:
            X.DS4 r0 = new X.DS4
            r0.<init>()
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DSE.<init>(X.DRj, com.facebook.mobileconfig.factory.MobileConfigUnsafeContext, com.facebook.mobileconfig.factory.MobileConfigUnsafeContext):void");
    }
}
