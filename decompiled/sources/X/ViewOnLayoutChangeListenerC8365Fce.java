package X;

import android.view.View;

/* renamed from: X.Fce, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC8365Fce implements View.OnLayoutChangeListener {
    public final /* synthetic */ C8359FcY A00;
    public final /* synthetic */ C8364Fcd A01;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C7384Etj.A0Y(view, 0);
        if (view.isAttachedToWindow()) {
            view.removeOnLayoutChangeListener(this);
            C8359FcY c8359FcY = this.A00;
            boolean zShouldKeepOnScreen = c8359FcY.A00.shouldKeepOnScreen();
            C8364Fcd c8364Fcd = this.A01;
            if (zShouldKeepOnScreen) {
                c8359FcY.A02 = c8364Fcd;
                return;
            }
            InterfaceC8368Fci interfaceC8368Fci = c8359FcY.A01;
            if (interfaceC8368Fci != null) {
                c8359FcY.A01 = null;
                c8364Fcd.A00.A00().postOnAnimation(new RunnableC8366Fcf(interfaceC8368Fci, c8364Fcd));
            }
        }
    }

    public ViewOnLayoutChangeListenerC8365Fce(C8359FcY c8359FcY, C8364Fcd c8364Fcd) {
        this.A00 = c8359FcY;
        this.A01 = c8364Fcd;
    }
}
