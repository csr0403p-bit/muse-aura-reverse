package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes6.dex */
public final class FR4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ FR3 A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        motionEvent.getX();
        motionEvent.getY();
        return true;
    }

    public FR4(FR3 fr3) {
        this.A00 = fr3;
    }
}
