package X;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes6.dex */
public final class FLC implements View.OnKeyListener {
    public final FLT A00;

    public FLC(FLT flt) {
        C7384Etj.A0Y(flt, 0);
        this.A00 = flt;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        AnonymousClass002.A1A(view, 0, keyEvent);
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 66 && keyCode != 23 && keyCode != 109 && keyCode != 108 && (keyCode != 62 || (view instanceof EditText))) {
            return false;
        }
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            i2 = 1;
        } else {
            if (this.A00.APA()) {
                return false;
            }
            i2 = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(keyEvent.getDownTime(), keyEvent.getEventTime(), i2, (view.getRight() - view.getLeft()) / 2.0f, AbstractC7607F5u.A0E(view, view.getBottom()) / 2.0f, 0);
        if (motionEventObtain != null) {
            return view.dispatchTouchEvent(motionEventObtain);
        }
        return false;
    }
}
