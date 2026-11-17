package X;

/* renamed from: X.Dmr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5662Dmr implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerImpl$playInternal$1";
    public final /* synthetic */ C5627DmA A00;

    public RunnableC5662Dmr(C5627DmA c5627DmA) {
        this.A00 = c5627DmA;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            X.DmA r1 = r5.A00
            X.Dm8 r0 = r1.A07
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L3c
            java.util.ArrayList r5 = X.C3cG.A0h()
            android.view.View r0 = r1.A02
            java.lang.String r4 = "GrootPlayer"
            r3 = 0
            if (r0 == 0) goto L4c
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L44
        L1b:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L44
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L3d
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L44
            android.view.Window r1 = r2.getWindow()
            if (r1 == 0) goto L47
            X.Dsp r0 = new X.Dsp
            r0.<init>(r1)
            r2.runOnUiThread(r0)
            java.lang.String r1 = "Groot window successfully set as secure for DRM video"
            java.lang.Object[] r0 = new java.lang.Object[r3]
        L39:
            X.AbstractC3426CMt.A03(r4, r1, r0)
        L3c:
            return
        L3d:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L1b
        L44:
            X.EuJ r0 = X.EuJ.ACTIVITY_NULL
            goto L49
        L47:
            X.EuJ r0 = X.EuJ.WINDOW_NULL
        L49:
            r5.add(r0)
        L4c:
            java.lang.StringBuilder r3 = X.C60O.A0w()
            java.util.Iterator r2 = r5.iterator()
        L54:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r1 = r2.next()
            X.EuJ r1 = (X.EuJ) r1
            int r0 = r3.length()
            if (r0 <= 0) goto L6b
            java.lang.String r0 = ","
            r3.append(r0)
        L6b:
            java.lang.String r0 = r1.shortName
            r3.append(r0)
            goto L54
        L71:
            java.lang.StringBuilder r3 = X.C60O.A0w()
            java.util.Iterator r2 = r5.iterator()
        L79:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r1 = r2.next()
            X.EuJ r1 = (X.EuJ) r1
            int r0 = r3.length()
            if (r0 <= 0) goto L90
            java.lang.String r0 = ","
            r3.append(r0)
        L90:
            java.lang.String r0 = r1.shortName
            r3.append(r0)
            goto L79
        L96:
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Failed to set secure Groot window for DRM video : %s"
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC5662Dmr.run():void");
    }
}
