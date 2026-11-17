package X;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BjD implements InterfaceC2694Bhu {
    public int A00;
    public final InterfaceC2794BlU A01;
    public final Object A02;
    public final Map<InterfaceC2783Bl3, BkA> A03;
    public final StringBuilder A04 = C60O.A0w();

    public static void A00(BjD bjD) {
        if (AbstractC2875Bni.A08("CameraStateRegistry", 3)) {
            StringBuilder sb = bjD.A04;
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        Iterator itA0n = AnonymousClass002.A0n(bjD.A03);
        int i = 0;
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (AbstractC2875Bni.A08("CameraStateRegistry", 3)) {
                bjD.A04.append(String.format(Locale.US, "%-45s%-22s\n", entryA0l.getKey().toString(), ((BkA) entryA0l.getValue()).A00 != null ? ((BkA) entryA0l.getValue()).A00.toString() : "UNKNOWN"));
            }
            EnumC2819Blw enumC2819Blw = ((BkA) entryA0l.getValue()).A00;
            if (enumC2819Blw != null && enumC2819Blw.mHoldsCameraSlot) {
                i++;
            }
        }
        if (AbstractC2875Bni.A08("CameraStateRegistry", 3)) {
            StringBuilder sb2 = bjD.A04;
            sb2.append("-------------------------------------------------------------------\n");
            AbstractC2875Bni.A01("CameraStateRegistry", AnonymousClass001.A0v(String.format(Locale.US, "Open count: %d (Max allowed: %d)", BV5.A1Z(i, 1)), sb2));
        }
        bjD.A00 = Math.max(1 - i, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(X.InterfaceC2783Bl3 r12) {
        /*
            r11 = this;
            java.lang.Object r5 = r11.A02
            monitor-enter(r5)
            java.util.Map<X.Bl3, X.BkA> r0 = r11.A03     // Catch: java.lang.Throwable -> L94
            java.lang.Object r4 = r0.get(r12)     // Catch: java.lang.Throwable -> L94
            X.BkA r4 = (X.BkA) r4     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "Camera must first be registered with registerCamera()"
            X.BeS.A03(r4, r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = "CameraStateRegistry"
            r2 = 3
            boolean r1 = X.AbstractC2875Bni.A08(r6, r2)     // Catch: java.lang.Throwable -> L94
            r0 = 0
            if (r1 == 0) goto L43
            java.lang.StringBuilder r9 = r11.A04     // Catch: java.lang.Throwable -> L94
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L94
            java.util.Locale r10 = java.util.Locale.US     // Catch: java.lang.Throwable -> L94
            java.lang.String r8 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            int r0 = r11.A00     // Catch: java.lang.Throwable -> L94
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L94
            X.Blw r3 = r4.A00     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L33
            boolean r1 = r3.mHoldsCameraSlot     // Catch: java.lang.Throwable -> L94
            r0 = 1
            if (r1 != 0) goto L34
        L33:
            r0 = 0
        L34:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r7, r0, r3}     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = java.lang.String.format(r10, r8, r0)     // Catch: java.lang.Throwable -> L94
            r9.append(r0)     // Catch: java.lang.Throwable -> L94
        L43:
            int r0 = r11.A00     // Catch: java.lang.Throwable -> L94
            if (r0 > 0) goto L4f
            X.Blw r0 = r4.A00     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L69
            boolean r0 = r0.mHoldsCameraSlot     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L69
        L4f:
            X.Blw r0 = X.EnumC2819Blw.OPENING     // Catch: java.lang.Throwable -> L94
            r4.A00 = r0     // Catch: java.lang.Throwable -> L94
            boolean r0 = android.os.Trace.isEnabled()     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L67
            java.lang.String r0 = "CX:State["
            java.lang.StringBuilder r0 = X.C60O.A0x(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = X.BV8.A0u(r12, r0)     // Catch: java.lang.Throwable -> L94
            r0 = 5
            X.AbstractC3136BzG.A01(r1, r0)     // Catch: java.lang.Throwable -> L94
        L67:
            r4 = 1
            goto L6a
        L69:
            r4 = 0
        L6a:
            boolean r0 = X.AbstractC2875Bni.A08(r6, r2)     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L8d
            java.lang.StringBuilder r3 = r11.A04     // Catch: java.lang.Throwable -> L94
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = " --> %s"
            if (r4 == 0) goto L8a
            java.lang.String r0 = "SUCCESS"
        L7a:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = java.lang.String.format(r2, r1, r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = X.AnonymousClass001.A0v(r0, r3)     // Catch: java.lang.Throwable -> L94
            X.AbstractC2875Bni.A01(r6, r0)     // Catch: java.lang.Throwable -> L94
            goto L8d
        L8a:
            java.lang.String r0 = "FAIL"
            goto L7a
        L8d:
            if (r4 == 0) goto L92
            A00(r11)     // Catch: java.lang.Throwable -> L94
        L92:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L94
            return r4
        L94:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L94
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BjD.A01(X.Bl3):boolean");
    }

    public BjD(InterfaceC2794BlU interfaceC2794BlU) {
        Object objA0T = C3cG.A0T();
        this.A02 = objA0T;
        this.A03 = BV4.A0u();
        synchronized (objA0T) {
            this.A01 = interfaceC2794BlU;
            this.A00 = 1;
        }
    }
}
