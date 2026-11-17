package androidx.glance.appwidget;

import X.C75j;
import X.C9258GBl;
import X.InterfaceC2261BLa;

/* loaded from: classes3.dex */
public final class GlanceRemoteViews {
    public C75j A00;
    public final InterfaceC2261BLa A01 = new C9258GBl();

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.content.Context r11, androidx.glance.appwidget.GlanceRemoteViews r12, X.HtJ r13) {
        /*
            r6 = r11
            r3 = 2
            boolean r0 = r13 instanceof X.C8iS
            if (r0 == 0) goto L2f
            r4 = r13
            X.8iS r4 = (X.C8iS) r4
            int r0 = r4.$t
            if (r0 != r3) goto L2f
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r3 = r4.A03
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r8 = 0
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 != r2) goto L35
            java.lang.Object r1 = r4.A02
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r0 = r4.A01
            android.content.Context r6 = X.C60P.A02(r0, r3)
            goto L50
        L2f:
            X.8iS r4 = new X.8iS
            r4.<init>(r12, r13, r3)
            goto L18
        L35:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3a:
            X.Hwg.A00(r3)
            X.75j r0 = r12.A00
            if (r0 != 0) goto L6c
            X.BLa r1 = r12.A01
            r4.A01 = r11
            r4.A02 = r1
            r4.A00 = r2
            java.lang.Object r0 = r1.APs(r8, r4)
            if (r0 != r5) goto L50
            return r5
        L50:
            X.75j r5 = r12.A00     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L61
            r9 = 0
            java.util.LinkedHashMap r7 = X.C3cG.A0j()     // Catch: java.lang.Throwable -> L67
            r11 = 48
            X.75j r5 = new X.75j     // Catch: java.lang.Throwable -> L67
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L67
        L61:
            r12.A00 = r5     // Catch: java.lang.Throwable -> L67
            r1.Ahe(r8)
            return r5
        L67:
            r0 = move-exception
            r1.Ahe(r8)
            throw r0
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceRemoteViews.A00(android.content.Context, androidx.glance.appwidget.GlanceRemoteViews, X.HtJ):java.lang.Object");
    }
}
