package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: X.Far, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8269Far extends ContentFrameLayout {
    public final /* synthetic */ LayoutInflaterFactory2C8250FaT A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8269Far(Context context, LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        super(context, null);
        this.A00 = layoutInflaterFactory2C8250FaT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A00.A0X(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = this.A00;
                layoutInflaterFactory2C8250FaT.A0U(layoutInflaterFactory2C8250FaT.A0P(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(FWf.A01(this, i));
    }
}
