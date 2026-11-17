package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes4.dex */
public final class AFR {
    public boolean A00;
    public F2N A01;
    public final AL9 A02;
    public final Dg3 A03;

    public final void A00() {
        ViewGroup viewGroup;
        if (this.A00) {
            return;
        }
        this.A00 = true;
        F2N f2n = this.A01;
        if (f2n != null) {
            f2n.A05(this.A03);
        }
        this.A01 = null;
        AL9 al9 = this.A02;
        ViewParent parent = al9.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.removeView(al9);
        }
        al9.A0H = null;
        al9.A0L();
    }

    public AFR(Context context, C1HY c1hy, C9n2 c9n2) {
        C1HY c1hy2;
        AnonymousClass005.A0x(c9n2, context, c1hy);
        C2290BSq c2290BSq = new C2290BSq(this, 3);
        this.A03 = c2290BSq;
        AL9 al9CreateView = c9n2.createView(context);
        this.A02 = al9CreateView;
        if (al9CreateView.getId() == -1) {
            al9CreateView.setId(View.generateViewId());
        }
        if (C8j3.A0m(c1hy) == EnumC10573Huf.A03) {
            A00();
            return;
        }
        if (!al9CreateView.A0b) {
            C1HY c1hy3 = al9CreateView.A03;
            if ((c1hy3 != null && c1hy3 != c1hy) || ((c1hy2 = al9CreateView.A04) != null && c1hy2 != c1hy)) {
                throw C3cG.A0Q("BaseMapView is already bound to a different LifecycleOwner");
            }
            al9CreateView.A03 = c1hy;
            AL9.A0G(al9CreateView);
            AL9.A0E(al9CreateView);
        }
        this.A01 = c1hy.getLifecycle();
        c1hy.getLifecycle().A04(c2290BSq);
    }
}
