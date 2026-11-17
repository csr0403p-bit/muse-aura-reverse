package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class FHU {
    public Rect A00;
    public View A01;
    public boolean A02;
    public final ViewGroup A03;
    public final FJn A04;
    public final FHT A05;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r3 = r4.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r2 = r3.length;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r1 >= r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r0 = r3[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.A00(r0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.view.ViewGroup r6, X.FHU r7) {
        /*
            boolean r0 = r6 instanceof X.AbstractC7837FGt
            if (r0 == 0) goto L47
            X.FGt r6 = (X.AbstractC7837FGt) r6
            X.FHT r5 = r7.A05
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
            r4 = r6
            X.FHQ r4 = (X.FHQ) r4     // Catch: java.lang.Throwable -> L3f
            X.FGF[] r3 = r4.A04     // Catch: java.lang.Throwable -> L3f
            int r2 = r3.length     // Catch: java.lang.Throwable -> L3f
            r1 = 0
        L19:
            if (r1 >= r2) goto L29
            r0 = r3[r1]     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L26
            boolean r0 = r5.A00(r0)     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L26
            goto L63
        L26:
            int r1 = r1 + 1
            goto L19
        L29:
            X.FGF[] r3 = r4.A05     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L63
            int r2 = r3.length     // Catch: java.lang.Throwable -> L3f
            r1 = 0
        L2f:
            if (r1 >= r2) goto L63
            r0 = r3[r1]     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3c
            boolean r0 = r5.A00(r0)     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L3c
            goto L63
        L3c:
            int r1 = r1 + 1
            goto L2f
        L3f:
            r1 = move-exception
            int r0 = r6.A00
            int r0 = r0 + (-1)
            r6.A00 = r0
            throw r1
        L47:
            r1 = 0
        L48:
            android.view.View r0 = r7.A01
            if (r0 != 0) goto L69
            int r0 = r6.getChildCount()
            if (r1 >= r0) goto L69
            int r2 = r1 + 1
            android.view.View r1 = r6.getChildAt(r1)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L61
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            A00(r1, r7)
        L61:
            r1 = r2
            goto L48
        L63:
            int r0 = r6.A00
            int r0 = r0 + (-1)
            r6.A00 = r0
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FHU.A00(android.view.ViewGroup, X.FHU):void");
    }

    public FHU(ViewGroup viewGroup, FJn fJn) {
        AnonymousClass003.A0u(viewGroup, fJn);
        this.A03 = viewGroup;
        this.A04 = fJn;
        this.A05 = new FHT(this);
    }
}
