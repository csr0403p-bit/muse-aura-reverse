package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes6.dex */
public final class FL3 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewTreeObserver A00;
    public final View A01;
    public final FL2 A02;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C7384Etj.A0Y(view, 0);
        this.A00 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C7384Etj.A0Y(view, 0);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        FL2 fl2 = this.A02;
        if (fl2.A0D) {
            View view = fl2.A0B;
            View view2 = this.A01;
            if (view == view2) {
                float fA02 = AbstractC7607F5u.A02(view2);
                float f = fl2.A09;
                view2.setTranslationX(AbstractC7609F5w.A02(f, fA02, f, fl2.A0H ? 1 : 0));
                float fA03 = AbstractC7607F5u.A03(view2);
                float f2 = fl2.A0A;
                view2.setTranslationY(AbstractC7609F5w.A02(f2, fA03, f2, fl2.A0I ? 1 : 0));
                if (fl2.A0E) {
                    float fA022 = AbstractC7607F5u.A02(view2);
                    float f3 = fl2.A02;
                    view2.setPivotX(AbstractC7609F5w.A02(f3, fA022, f3, fl2.A0F ? 1 : 0));
                    float fA032 = AbstractC7607F5u.A03(view2);
                    float f4 = fl2.A03;
                    view2.setPivotY(AbstractC7609F5w.A02(f4, fA032, f4, fl2.A0G ? 1 : 0));
                }
            }
        }
        this.A01.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }

    public FL3(View view, FL2 fl2) {
        this.A02 = fl2;
        this.A01 = view;
    }
}
