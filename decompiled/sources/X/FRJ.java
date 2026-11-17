package X;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.rendercore.text.RCTextView;

/* loaded from: classes6.dex */
public final class FRJ extends FRE {
    public final int A00;

    @Override // X.FRE
    public int getCurrentCursorOffset() {
        boolean zA1M = AnonymousClass002.A1M(this.A00);
        FRD frd = this.A0S;
        return zA1M ? frd.A03() : frd.A02();
    }

    @Override // X.FRE
    public int getMagnifierHandleTrigger() {
        return this.A00 == 0 ? 1 : 2;
    }

    public FRJ(Drawable drawable, Drawable drawable2, RCTextView rCTextView, FRD frd, int i) {
        super(drawable, drawable2, rCTextView, frd);
        this.A00 = i;
    }

    @Override // X.FRE, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return zOnTouchEvent;
                    }
                }
            }
            A01();
            return zOnTouchEvent;
        }
        A05(motionEvent);
        return zOnTouchEvent;
    }
}
