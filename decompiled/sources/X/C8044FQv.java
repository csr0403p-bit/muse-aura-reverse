package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.FQv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8044FQv extends GestureDetector.SimpleOnGestureListener {
    public final C8040FQr A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C8040FQr c8040FQr = this.A00;
        if (c8040FQr.getContext() == null) {
            return false;
        }
        float translationY = c8040FQr.getTranslationY();
        if (f2 > 0.0f) {
            c8040FQr.A03((int) Math.abs(((AbstractC7607F5u.A03(c8040FQr) - translationY) / f2) * 1000.0f));
        } else {
            c8040FQr.A04(null, (int) Math.abs((translationY / (-f2)) * 1000.0f));
        }
        c8040FQr.A08 = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C8040FQr c8040FQr = this.A00;
        if (c8040FQr.getTranslationY() <= 0.0f && f2 > 0.0f) {
            return false;
        }
        c8040FQr.A08 = false;
        return true;
    }

    public C8044FQv(C8040FQr c8040FQr) {
        this.A00 = c8040FQr;
    }
}
