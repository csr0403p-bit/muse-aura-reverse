package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.I0n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnPreDrawListenerC10643I0n implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public ViewTreeObserverOnPreDrawListenerC10643I0n(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        InterfaceC8368Fci interfaceC8368Fci;
        int i = this.$t;
        Object obj = this.A01;
        if (i != 0) {
            if (((C8359FcY) obj).A00.shouldKeepOnScreen()) {
                return false;
            }
            ((View) this.A00).getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        C8359FcY c8359FcY = (C8359FcY) obj;
        if (c8359FcY.A00.shouldKeepOnScreen()) {
            return false;
        }
        ((View) this.A00).getViewTreeObserver().removeOnPreDrawListener(this);
        C8364Fcd c8364Fcd = c8359FcY.A02;
        if (c8364Fcd == null || (interfaceC8368Fci = c8359FcY.A01) == null) {
            return true;
        }
        c8359FcY.A01 = null;
        c8364Fcd.A00.A00().postOnAnimation(new RunnableC8366Fcf(interfaceC8368Fci, c8364Fcd));
        return true;
    }
}
