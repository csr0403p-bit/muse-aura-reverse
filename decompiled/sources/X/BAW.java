package X;

import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class BAW<T> implements Comparator<T> {
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();
    public final InterfaceC2196BAb<T> A02;
    public final boolean A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[RETURN] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(T r7, T r8) {
        /*
            r6 = this;
            android.graphics.Rect r5 = r6.A00
            android.graphics.Rect r4 = r6.A01
            X.BAc r7 = (X.C2197BAc) r7
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.A02
            r0.getBoundsInScreen(r5)
            X.BAc r8 = (X.C2197BAc) r8
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.A02
            r0.getBoundsInScreen(r4)
            int r1 = r5.top
            int r0 = r4.top
            r3 = -1
            if (r1 < r0) goto L40
            r2 = 1
            if (r1 > r0) goto L35
            int r1 = r5.left
            int r0 = r4.left
            if (r1 < r0) goto L3b
            if (r1 > r0) goto L36
            int r1 = r5.bottom
            int r0 = r4.bottom
            if (r1 < r0) goto L40
            if (r1 > r0) goto L35
            int r1 = r5.right
            int r0 = r4.right
            if (r1 < r0) goto L3b
            if (r1 > r0) goto L36
            r2 = 0
        L35:
            return r2
        L36:
            boolean r0 = r6.A03
            if (r0 == 0) goto L35
            return r3
        L3b:
            boolean r0 = r6.A03
            if (r0 == 0) goto L40
            return r2
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAW.compare(java.lang.Object, java.lang.Object):int");
    }

    /* JADX WARN: Incorrect types in method signature: (ZLX/BAb<TT;>;)V */
    public BAW(InterfaceC2196BAb interfaceC2196BAb, boolean z) {
        this.A03 = z;
        this.A02 = interfaceC2196BAb;
    }
}
