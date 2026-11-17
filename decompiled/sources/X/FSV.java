package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FSV extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ FST A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        double dA02;
        double dA022;
        double d;
        C7384Etj.A0Y(motionEvent, 0);
        FST fst = this.A00;
        if (fst.A0R) {
            return false;
        }
        if (fst.A0J == C79.A00) {
            float f = fst.A02;
            if (f - 1.0f < fst.A03 - f) {
                View view = fst.A0X;
                fst.A04 = ((view.getWidth() / 2) - motionEvent.getX()) * (fst.A03 - 1.0f);
                float height = (view.getHeight() / 2) - motionEvent.getY();
                float f2 = fst.A03;
                fst.A05 = height * (f2 - 1.0f);
                HxE hxEA00 = FST.A00(fst, f2);
                float fA02 = AnonymousClass001.A02(hxEA00.first);
                float fA022 = AnonymousClass001.A02(hxEA00.second);
                d = fst.A03;
                dA02 = fA02;
                dA022 = fA022;
            } else {
                HxE hxEA002 = FST.A00(fst, 1.0f);
                dA02 = AnonymousClass001.A02(hxEA002.first);
                dA022 = AnonymousClass001.A02(hxEA002.second);
                d = 1.0d;
            }
            FST.A04(fst, d, dA02, dA022, false);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r3 >= r2.A0T) goto L9;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onFling(android.view.MotionEvent r13, android.view.MotionEvent r14, float r15, float r16) {
        /*
            r12 = this;
            r1 = 1
            X.C7384Etj.A0Y(r14, r1)
            X.FST r2 = r12.A00
            boolean r0 = r2.A0R
            r10 = 0
            if (r0 != 0) goto La7
            if (r13 == 0) goto La7
            float r6 = r13.getX()
            float r0 = r14.getX()
            float r6 = r6 - r0
            float r7 = r13.getY()
            float r0 = r14.getY()
            float r7 = r7 - r0
            float r4 = java.lang.Math.abs(r15)
            float r3 = java.lang.Math.abs(r16)
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 > 0) goto L99
            r9 = 1
            int r0 = r2.A0T
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto La7
        L33:
            X.FSU r3 = r2.A0E
            if (r3 == 0) goto La2
            float r4 = r2.A02
            android.view.View r8 = r2.A0X
            float r0 = X.AbstractC7607F5u.A02(r8)
            float r4 = r4 * r0
            float r0 = X.AbstractC7607F5u.A02(r8)
            float r4 = r4 - r0
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            int r12 = X.Ab3.A01(r4)
            float r4 = r2.A02
            float r0 = X.AbstractC7607F5u.A03(r8)
            float r4 = r4 * r0
            float r0 = X.AbstractC7607F5u.A03(r8)
            float r4 = r4 - r0
            float r4 = r4 / r5
            int r14 = X.Ab3.A01(r4)
            if (r9 == 0) goto L66
            boolean r0 = X.FST.A06(r2, r7)
            if (r0 != 0) goto L6c
        L65:
            return r1
        L66:
            boolean r0 = X.FST.A05(r2, r6)
            if (r0 == 0) goto L65
        L6c:
            java.lang.Integer r0 = X.C79.A0W
            r2.A09(r0)
            android.widget.OverScroller r6 = r2.A0Y
            float r0 = r2.A04
            int r7 = X.Ab3.A01(r0)
            float r0 = r2.A05
            int r8 = X.Ab3.A01(r0)
            if (r9 == 0) goto L94
            r9 = 0
            int r10 = X.Ab3.A01(r16)
        L86:
            int r11 = -r12
            int r13 = -r14
            r6.fling(r7, r8, r9, r10, r11, r12, r13, r14)
            X.FSZ r0 = new X.FSZ
            r0.<init>(r3, r2)
            r3.postOnAnimation(r0)
            return r1
        L94:
            int r9 = X.Ab3.A01(r15)
            goto L86
        L99:
            r9 = 0
            int r0 = r2.A0T
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L33
            return r10
        La2:
            java.lang.IllegalStateException r0 = X.BV4.A0U()
            throw r0
        La7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FSV.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        FST fst = this.A00;
        FrameLayout.LayoutParams layoutParams = FST.A0d;
        if (fst.A02 - 1.0f > 0.05f || !fst.A0S) {
            return;
        }
        G0U<? super MotionEvent, Unit> g0u = fst.A0M;
        if (g0u != null) {
            g0u.invoke(motionEvent);
        }
        if (fst.A0N != null) {
            fst.A0Q = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer num;
        C7384Etj.A0Y(motionEvent2, 1);
        FST fst = this.A00;
        if (fst.A0R || motionEvent == null) {
            return false;
        }
        fst.A00 -= motionEvent.getX() - motionEvent2.getX();
        fst.A01 -= motionEvent.getY() - motionEvent2.getY();
        Integer num2 = fst.A0J;
        Integer num3 = C79.A0T;
        if (num2 == num3 || !(num2 == (num = C79.A0P) || FST.A05(fst, f) || FST.A06(fst, f2))) {
            fst.A09(num3);
            return true;
        }
        fst.A09(num);
        float f3 = fst.A04 - f;
        fst.A04 = f3;
        fst.A05 -= f2;
        fst.A0F.A01(f3);
        fst.A0G.A01(fst.A05);
        float f4 = fst.A04;
        float f5 = fst.A05;
        View view = fst.A0X;
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        G0U<? super MotionEvent, Unit> g0u = this.A00.A0O;
        if (g0u == null) {
            return false;
        }
        g0u.invoke(motionEvent);
        return true;
    }

    public FSV() {
    }

    public FSV(FST fst) {
        this.A00 = fst;
    }
}
