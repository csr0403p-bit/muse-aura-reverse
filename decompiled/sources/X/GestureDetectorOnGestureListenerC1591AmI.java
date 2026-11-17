package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.AmI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class GestureDetectorOnGestureListenerC1591AmI implements GestureDetector.OnGestureListener {
    public final /* synthetic */ C1592AmJ A00;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public GestureDetectorOnGestureListenerC1591AmI(C1592AmJ c1592AmJ) {
        this.A00 = c1592AmJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onFling(android.view.MotionEvent r3, android.view.MotionEvent r4, float r5, float r6) {
        /*
            r2 = this;
            X.AmJ r4 = r2.A00
            boolean r0 = r4.A01
            r3 = 1
            if (r0 != 0) goto L2c
            int r1 = r4.A00
            boolean r0 = X.AnonymousClass002.A1Q(r1, r3)
            r2 = 0
            if (r0 == 0) goto L2d
            float r1 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r6)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2c
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
        L1e:
            r2 = 2
            if (r0 <= 0) goto L22
            r2 = 1
        L22:
            X.G0U<X.Aki, kotlin.Unit> r1 = r4.A03
            X.Aki r0 = new X.Aki
            r0.<init>(r2)
            r1.invoke(r0)
        L2c:
            return r3
        L2d:
            r0 = 2
            if (r1 != r0) goto L2c
            float r1 = java.lang.Math.abs(r6)
            float r0 = java.lang.Math.abs(r5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2c
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC1591AmI.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }
}
